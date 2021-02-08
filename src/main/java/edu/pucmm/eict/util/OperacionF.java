package edu.pucmm.eict.util;

//f) Para cada formulario “parseado”, identificar que el método de envío
//del formulario sea POST y enviar una petición al servidor con el
//parámetro llamado asignatura y valor practica1 y un header llamado
//matricula con el valor correspondiente a matrícula asignada. Debe
//mostrar la respuesta por la salida estándar.

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Locale;

public class OperacionF extends Base{

    private Document doc;
    private String url;

    public OperacionF(Document doc,String url) {
        this.doc = doc;
        this.url =url;
    }

    @Override
    public void EjecutarOperacion() throws IOException {
        boolean isPost = false;


        //System.out.println(doc.toString());

        Elements forms = doc.getElementsByTag("form");

        for (Element form : forms) {
            if(form.attr("method").toLowerCase(Locale.ROOT).equals("post")){
                isPost = true;
            }
        }

        if(isPost){
            Document doc1 = Jsoup.connect(url)
                    .data("asignatura", "practica1")
                    .header("matricula","20171408")
                    .get();

            System.out.println("Respuesta del servidor: "+doc1.toString());
        }
        else {
            System.out.println("No se encontro ningun formulario con el metodo de envio POST.");
        }

    }
}