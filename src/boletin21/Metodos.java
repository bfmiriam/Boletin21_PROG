package boletin21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Metodos {

    ArrayList<String> lista = new ArrayList();
    Scanner sc = new Scanner(System.in);
    File ficheiro;
    PrintWriter escribir;

    public void engadirPalabras() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce palabra:");
            lista.add(sc.next());
        }
    }

    public void ordenarPalabras() {

        Comparator<? super String> c = null;
        lista.sort(c);
        System.out.println(lista);
    }

    public void crearFicheiro() throws IOException {

        ficheiro = new File("palabras.txt");

        try {
            escribir = new PrintWriter(ficheiro);
            for (int i = 0; i < lista.size(); i++) {
                escribir.println((i + 1) + "." + lista.get(i));
            }
            escribir.close();
        } catch (FileNotFoundException ex) {
            System.out.println("erro1" + ex.getMessage());
        }
        sc.close();

    }
}
