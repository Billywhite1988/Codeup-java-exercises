package util;

import javax.tools.StandardLocation;
import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class FileHelper {

    public static List<String> slurp(String filepath) {
        List<String> data = new ArrayList<>();


        try {
            data = Files.readAllLines(Paths.get(filepath));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        return data;


    }

    public static void spit(String filename, List<String> contents) {
        try {
            Files.write(Paths.get(filename), contents, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }


    public static void spit(String filename, List<String> contents, boolean append) {
        try {
            Files.write(Paths.get(filename), contents, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void makeExciting(String filename) {
        List<String> data = new ArrayList<>();
        for (String line : slurp(filename)) {
            data.add(line.toUpperCase() + "!");
        }
        spit(filename + ".exciting", data);
    }

    public static void main(String[] args) {
        List<String> test = Arrays.asList("Abcd", "Efg", "Hijk");
        spit("test", test);
        makeExciting("test");
        System.out.println(test);
    }
}
        //Move file to a new location


//        InputStream in = null;
////        OutputStream out = null;
////
////        try {
////
////            File oldFile = new File("/Users/user/IdeaProjects/codeup-java-exercises/src/util/FileHelper.java");
////            File newFile = new File("/Users/user/IdeaProjects/codeup-java-exercises/src/shapes/Circle.java");
////
////            in = new FileInputStream(oldFile);
////            out = new FileOutputStream(newFile);
////
////            byte[] moveBuff = new byte[1024];
////
////            int butesRead;
////
////            while ((butesRead = in.read(moveBuff)) > 0) {
////                out.write(moveBuff, 0, butesRead);
////            }
////
////            in.close();
////            out.close();
////
////            oldFile.delete();
////
////            System.out.println("The File was successfully moved to the new folder");
////
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////    }
