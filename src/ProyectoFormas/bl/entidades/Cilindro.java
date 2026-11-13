package ProyectoFormas.bl.entidades;

import java.util.Objects;

public class Cilindro extends Cuerpo {

    private Circulo baseCircular;
    private Rectangulo lateral;

    public Cilindro(double radio, double altura) {
        this.baseCircular = new Circulo(radio);
        this.lateral = new Rectangulo(baseCircular.calcularPerimetro(), altura);
    }

    public Circulo getBaseCircular() {
        return baseCircular;
    }

    public void setBaseCircular(Circulo baseCircular) {
        this.baseCircular = baseCircular;
        this.lateral = new Rectangulo(baseCircular.calcularPerimetro(),
                lateral.getAltura());
    }

    public Rectangulo getLateral() {
        return lateral;
    }

    public void setLateral(Rectangulo lateral) {
        this.lateral = lateral;
        this.baseCircular = new Circulo(lateral.getBase() / (2 * Math.PI));
    }

    @Override
    public double calcularPerimetro() {
        return 2 * baseCircular.calcularPerimetro();
    }

    @Override
    public double calcularArea() {
        return 2 * baseCircular.calcularArea() + lateral.calcularArea();
    }

    @Override
    public double calcularVolumen() {
        return baseCircular.calcularArea() * lateral.getAltura();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Cilindro otro = (Cilindro) obj;

        return Objects.equals(baseCircular, otro.baseCircular) &&
                Objects.equals(lateral, otro.lateral);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseCircular, lateral);
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "Base = " + baseCircular +
                ", lateral = " + lateral +
                '}';
    }
}