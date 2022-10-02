import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileActions {
    public static String readFile(String path) throws IOException {
       byte []  bytes  = Files.readAllBytes(Paths.get(path));
       String resultado =new String(bytes, StandardCharsets.UTF_8);
       return  resultado;
    }
    public static void createFile (String path, String content) throws IOException {
        File file = new File(path);

        if(!file.exists()){
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close();
        System.out.println("EL ARCHIVO SE HA CREADO CON EXITO...");

    }

    public void WriteFile (){

    }

}
