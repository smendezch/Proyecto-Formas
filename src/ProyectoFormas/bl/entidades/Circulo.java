package ProyectoFormas.bl.entidades;

import java.util.Objects;

public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio){
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
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Circulo otro = (Circulo) obj;
        return Double.compare(radio, otro.radio) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(radio);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "Radio =" + radio +
                '}';
    }
}
