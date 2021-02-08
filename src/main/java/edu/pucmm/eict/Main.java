package edu.pucmm.eict;

import edu.pucmm.eict.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {

    public static void main(String[] args)  {

            try {
                String url = "https://en.wikipedia.org/wiki/History_of_Wikipedia";
                //String url = args[0];

                Document doc = Jsoup.connect(url).get();

                //Ejecutando operacion A.
                //new OperacionA(url).EjecutarOperacion();

                //Ejecutando operacion B.
                //new OperacionB(doc).EjecutarOperacion();

                //Ejecutando operacion C.
                //new OperacionC(doc).EjecutarOperacion();

                //Ejecutando operacion D.
                //new OperacionD(doc).EjecutarOperacion();

                //Ejecutando operacion E.
                //new OperacionE(doc).EjecutarOperacion();

                //Ejecutando operacion F.
                //new OperacionF(doc,url).EjecutarOperacion();

            } catch (Exception e){
                System.out.println(e);
                System.out.println("Algo salio mal....");
            }
    }

}
