import java.io.*;
import java.util.*;
public class FileHandling {
    public static void main(String[] args) {
        int wordCount = 0;  // Correct variable name
        File f1 = new File("new.txt");
        // 1️⃣ File creation
        try {
            if (f1.createNewFile()) {
                System.out.println("File created: " + f1.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 2️⃣ File writing
        try {
            FileWriter fw = new FileWriter(f1);
            fw.write("Hello Guys, How are you guys? 9");  // Writing data
            fw.close();
            System.out.println("File written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 3️⃣ File reading + Word counter
        try {
            Scanner sc = new Scanner(f1);  // Reading from f1 (new.txt)
            while (sc.hasNext()) {
                System.out.println(sc.next());
                wordCount++;
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(f1.delete());
        // 4️⃣ File properties
        System.out.println("File exists: " + f1.exists());
        System.out.println("File path: " + f1.getPath());
        System.out.println("File name: " + f1.getName());
        System.out.println("Writable: " + f1.canWrite());
        System.out.println("Readable: " + f1.canRead());
        System.out.println("File size (in bytes): " + f1.length());
        System.out.println("Total Words in File: " + wordCount);
    }
}