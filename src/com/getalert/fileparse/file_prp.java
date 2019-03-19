package com.getalert.fileparse;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
public class file_prp {
    public static void SimpleExample(){
        File file = new File("C:\\scripts\\wk_files\\ProfileTrace.gait");

        System.out.println("Name: " + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Size: " + file.length());
        System.out.println("Last modified: " + new Date(file.lastModified()));
    }

    /* Ignore
    * ****
    * */
    public static void main(String[] args) throws IOException, ParseException {
        SimpleExample();
        /*ComplexExample()*/
    }
}
