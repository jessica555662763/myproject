package com.jessica.io;

import java.io.*;

public class ReadTester {
    public static void main(String[] args) {
        try {
            BufferedReader br =new BufferedReader(new FileReader("data.txt"));
            String line = br.readLine();
            while (line!=null){
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        inputstream();
//        fileReader();

    }

    private static void fileReader() {
        try {
            FileReader fr = new FileReader("data.txt");
            int n = fr.read();
            while(n!=-1){
                System.out.println((char)n);
                n= fr.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inputstream() {
        File file = new File("data.txt");
        System.out.println( file.exists());
        System.out.println(file.getAbsoluteFile());
        FileInputStream is= null;
        try {
            is = new FileInputStream(file);
            int n = is.read();
            while(n!=-1){
                System.out.println((char)n);
                n= is.read();
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

