package ProyectoFormas.bl.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Coleccion implements Forma {

    private List<Figura> figuras;
    private List<Cuerpo> cuerpos;

    public Coleccion() {
        this.figuras = new ArrayList<>();
        this.cuerpos = new ArrayList<>();
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }

    public List<Cuerpo> getCuerpos() {
        return cuerpos;
    }

    public void setCuerpos(List<Cuerpo> cuerpos) {
        this.cuerpos = cuerpos;
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public void agregarCuerpo(Cuerpo cuerpo) {
        cuerpos.add(cuerpo);
    }

    @Override
    public double calcularPerimetro() {
        double total = 0;

        for (Figura figura : figuras) {
            total += figura.calcularPerimetro();
        }

        for (Cuerpo cuerpo : cuerpos) {
            total += cuerpo.calcularPerimetro();
        }

        return total;
    }

    @Override
    public double calcularArea() {
        double total = 0;

        for (Figura figura : figuras) {
            total += figura.calcularArea();
        }

        for (Cuerpo cuerpo : cuerpos) {
            total += cuerpo.calcularArea();
        }

        return total;
    }

    public double calcularVolumen() {
        double total = 0;

        for (Cuerpo cuerpo : cuerpos) {
            total += cuerpo.calcularVolumen();
        }

        return total;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Area: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Coleccion otra = (Coleccion) obj;

        return Objects.equals(figuras, otra.figuras) &&
                Objects.equals(cuerpos, otra.cuerpos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(figuras, cuerpos);
    }

    @Override
    public String toString() {
        return "Coleccion{" +
                "figuras = " + figuras +
                ", cuerpos = " + cuerpos +
                '}';
    }
}