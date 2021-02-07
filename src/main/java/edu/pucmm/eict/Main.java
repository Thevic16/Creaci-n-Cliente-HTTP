package edu.pucmm.eict;

import edu.pucmm.eict.util.OperacionA;
import edu.pucmm.eict.util.OperacionB;
import edu.pucmm.eict.util.OperacionC;
import edu.pucmm.eict.util.OperacionD;


import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

            String uri = "https://avathartech.com/";

            //Ejecutando operacion A.
            new OperacionA(uri).EjecutarOperacion();

            //Ejecutando operacion B.
            //new OperacionB(response).EjecutarOperacion();

            //Ejecutando operacion C.
            //new OperacionC(response).EjecutarOperacion();

            //Ejecutando operacion D.
            //new OperacionD(uri).EjecutarOperacion();

    }

}
