
package arrays;

/**
 *
 * @author David
 */
public class Punto {
    private double x;
    private double y;
    
    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }    
    
    public String toString(){
        return "("+x+","+y+")";
    }
    
    public double distancia(Punto p){
        return Math.sqrt(Math.pow(x+p.x,2)+Math.pow(y-p.y,2));
    }
}

