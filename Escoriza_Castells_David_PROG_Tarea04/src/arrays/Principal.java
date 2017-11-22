package arrays;

import utilidades.Entrada;

/**
 *
 * @author David
 */
public class Principal {
    public static void main(String[] args) {
        int cantidad;
        Triangulo array[];
        Punto A, B, C;
        
        System.out.print("Indica cuántos triángulos quieres generar: ");
        cantidad=Entrada.entero();
        array=new Triangulo[cantidad];
                
        for (int i=0; i<cantidad; i++){
            A=new Punto((Math.random()*100), (Math.random()*100));
            B=new Punto((Math.random()*100), (Math.random()*100));
            C=new Punto((Math.random()*100), (Math.random()*100));
            array[i]=new Triangulo(A,B,C);
        }
        
        
    }
}
