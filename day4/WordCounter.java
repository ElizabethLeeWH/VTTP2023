import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCounter {
    public static void main (String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("./road_not_taken.txt");
        InputStreamReader file = new InputStreamReader(fis);
        try (BufferedReader bf = new BufferedReader(file)) {
            String line = bf.readLine();
            int count = 0;
            while (line != null){
                String[] word = line.split(" ");
                for (String w: word){
                    count++;
                }
                line = bf.readLine();                
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            System.out.println("IO Exception");
        }        
    }
}

