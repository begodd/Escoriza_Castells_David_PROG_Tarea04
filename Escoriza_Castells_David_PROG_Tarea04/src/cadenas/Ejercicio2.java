package cadenas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utilidades.Entrada;

/**
 *
 * @author David
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        String matricula;
               
        System.out.print("Escribe una matrícula: ");
        matricula=Entrada.cadena();
        
        Pattern p = Pattern.compile("[0-9]{4}[a-zA-Z]{3}");
        Matcher m=p.matcher(matricula);

        Pattern p2 = Pattern.compile("[^aeiouAEIOU]{3}");
        Matcher m2=p2.matcher(matricula.substring(4, 7));
        
        if (m.matches()){
            if (m2.matches()){
                System.out.println("La matrícula con dígitos '"+matricula.substring(0,4)+"' y letras '"+matricula.substring(4,7)+"' es válida.");
            } else {
                System.out.println(matricula+" no es una matrícula valida.");
            }
        } else {
                System.out.println(matricula+" no es una matrícula valida.");
        }
    }
}
