package actividadExtra;

/**
 * Clase que crea a una Persona abstracta.
 * @author David Israel Gómez Segovia.
 */
public abstract class Persona extends SerVivo{
    Mascota mascota;
    
    /**
     * Constructor vacío.
     */
    public Persona() {
    }
    
    /**
     * Constructor con parámetros que crea una persona y se hereda de la clase SerVivo.
     * @param mascota La mascota de la persona que es un tipo de dato Mascota.
     * @param nombre Nombre de la persona.
     * @param edad Edad de la persona.
     */
    public Persona(Mascota mascota, String nombre, int edad) {
        super(nombre, edad);
        this.mascota = mascota;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
 
    /**
     * Método que devuelve la información de la Persona.
     * @return Devuelve la informacion de la persona en forma de String.
     */
    @Override
    public String toString() {
        return super.toString() + "\nPersona{" + '}';
    }
}