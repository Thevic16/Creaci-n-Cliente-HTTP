package edu.pucmm.eict.util;

//c) Indicar la cantidad de imágenes (img) dentro de los párrafos que
//contiene el archivo HTML.

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class OperacionC extends Base{

    private Document doc;

    public OperacionC(Document doc) {
        this.doc = doc;
    }

    @Override
    public void EjecutarOperacion() throws IOException {
        int amountImg = 0;

        Elements paragraphs = doc.getElementsByTag("p");

        for (Element paragraph : paragraphs) {
            Elements paragraphImages = paragraph.getElementsByTag("img");
            amountImg = amountImg + paragraphImages.size();
        }

        System.out.println(amountImg);
    }
}
