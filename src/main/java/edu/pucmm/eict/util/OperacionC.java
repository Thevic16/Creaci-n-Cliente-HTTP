package edu.pucmm.eict.util;

//c) Indicar la cantidad de imágenes (img) dentro de los párrafos que
//contiene el archivo HTML.

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class OperacionC extends Base{

    private CloseableHttpResponse response;

    public OperacionC(CloseableHttpResponse response) {
        this.response = response;
    }

    @Override
    public void EjecutarOperacion() throws IOException {
        String result = "";
        int amountImg = 0;
        HttpEntity entity = response.getEntity();

        if (entity != null) {
            // return it as a String
            result = EntityUtils.toString(entity);
        }

        Document doc = Jsoup.parse(result);

        Element content = doc.getElementById("content");
        Elements paragraphs = content.getElementsByTag("p");

        for (Element paragraph : paragraphs) {
            Elements paragraphImages = paragraph.getElementsByTag("img");
            amountImg = amountImg + paragraphImages.size();
        }

        System.out.println(amountImg);
    }
}
