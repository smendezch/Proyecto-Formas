package ProyectoFormas.bl.entidades;

import java.util.Objects;

public class Cuadrado extends Rectangulo{

    public Cuadrado(double lado){
        super(lado,lado);
    }

    public double getLado(){
        return getBase();
    }

    public void setLado(double lado){
        setBase(lado);
    }

    @Override
    public void setBase(double base){
        super.setBase(base);
        super.setAltura(base);
    }

    @Override
    public void setAltura(double altura){
        super.setAltura(altura);
        super.setBase(altura);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        Cuadrado otro = (Cuadrado) obj;
        return Double.compare(getLado(), otro.getLado()) == 0;
    }

    @Override
    public int hashCode(){
        return Objects.hash(getLado());
    }

    @Override
    public String toString(){
        return "Cuadrado{" +
                "lado =" + getLado() +
                '}';
    }

}
