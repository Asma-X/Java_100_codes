package FileOperations;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\TestFiles\\resume.txt");
        // File f = new File("../myfile.txt");

        // File f = new File("D:\\TestFiles");
        // System.out.println(Arrays.toString(f.list()));// printing all folders and
        // files names
        // System.out.println(Arrays.toString(f.listFiles())); // printing all folders
        // and files paths

        // File f = new File("./asma"); //mkdir
        // //File f = new File("./asma/Babe"); // mkdirs
        // f.mkdir(); // create directory
        //// f.mkdirs();

        // System.out.println(f.createNewFile());
        // System.out.println(f.exists());
        // System.out.println(f.delete());
        // if (f.exists())
        // f.delete();
        // System.out.println(f.createNewFile());
        // System.out.println(f.isHidden());
        // System.out.println(f.canWrite());
        // f.setWritable(true); // write mode
        System.out.println(new Date(f.lastModified()));
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
    }
}
