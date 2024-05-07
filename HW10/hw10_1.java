import java.io.File;
import java.io.IOException;

public class hw10_1{
    public static void main(String[] args){
        File dir =new File("dir");
        dir.mkdir();
        File fl=new File(dir,"fl.txt");
        try{
            fl.createNewFile();

        }catch(IOException e){;}
        File newDir=new File("newDir");
        dir.renameTo(newDir);
    }
}