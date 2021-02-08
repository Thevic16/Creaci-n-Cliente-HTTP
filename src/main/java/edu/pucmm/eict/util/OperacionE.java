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

    private Document doc;

    public OperacionE(Document doc) {
        this.doc = doc;
    }

    @Override
    public void EjecutarOperacion() throws IOException {
        int contForm =1;
        int contInput =1;
        //System.out.println(doc.toString());

        Elements forms = doc.getElementsByTag("form");

        for (Element form : forms) {
            Elements inputs = form.getElementsByTag("input");
            System.out.println("Form numero "+contForm);
            for (Element input: inputs) {
                System.out.println(" Input numero "+contInput+" del form numero "+contForm);
                System.out.println("  Tipo="+input.attr("type"));
                contInput = contInput +1;
            }
            contInput = 1;
            contForm = contForm +1;
            System.out.println(" ");
        }

    }
}
