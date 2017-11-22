package arrays;

/**
 *
 * @author David
 */
public class Triangulo {
    private Punto a, b, c;

    public Triangulo(Punto a,Punto b,Punto c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public Punto getA(){
        return a;
    }
    
    public Punto getB(){
        return b;
    }
    
    public Punto getC(){
        return c;
    }

    public String toString(){
        return "A"+a.toString()+" B"+b.toString()+" C"+c.toString();
    }

}

