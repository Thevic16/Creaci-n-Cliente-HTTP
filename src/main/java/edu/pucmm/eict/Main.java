package edu.pucmm.eict;

import edu.pucmm.eict.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {

    public static void main(String[] args)  {

            try {
                String uri = "https://avathartech.com/";
                Document doc = Jsoup.connect(uri).get();

                //Ejecutando operacion A.
                //new OperacionA(uri).EjecutarOperacion();

                //Ejecutando operacion B.
                //new OperacionB(doc).EjecutarOperacion();

                //Ejecutando operacion C.
                //new OperacionC(doc).EjecutarOperacion();

                //Ejecutando operacion D.
                //new OperacionD(doc).EjecutarOperacion();

                //Ejecutando operacion E.
                new OperacionE(doc).EjecutarOperacion();

            } catch (Exception e){
                System.out.println(e);
                System.out.println("Algo salio mal....");
            }

    }

}
