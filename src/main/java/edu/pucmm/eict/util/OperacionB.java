package edu.pucmm.eict.util;

// b) Indicar la cantidad de párrafos (p) que contiene el documento HTML.

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class OperacionB extends Base{

    private Document doc;

    public OperacionB(Document doc) {
        this.doc = doc;
    }

    @Override
    public void EjecutarOperacion() throws IOException {
        Elements paragraphs = doc.getElementsByTag("p");

        // for para imprimir el texto contenido en los parrafos.
        /*
        for (Element paragraph : paragraphs) {
            String Text = paragraph.text();
            System.out.println(Text);
        }
        */
        System.out.println(paragraphs.size());
    }
}
