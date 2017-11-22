
package cadenas;

import utilidades.Entrada;

/**
 *
 * @author David
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        String palabra, minus;
        
        System.out.print("Escribe una palabra: ");
        palabra=Entrada.cadena();

        minus=palabra.toLowerCase();

        if (minus.contains("a") && minus.contains("e") && minus.contains("i") && minus.contains("o") && minus.contains("u")){
            System.out.println(palabra+" es panvocálica");
        } else {
            System.out.println(palabra+" no es panvocálica");
        }
    }
}
