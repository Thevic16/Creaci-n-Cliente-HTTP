package edu.pucmm.eict;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * A simple example, used on the jsoup website.
 */
public class Wikipedia {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://en.wikipedia.org/wiki/Ayle").get();
        //log(doc.title());

        /*
        Elements newsHeadlines = doc.select("#mp-itn b a");
        for (Element headline : newsHeadlines) {
            log("%s\n\t%s", headline.attr("title"), headline.absUrl("href"));
        }
        */

        System.out.println(doc.toString());
        //System.out.println(countLines(doc.toString()));
    }

    private static void log(String msg, String... vals) {
        System.out.println(String.format(msg, vals));
    }

    public static int countLines(String str) {
        int count = 0;
        int total = str.length();
        for (int i = 0; i < total; ++i) {
            char letter = str.charAt(i);
            if (letter ==  '\n') ++count;
        }
        return count;
    }
}
