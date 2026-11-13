package ProyectoFormas.bl.entidades;

public abstract class Figura implements Forma{

    public Figura() {

    }

    @Override
    public abstract double calcularPerimetro();
    @Override
    public abstract double calcularArea();
    @Override
    public void imprimirInformacion(){
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Area: " + calcularArea());
    }
}
