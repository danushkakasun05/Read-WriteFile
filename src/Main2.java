import java.nio.file.Path;
import java.nio.file.Paths;
public class Main2 {
    public static void main(String[] args) {
        try {
            Path Filepath1 = Paths.get("E:\\ProgramInterlij\\fileReadAndWrite\\src\\danushka.txt");
            Student std1 = new Student("Kasun", "Aranayaka",27 );
            Student std2 = new Student("kalana","Mathara",28);

            FileHandler fh = new FileHandler(Filepath1);
            fh.writeFile(std1);
            fh.writeFile(std2);
            System.out.println(fh.readFile().get(3).getName());
        }catch(Exception e){
            System.out.println("error "+e);
        }

    }
}
