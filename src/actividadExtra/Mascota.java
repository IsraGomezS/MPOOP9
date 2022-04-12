package actividadExtra;
/**
 * Clase que crea una Mascota abstracta.
 * @author Ddavid Israel Gómez Segovia
 */
public abstract class Mascota extends SerVivo{ 
    private String color;
    private String raza;
    private String colorOjos;
    
    /**
     * Constructor vacío.
     */
    public Mascota() {
    }
    
    /**
     * Constructor con parámetros que crea una mascota y se hereda de la clase SerVivo.
     * @param color Color de la mascota.
     * @param raza Raza de la mascota.
     * @param colorOjos Color de ojos de la mascota.
     * @param nombre Nombre de la mascota.
     * @param edad Edad de la mascota.
     */
    public Mascota(String color, String raza, String colorOjos, String nombre, int edad) {
        super(nombre, edad);
        this.color = color;
        this.raza = raza;
        this.colorOjos = colorOjos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
    
    //MÉTODOS DEFINIDOS POR EL PROGRAMADOR
    
    /**
     * Método que indica cuando la mascota juega.
     * @return "Estoy jugando"
     */
    public abstract String jugar();
    //{ return "Estoy jugando"; }
    
    /**
     * Método que indica cuando la mascota salta.
     * @return "Estoy saltando"
     */
    public String saltar(){
        return "Estoy saltando";
    }
    
    /**
     * Método que indica cuando la mascota marca su territorio.
     * @return "Estoy marcando territorio"
     */
    public String marcarTerritorio(){
        return "Estoy marcando territorio";
    }
    
    /**
     * Método que devuelve la información de la mascota.
     * @return Devuelve la informacion de la mascota en forma de String.
     */
    @Override
    public String toString() {
        return super.toString() + "\nMascota{" + "color=" + color + ", raza=" + raza + ", colorOjos=" + colorOjos + '}';
    }
}