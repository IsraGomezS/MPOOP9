package actividadExtra;
/**
 * Clase que crea un Gato.
 * @author David Israel Gómez Segovia
 */
public class Gato extends Mascota{
    private boolean rascadera;
    private boolean arenero;
    private boolean crias;
    
    /**
     * Constructor vacío.
     */
    public Gato() {
    }
    
    /**
     * Constructor con parámetros que crea un copiloto y se hereda de la clase Mascota.
     * @param rascadera Indica como booleano si el gato tiene rascadera.
     * @param arenero Indica como booleano si el gato tiene arenero.
     * @param crias Indica como booleano si el gato tiene crías.
     * @param color Color de la mascota.
     * @param raza Raza de la mascota.
     * @param colorOjos Color de ojos de la mascota.
     * @param nombre Nombre de la mascota.
     * @param edad Edad de la mascota.
     */
    public Gato(boolean rascadera, boolean arenero, boolean crias, String color, String raza, String colorOjos, String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
        this.rascadera = rascadera;
        this.arenero = arenero;
        this.crias = crias;
    }

    public boolean isRascadera() {
        return rascadera;
    }

    public void setRascadera(boolean rascadera) {
        this.rascadera = rascadera;
    }

    public boolean isArenero() {
        return arenero;
    }

    public void setArenero(boolean arenero) {
        this.arenero = arenero;
    }

    public boolean isCrias() {
        return crias;
    }

    public void setCrias(boolean crias) {
        this.crias = crias;
    }
    
    /**
     * Método que indica cuando el gato ronrronea.
     * @return Retorna la acción que realiza la mascota como cadena.
     */
    public String ronronear(){
        return "Estoy ronroneando";
    }
    
    /**
     * Método que indica cuando el gato trepa.
     * @return Retorna la acción que realiza la mascota como cadena.
     */
    public String trepar(){
        return "Estoy trepando";
    }
    
    /**
     * Método que indica cuando el gato rasguña.
     * @return Retorna la acción que realiza la mascota como cadena.
     */
    public String rasguniar(){
        return "Estoy rasguniando";
    }
    
    /**
     * Método que devuelve la información del gato.
     * @return Devuelve la informacion del gatoo en forma de String.
     */
    @Override
    public String toString() {
        return super.toString() + "\nGato{" + "rascadera=" + rascadera + ", arenero=" + arenero + ", crias=" + crias + '}';
    }

    @Override
    public String jugar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String repirar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}