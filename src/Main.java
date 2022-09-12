import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        try {
            Path filepaths = Paths.get("E:\\ProgramInterlij\\fileReadAndWrite\\src\\kasun.txt");
            String FileContent = Files.readString(filepaths);
            System.out.println(FileContent);
            String text =FileContent+ "graduated from university of Moratuwa";
            Files.writeString(filepaths,text);

        }catch(IOException e){
            e.printStackTrace();
        }

    }

}
