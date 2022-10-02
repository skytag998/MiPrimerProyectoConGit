import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class VideojuegosTest extends TestCase {
    @Mock
    Videojuegos videoJMock;

    @Test
    public void testGetID_Juego() {
        when(videoJMock.getID_Juego()).thenReturn(1L);
        long valActual= videoJMock.getID_Juego();
        assertEquals(valActual,1);
    }
    @Test
    public void testSetID_Juego() {
        Mockito.doCallRealMethod().when(videoJMock).setID_Juego(10);
        long valAct= Mockito.doCallRealMethod().when(videoJMock).getID_Juego();
        assertEquals(0,valAct);
    }
    @Test
    public void testGetNombreJuego() {
        String GameNameInsert="Cod WZ";
        String GameCheck ="Cod WZ";
        when(videoJMock.getNombreJuego()).thenReturn(GameNameInsert);
        String gameName = videoJMock.getNombreJuego();
        assertEquals(gameName,GameCheck);
    }

    public void testSetNombreJuego() {
    }

    public void testGetAnioLanzamiento() {
    }

    public void testSetAnioLanzamiento() {
    }

    public void testGetSinopsis() {
    }

    public void testSetSinopsis() {
    }

    public void testGetClasificacion() {
    }

    public void testSetClasificacion() {
    }

    public void testTestToString() {
    }
}