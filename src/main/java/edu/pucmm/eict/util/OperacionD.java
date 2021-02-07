package edu.pucmm.eict.util;

//d) indicar la cantidad de formularios (form) que contiene el HTML por
        //categorizando por el método implementado POST o GET.

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Locale;

public class OperacionD extends Base{

    private CloseableHttpResponse response;

    public OperacionD(CloseableHttpResponse response) {
        this.response = response;
    }

    @Override
    public void EjecutarOperacion() throws IOException {
        String result = "";
        int amountGet = 0;
        int amountPost = 0;
        int contPrueba = 0;
        HttpEntity entity = response.getEntity();

        if (entity != null) {
            // return it as a String
            result = EntityUtils.toString(entity);
        }

        Document doc = Jsoup.parse(result);

        Element content = doc.getElementById("content");
        Elements forms = content.getElementsByTag("form");

        for (Element form : forms) {
            if(form.attr("method").toLowerCase(Locale.ROOT) == "get"){
                amountGet = amountGet +1;
            }

            if(form.attr("method").toLowerCase(Locale.ROOT) == "post"){
                amountPost = amountPost +1;
            }
            contPrueba = contPrueba +1;
        }

        System.out.println("Cantidad de form: "+(amountGet+amountPost));
        System.out.println("Cantidad de form que implementan el metodo GET: "+amountGet);
        System.out.println("Cantidad de form que implementan el metodo POST: "+amountPost);
        System.out.println(contPrueba);
    }
}

