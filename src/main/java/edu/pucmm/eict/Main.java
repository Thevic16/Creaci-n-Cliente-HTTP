package edu.pucmm.eict;

import edu.pucmm.eict.util.OperacionA;
import edu.pucmm.eict.util.OperacionB;
import edu.pucmm.eict.util.OperacionC;
import edu.pucmm.eict.util.OperacionD;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        CloseableHttpClient httpClient = HttpClients.createDefault();

        try {

            String uri = "https://avathartech.com/";
            HttpGet request = new HttpGet(uri);

            CloseableHttpResponse response = httpClient.execute(request);


            //Ejecutando operacion A.
            //new OperacionA(response).EjecutarOperacion();

            //Ejecutando operacion B.
            //new OperacionB(response).EjecutarOperacion();

            //Ejecutando operacion C.
            //new OperacionC(response).EjecutarOperacion();

            //Ejecutando operacion D.
            new OperacionD(uri).EjecutarOperacion();


            response.close();

        } finally {
            httpClient.close();
        }

    }

}
