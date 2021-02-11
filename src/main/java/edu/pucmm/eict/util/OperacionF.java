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

    public OperacionF(Document doc) {
        this.doc = doc;
    }

    @Override
    public void EjecutarOperacion() throws IOException {
        boolean isPost = false;


        //System.out.println(doc.toString());

        Elements forms = doc.getElementsByTag("form");

        for (Element form : forms) {
            if(form.attr("method").toLowerCase(Locale.ROOT).equals("post")){
                isPost = true;

                Document doc1 = Jsoup.connect(form.absUrl("action"))
                        .data("asignatura", "practica1")
                        .header("matricula","20171408")
                        .post();

                System.out.println("Respuesta del servidor: ");
                System.out.println(doc1.toString());
            }
        }

        if(!isPost){
            System.out.println("No se encontro ningun formulario con el método de envio POST.");
        }

    }
}