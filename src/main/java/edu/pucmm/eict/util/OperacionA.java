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

    private CloseableHttpResponse response;

    public OperacionA(CloseableHttpResponse response) {
        this.response = response;
    }

    @Override
    public void EjecutarOperacion() throws IOException {

        HttpEntity entity = response.getEntity();
        if (entity != null) {
            // return it as a String
            String result = EntityUtils.toString(entity);
            System.out.println("La cantidad de lineas del recurso retornado es: "+ countLines(result));
            //System.out.println(result);
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
