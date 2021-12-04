package com.jecervantes.http_example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        final String url = "https://www.nasdaq.com/market-activity/stocks";
        //try/catch block to grab the urls of 
        try{
            final Document doc = Jsoup.connect(url).get();

            System.out.println(doc.outerHtml());
            
        }catch(Exception exception){
            //display what went wrong just in case
            exception.printStackTrace();
        }
    }
}
