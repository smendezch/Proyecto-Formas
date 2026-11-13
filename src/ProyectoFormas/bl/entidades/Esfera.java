package ProyectoFormas.bl.entidades;

public class Esfera extends Cuerpo {

    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularVolumen() {
        return 4.0 / 3.0 * Math.PI * Math.pow(radio, 3);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Esfera otra = (Esfera) obj;

        return Double.compare(radio, otra.radio) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(radio);
    }

    @Override
    public String toString() {
        return "Esfera{" +
                "radio = " + radio +
                '}';
    }
}