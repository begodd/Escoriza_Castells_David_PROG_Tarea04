package arrays;

import java.awt.BorderLayout;
import utilidades.Entrada;

/**
 *
 * @author David
 */
public class Principal {
    public static void main(String[] args) {
        int cantidad, mayores = 0, menores = 0, menor = 0, mayor = 0;
        Triangulo array[];
        Punto A, B, C;
        double suma = 0, media;
        
        System.out.print("Indica cuántos triángulos quieres generar: ");
        
        do {
            cantidad=Entrada.entero();
        
            if (cantidad<=0){
                System.out.print("No es un número válido. Introduce un número mayor que 0: ");
            }
        } while (cantidad<=0);
      
        array=new Triangulo[cantidad];
                
        for (int i=0; i<cantidad; i++){
            A=new Punto((Math.random()*100), (Math.random()*100));
            B=new Punto((Math.random()*100), (Math.random()*100));
            C=new Punto((Math.random()*100), (Math.random()*100));
            array[i]=new Triangulo(A,B,C);
            
        }
        
        for (int i=0; i<cantidad; i++){
            suma+=array[i].perimetro();
        }
        
        media=suma/cantidad;
        System.out.println("La media de los perímetros es "+media);

        
        for (int i=0; i<cantidad; i++){
            if (array[i].perimetro()>=media){
                mayores+=1;
            } else {
                menores+=1;
            }
            if (array[i].perimetro()>mayor){
                mayor=i;
            }
            if (array[i].perimetro()<menor){
                menor=i;
            }
        }
        
        System.out.println("Hay "+mayores+" triángulos mayores o iguales a la media.");
        System.out.println("Hay "+menores+" triángulos menores a la media.");
        System.out.println("El triángulo con mayor perímetro es "+array[mayor].toString());
        System.out.println("El triángulo con menor perímetro es "+array[menor].toString());
        
    }
}
