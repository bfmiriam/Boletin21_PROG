
package boletin21;

import java.io.IOException;


public class Boletin21 {

   
    public static void main(String[] args) throws IOException {
       
        
        Metodos palabras = new Metodos();
        
        palabras.engadirPalabras();
        palabras.ordenarPalabras();
        palabras.crearFicheiro();
    }
    
}
