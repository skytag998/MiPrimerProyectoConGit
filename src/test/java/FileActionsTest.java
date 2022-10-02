import junit.framework.TestCase;
import java.io.File;
import java.io.IOException;

public class FileActionsTest extends TestCase {
    public void testReadFile() {
        String pathx = "C:\\Users\\sys_s\\Desktop\\filexs.txt";
        String contenido = null;
        try {
            contenido = FileActions.readFile(pathx);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertEquals("Este texto es una nueva linea", contenido);
    }
    public void testCreateFile() throws IOException {
        String texto = "Este es el texto de prueba";
        String path="C:\\Users\\sys_s\\Desktop\\filexs.txt";
        File file = new File(path);
        if(!file.exists()){
            file.createNewFile();
        }
        assertTrue(file.exists());
    }
}