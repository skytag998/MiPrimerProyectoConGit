public class Videojuegos {
    private long ID_Juego ;
    private String NombreJuego;
    private int AnioLanzamiento;
    private String sinopsis;
    private char clasificacion;
    public long getID_Juego() {
        return ID_Juego;
    }
    public void setID_Juego(long ID_Juego) {
        this.ID_Juego = ID_Juego;
    }
    public String getNombreJuego() {
        return NombreJuego;
    }
    public void setNombreJuego(String nombreJuego) {
        NombreJuego = nombreJuego;
    }
    public int getAnioLanzamiento() {
        return AnioLanzamiento;
    }
    public void setAnioLanzamiento(int anioLanzamiento) {
        AnioLanzamiento = anioLanzamiento;
    }
    public String getSinopsis() {
        return sinopsis;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    public char getClasificacion() {
        return clasificacion;
    }
    public void setClasificacion(char clasificacion) {
        this.clasificacion = clasificacion;
    }
    public Videojuegos(long ID_Juego, String nombreJuego, int anioLanzamiento, String sinopsis, char clasificacion) {
        this.ID_Juego = ID_Juego;
        NombreJuego = nombreJuego;
        AnioLanzamiento = anioLanzamiento;
        this.sinopsis = sinopsis;
        this.clasificacion = clasificacion;
    }
    @Override
    public String toString() {
        return "Videojuegos{" +
                "ID_Juego=" + ID_Juego +
                ", NombreJuego='" + NombreJuego + '\'' +
                ", AnioLanzamiento=" + AnioLanzamiento +
                ", sinopsis='" + sinopsis + '\'' +
                ", clasificacion=" + clasificacion +
                '}';
    }
}