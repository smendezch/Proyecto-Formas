package ProyectoFormas.bl.entidades;

public class Isosceles extends Triangulo {

    public Isosceles(double ladoIgual, double base) {
        super(ladoIgual, ladoIgual, base);
    }

    public double getLadoIgual() {
        return getLado1();
    }

    public void setLadoIgual(double ladoIgual) {
        setLado1(ladoIgual);
    }

    public double getBase() {
        return getLado3();
    }

    public void setBase(double base) {
        setLado3(base);
    }

    @Override
    public void setLado1(double lado1) {
        super.setLado1(lado1);
        super.setLado2(lado1);
    }

    @Override
    public void setLado2(double lado2) {
        super.setLado1(lado2);
        super.setLado2(lado2);
    }
}