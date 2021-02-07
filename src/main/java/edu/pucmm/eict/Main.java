package edu.pucmm.eict;

import edu.pucmm.eict.util.OperacionA;
import edu.pucmm.eict.util.OperacionB;
import edu.pucmm.eict.util.OperacionC;
import edu.pucmm.eict.util.OperacionD;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

            String uri = "https://avathartech.com/";
            Document doc = Jsoup.connect(uri).get();

            //Ejecutando operacion A.
            //new OperacionA(uri).EjecutarOperacion();

            //Ejecutando operacion B.
            //new OperacionB(doc).EjecutarOperacion();

            //Ejecutando operacion C.
            //new OperacionC(doc).EjecutarOperacion();

            //Ejecutando operacion D.
            new OperacionD(doc).EjecutarOperacion();
    }

}
