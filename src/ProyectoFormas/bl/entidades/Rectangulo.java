package ProyectoFormas.bl.entidades;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public double calcularPerimetro(){
        return 2 * (base + altura);
    }

    @Override
    public double calcularArea(){
        return base * altura;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        Rectangulo otro = (Rectangulo) obj;

        return Double.compare(base, otro.base) == 0 && Double.compare(altura, otro.altura) == 0;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(base, altura);
    }

    @Override
    public String toString() {
        return "Rectangulo{"
                + "base =" + base +
                ", altura =" + altura +
                '}';
    }
}
