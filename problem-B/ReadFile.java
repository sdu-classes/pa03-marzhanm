import java.io.*;
import java.util.Scanner;

public class ReadFile{
    public static String[] readFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner s = new Scanner(file);

        String[] lines = new String[1000];
        int lineCounter = 0;

        while (s.hasNextLine()){
            String line = s.nextLine();
            lines[lineCounter] = line;
            lineCounter++;
        }
        s.close();
        return lines;
    }
    
    public static void Main(String[] args){
       try {
        
        String relPath = "files" + File.separator + "test.txt";
        String absPath = "/code/sdu/pa03-marzhanm/problem-b/test.txt";
        for (String line: lines) {
            if (line == null){
                break;
            }
            System.out.println(line);
        } }
        catch (FileNotFoundException exc) {
            System.out.println("Your file does not exist.");
        }
        catch (NullPointerException exc) {
            System.out.println("Your file cannot be null");
        }
    
    }
}
