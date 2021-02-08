package edu.pucmm.eict.util;

//d) indicar la cantidad de formularios (form) que contiene el HTML por
        //categorizando por el método implementado POST o GET.

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Locale;

public class OperacionD extends Base{

    private Document doc;

    public OperacionD(Document doc) {
        this.doc = doc;
    }

    @Override
    public void EjecutarOperacion() throws IOException {
        int amountGet = 0;
        int amountPost = 0;

        //System.out.println(doc.toString());
        Elements forms = doc.getElementsByTag("form");

        for (Element form : forms) {

            if(form.attr("method").toLowerCase(Locale.ROOT).equals("get")){
                amountGet = amountGet +1;
            }

            if(form.attr("method").toLowerCase(Locale.ROOT).equals("post")){
                amountPost = amountPost +1;
            }
        }

        System.out.println("Cantidad de formularios: "+(amountGet+amountPost));
        System.out.println("Cantidad de formularios que implementan el metodo GET: "+amountGet);
        System.out.println("Cantidad de formularios que implementan el metodo POST: "+amountPost);
    }
}

