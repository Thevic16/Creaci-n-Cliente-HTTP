package edu.pucmm.eict.util;

// a) Indicar la cantidad de lineas del recurso retornado.

import org.apache.http.HttpEntity;
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
        int c = 0;
        int t = str.length();
        for (int i = 0; i < t; ++i) {
            char l = str.charAt(i);
            if (l ==  '\n') ++c;
        }
        return c+1;
    }
}
