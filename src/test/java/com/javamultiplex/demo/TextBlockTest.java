package com.javamultiplex.demo;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 01/03/22 1:00 AM
 * @copyright www.javamultiplex.com
 */
public class TextBlockTest {


    @Test
    public void shouldWriteHtmlWithoutTextBlock(){
        String str= "<html>\n" +
                "           <head>\n" +
                "                 <title>Home</title>\n" +
                "           </head>\n" +
                "           <body>\n" +
                "                 <h1>Welcome</h1>\n" +
                "           </body>\n" +
                "</html>\n";
        System.out.println(str);
    }

    @Test
    public void shouldWriteHtmlWithTextBlock(){
        String str= """
                    <html>
                        <head>
                            <title>Home</title>
                        </head>
                        <body>
                            <h1>Welcome</h1>
                        </body>
                    </html>
                    """;
        System.out.println(str);
    }
}
