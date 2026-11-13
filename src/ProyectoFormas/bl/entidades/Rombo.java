package ProyectoFormas.bl.entidades;

import java.util.Objects;

public class Rombo extends Figura {

    private double diagonalMayor;
    private double diagonalMenor;

    public Rombo(double diagonalMayor, double diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double calcularPerimetro() {
        double lado = Math.sqrt(Math.pow(diagonalMayor / 2, 2)
                + Math.pow(diagonalMenor / 2, 2));
        return 4 * lado;
    }

    @Override
    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Rombo otro = (Rombo) obj;

        return Double.compare(diagonalMayor, otro.diagonalMayor) == 0 &&
                Double.compare(diagonalMenor, otro.diagonalMenor) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diagonalMayor, diagonalMenor);
    }

    @Override
    public String toString() {
        return "Rombo{" +
                "Diagonal (más larga) =" + diagonalMayor +
                ", Diagonal (más corta) =" + diagonalMenor +
                '}';
    }
}
