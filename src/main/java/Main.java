import java.io.IOException;

public class Main {
    public static void main (String [] args) throws IOException {
        //Para leer archivo
        String path="C:\\Users\\sys_s\\Desktop\\filexs.txt";
        FileActions.readFile(path);
        System.out.println("\n \n");
        //para crear archivo
        path="C:\\Users\\sys_s\\Desktop\\fileCreado.txt";
        String content="Este texto es una nueva linea";
        FileActions.createFile(path,content);
    }
}
