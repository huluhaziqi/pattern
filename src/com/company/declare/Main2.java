package com.company.declare;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.io.*;

public class Main2 {

    public static void main(String[] args) {
        int c ;
        try {
            File file = new File("text.txt");
            if(!file.exists()){
               throw new FileNotFoundException();
            }
            InputStream in = new LowerCaseInputStream(new LineInputStream(new FileInputStream("text.txt")));
            try {
                while ((c = in.read()) >=0){
                    System.out.print((char)c);
                }
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
