package edu.pucmm.eict;

import edu.pucmm.eict.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.Scanner;
import java.net.URL;


public class Main {

    public static void main(String[] args)  {

            try {
                //String url = "https://en.wikipedia.org/wiki/History_of_Wikipedia";
                //String url = args[0];

                Scanner input = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Entre la url:");

                String url = input.nextLine();  // Read user input
                Document doc = Jsoup.connect(url).get();

                input.close();

                switch(isValid(url)) {
                    case 1:
                        //Ejecutando operacion A.
                        //new OperacionA(url).EjecutarOperacion();

                        //Ejecutando operacion B.
                        new OperacionB(doc).EjecutarOperacion();

                        //Ejecutando operacion C.
                        new OperacionC(doc).EjecutarOperacion();

                        //Ejecutando operacion D.
                        new OperacionD(doc).EjecutarOperacion();

                        //Ejecutando operacion E.
                        new OperacionE(doc).EjecutarOperacion();

                        //Ejecutando operacion F.
                        //new OperacionF(doc).EjecutarOperacion();

                        break;

                    case 0:
                        System.out.println("La url ingresada no es valida.");
                        break;
                }

            } catch (Exception e){
                System.out.println(e);
                System.out.println("Algo salio mal....");
            }
    }

    /* Returns true if url is valid */
    public static int isValid(String url)
    {
        /* Try creating a valid URL */
        try {
            new URL(url).toURI();
            return 1;
        }

        // If there was an Exception
        // while creating URL object
        catch (Exception e) {
            return 0;
        }
    }

}
