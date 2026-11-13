package ProyectoFormas.bl.entidades;

public class Equilatero extends Triangulo {

    public Equilatero(double lado) {
        super(lado, lado, lado);
    }

    public double getLado() {
        return getLado1();
    }

    public void setLado(double lado) {
        setLado1(lado);
    }

    @Override
    public void setLado1(double lado1) {
        super.setLado1(lado1);
        super.setLado2(lado1);
        super.setLado3(lado1);
    }

    @Override
    public void setLado2(double lado2) {
        super.setLado1(lado2);
        super.setLado2(lado2);
        super.setLado3(lado2);
    }

    @Override
    public void setLado3(double lado3) {
        super.setLado1(lado3);
        super.setLado2(lado3);
        super.setLado3(lado3);
    }
}