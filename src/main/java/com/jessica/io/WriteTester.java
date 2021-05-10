package com.jessica.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {
        File jkDir = new File("D:\\kj");
        jkDir.mkdir();
        FileWriter fw = new FileWriter("D:\\kj\\output.txt");
        fw.write("abc");
        fw.flush();
        fw.close();
    }
}
