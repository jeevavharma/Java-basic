import java.io.File;
import java.io.FileWriter;
public class FileWriting {
    public static void main(String[] args) {
        try{
            File f = new File("Example.txt");
            FileWriter fw = new FileWriter(f);
            fw.write("Hello code io viewers! hi this is jeeva");
            fw.close();
        }
        catch (Exception E){

        }

    }
}
