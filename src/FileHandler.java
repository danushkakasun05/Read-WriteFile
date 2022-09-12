import com.sun.jdi.IntegerValue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class FileHandler {
    private Path faths;
    public FileHandler(Path t) {
        this.faths=t;

    }

    public void writeFile(Student std) throws IOException {
        String fileContent = Files.readString(faths);
        String out=fileContent+std.toFileFormat();
        Files.writeString(this.faths,out);
    }
    public List<Student> readFile() throws IOException{
        String fileContent= Files.readString(this.faths);
        fileContent= fileContent.substring(0,fileContent.length()-1);
        String[] Student=fileContent.split("#");
        System.out.println();
        List<String[]> std =  new ArrayList<>();
        List<Student> students= new ArrayList<>();
        for( int i=0;i<Student.length;i++) {
            std.add(Student[i].split("/"));
        }
        for (int j=0;j<std.size();j++){
            String name = std.get(j)[0].split("=")[1];
            String address = (std.get(j)[1].split("=")[1]);
            String age = std.get(j)[2].split("=")[1];
            Student st = new Student(name,address,Integer.valueOf(age));
            students.add(st);

        }
        return students;

            //String name = String.valueOf(Student[i].split("*")[1]);
            //int age =Integer.getInteger(Student[i])
        }

    }



