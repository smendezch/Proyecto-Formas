package ProyectoFormas.bl.entidades;

public abstract class Cuerpo implements Forma {

    public Cuerpo() {

    }

    @Override
    public abstract double calcularPerimetro();

    @Override
    public abstract double calcularArea();

    public abstract double calcularVolumen();

    @Override
    public void imprimirInformacion() {
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Area: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }

}