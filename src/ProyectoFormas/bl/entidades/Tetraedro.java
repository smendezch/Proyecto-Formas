package ProyectoFormas.bl.entidades;

import java.util.Objects;

public class Tetraedro extends Cuerpo {

    private Equilatero cara;

    public Tetraedro(double lado) {
        this.cara = new Equilatero(lado);
    }

    public Equilatero getCara() {
        return cara;
    }

    public void setCara(Equilatero cara) {
        this.cara = cara;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * cara.calcularPerimetro() / 2;
    }

    @Override
    public double calcularArea() {
        return 4 * cara.calcularArea();
    }

    @Override
    public double calcularVolumen() {
        double altura = cara.getLado() * Math.sqrt(6) / 3;
        return cara.calcularArea() * altura / 3;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Tetraedro otro = (Tetraedro) obj;

        return Objects.equals(cara, otro.cara);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cara);
    }

    @Override
    public String toString() {
        return "Tetraedro{" +
                "cara = " + cara +
                '}';
    }
}