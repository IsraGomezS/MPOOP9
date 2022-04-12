package actividadExtra;

/**
 * Clase que crea un copiloto.
 * @author Danna Blanco, David Gómez, David Montoya
 */
public class Copiloto extends Persona{
    private float dinero;
    
    /**
     * Constructor vacío.
     */
    public Copiloto() {
    }
    
    /**
     * Constructor con parámetros que crea un copiloto y se hereda de la clase Persona.
     * @param dinero Dinero del copiloto que lleva consigo.
     * @param mascota La mascota del copiloto que es un tipo de dato Mascota.
     * @param nombre Nombre del copiloto.
     * @param edad Edad del copiloto.
     */
    public Copiloto(float dinero, Mascota mascota, String nombre, int edad) {
        super(mascota, nombre, edad);
        this.dinero = dinero;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    //MÉTODOS DEFINIDOS POR EL PROGRAMADOR
    
     /**
     * Método que indica cuando el copiloto cierra las ventanas.
     */
    public void cerrarVentanas(){
        System.out.println("El copiloto cierra las ventanas.");
    }
    
    /**
     * Método que indica cuando el copiloto pasa su comida a los pasajeros.
     */
    public void pasarComida(){
        System.out.println("El copiloto le pasa su comida a los pasajeros.");
    }
    
    /**
     * Método que indica cuando el copiloto regaña a los pasajeros.
     */
    public void reganiar(){
        System.out.println("El copiloto regaña a los pasajeros.");
    }
    
    /**
     * Método que devuelve la información del copiloto.
     * @return Devuelve la informacion del copiloto en forma de String.
     */
    @Override
    public String toString() {
        return super.toString() + "\nCopiloto{" + "dinero=" + dinero + '}';
    }

    @Override
    public String repirar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}