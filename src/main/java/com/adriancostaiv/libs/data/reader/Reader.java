package com.adriancostaiv.libs.data.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Reader {
    public static String readURLToString(String urlstring) throws IOException {
        URL oracle = new URL(urlstring);
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        String inputLine;
        String allLines = "";
        while ((inputLine = in.readLine()) != null){
            allLines = allLines + inputLine + "\r\n";
        }
        in.close();
        return allLines;
    }
}
