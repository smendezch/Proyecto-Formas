package ProyectoFormas.bl.entidades;

import java.util.Objects;

public class Cubo extends Cuerpo {

    private Cuadrado cara;

    public Cubo(double lado) {
        this.cara = new Cuadrado(lado);
    }

    public Cuadrado getCara() {
        return cara;
    }

    public void setCara(Cuadrado cara) {
        this.cara = cara;
    }

    @Override
    public double calcularPerimetro() {
        return 6 * cara.calcularPerimetro() / 2;
    }

    @Override
    public double calcularArea() {
        return 6 * cara.calcularArea();
    }

    @Override
    public double calcularVolumen() {
        return cara.calcularArea() * cara.getLado();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Cubo otro = (Cubo) obj;

        return Objects.equals(cara, otro.cara);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cara);
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "cara = " + cara +
                '}';
    }
}