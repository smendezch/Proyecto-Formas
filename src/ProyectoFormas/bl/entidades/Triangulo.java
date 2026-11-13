package ProyectoFormas.bl.entidades;

import java.util.Objects;

public abstract class Triangulo extends Figura {

    private double lado1;
    private double lado2;
    private double lado3;

    protected Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public static Triangulo crear(double lado1, double lado2, double lado3) {
        boolean formaTriangulo = lado1 + lado2 > lado3
                && lado1 + lado3 > lado2
                && lado2 + lado3 > lado1;

        if (!formaTriangulo) {
            throw new IllegalArgumentException(
                    "Los lados " + lado1 + ", " + lado2 + " y " + lado3
                            + " no forman un triangulo");
        }

        boolean igual12 = Double.compare(lado1, lado2) == 0;
        boolean igual13 = Double.compare(lado1, lado3) == 0;
        boolean igual23 = Double.compare(lado2, lado3) == 0;

        if (igual12 && igual13) {
            return new Equilatero(lado1);
        }

        if (igual12) {
            return new Isosceles(lado1, lado3);
        }

        if (igual13) {
            return new Isosceles(lado1, lado2);
        }

        if (igual23) {
            return new Isosceles(lado2, lado1);
        }

        return new Escaleno(lado1, lado2, lado3);
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public double calcularArea() {
        double semiperimetro = calcularPerimetro() / 2;
        return Math.sqrt(semiperimetro
                * (semiperimetro - lado1)
                * (semiperimetro - lado2)
                * (semiperimetro - lado3));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Triangulo otro = (Triangulo) obj;

        return Double.compare(lado1, otro.lado1) == 0 &&
                Double.compare(lado2, otro.lado2) == 0 &&
                Double.compare(lado3, otro.lado3) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lado1, lado2, lado3);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "Primer lado =" + lado1 +
                ", Segundo lado =" + lado2 +
                ", Tercer lado =" + lado3 +
                '}';
    }
}