package edu.pucmm.eict.util;

// a) Indicar la cantidad de lineas del recurso retornado.

import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class OperacionA extends Base{

    private String uri;

    public OperacionA(String uri) {
        this.uri = uri;
    }

    @Override
    public void EjecutarOperacion() throws IOException {


        CloseableHttpClient httpClient = HttpClients.createDefault();

        try {

            HttpGet request = new HttpGet(uri);

            CloseableHttpResponse response = httpClient.execute(request);


            HttpEntity entity = response.getEntity();
            if (entity != null) {
                // return it as a String
                String result = EntityUtils.toString(entity);
                System.out.println("Cantidad de lineas del recurso retornado es: "+ countLines(result));
                //System.out.println(result);
            }

            response.close();

        } finally {
            httpClient.close();
        }

    }


    public static int countLines(String str) {
        int count = 0;
        int total = str.length();
        for (int i = 0; i < total; ++i) {
            char letter = str.charAt(i);
            if (letter ==  '\n') ++count;
        }
        return count;
    }
}
