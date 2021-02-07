package edu.pucmm.eict.util;

//e) Para cada formulario mostrar los campos del tipo input y su
//respectivo tipo que contiene en el documento HTML.

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Locale;

public class OperacionE extends Base{

    private String uri;

    public OperacionE(String uri) {
        this.uri = uri;
    }

    @Override
    public void EjecutarOperacion() throws IOException {
        int amountGet = 0;
        int amountPost = 0;
        int contPrueba = 0;


        Document doc = Jsoup.connect(uri).get();

        System.out.println(doc.toString());

        //Element content = doc.getElementById("content");

        Elements forms = doc.getElementsByTag("form");

        for (Element form : forms) {

            if(form.attr("method").toLowerCase(Locale.ROOT).equals("get")){
                amountGet = amountGet +1;
            }

            if(form.attr("method").toLowerCase(Locale.ROOT).equals("post")){
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
