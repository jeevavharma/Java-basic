import java.util.Scanner;
import java.io.File;
// How to read a file
// while giving scanner we can get exception error so, we gonna give try catch
// hasNextLine is used we know Nextline but has is used to check wheather the file has something or empty.
// file reading can be done only inside try catch.
class FileReading {
    public static void main(String[] args) {
        try{
            File f = new File("Example.txt");
            Scanner reader = new Scanner(f);
            while (reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
        }
        catch (Exception E){

        }


    }
}
