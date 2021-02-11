package edu.pucmm.eict;

import edu.pucmm.eict.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.util.Scanner;



public class Main {

    public static void main(String[] args)  {

            try {
                Document doc = null;
                int urlValida = 1;
                Scanner input = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Entre la url:");

                String url = input.nextLine();  // Read user input
                input.close();

                try{
                     doc = Jsoup.connect(url).get();
                }catch (Exception e){
                    urlValida = 0;
                }

                switch(urlValida) { //Verificar esto ya que no esta funcionando adecuadamente.
                    case 1:
                        System.out.println(" ");
                        System.out.println("/////////////////////OPERACIÓN (A)////////////////////////");
                        //Ejecutando operacion A.
                        new OperacionA(url).EjecutarOperacion();

                        System.out.println("/////////////////////OPERACIÓN (B)////////////////////////");
                        //Ejecutando operacion B.
                        new OperacionB(doc).EjecutarOperacion();

                        System.out.println("/////////////////////OPERACIÓN (C)////////////////////////");
                        //Ejecutando operacion C.
                        new OperacionC(doc).EjecutarOperacion();

                        System.out.println("/////////////////////OPERACIÓN (D)////////////////////////");
                        //Ejecutando operacion D.
                        new OperacionD(doc).EjecutarOperacion();

                        System.out.println("/////////////////////OPERACIÓN (E)////////////////////////");
                        //Ejecutando operacion E.
                        new OperacionE(doc).EjecutarOperacion();

                        System.out.println("/////////////////////OPERACIÓN (F)////////////////////////");
                        //Ejecutando operacion F.
                        new OperacionF(doc).EjecutarOperacion();

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
}
