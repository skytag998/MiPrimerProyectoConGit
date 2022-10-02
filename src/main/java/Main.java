import java.io.IOException;

public class Main {
    public static void main (String [] args) throws IOException {
        //Para leer archivo
        String path="C:\\Users\\sys_s\\Desktop\\filexs.txt";
        String resultado=FileActions.readFile(path);
        System.out.println(resultado+"\n");
        //para crear archivo
        path="C:\\Users\\sys_s\\Desktop\\fileCreado.txt";
        String content="Este texto es una nueva linea";
        FileActions.createFile(path,content);
    }
}
