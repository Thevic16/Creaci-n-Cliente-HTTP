package edu.pucmm.eict.util;

// b) Indicar la cantidad de párrafos (p) que contiene el documento HTML.


import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class OperacionB extends Base{

    private CloseableHttpResponse response;

    public OperacionB(CloseableHttpResponse response) {
        this.response = response;
    }

    @Override
    public void EjecutarOperacion() throws IOException {
        String result = "";
        HttpEntity entity = response.getEntity();

        if (entity != null) {
            // return it as a String
            result = EntityUtils.toString(entity);
        }

        Document doc = Jsoup.parse(result);

        Element content = doc.getElementById("content");
        Elements paragraphs = content.getElementsByTag("p");

        for (Element paragraph : paragraphs) {
            String Text = paragraph.text();
            System.out.println(Text);
        }

        System.out.println(paragraphs.size());


    }
}
