package actividadExtra;

/**
 * Clase que crea un SerVivo abstracto.
 * @author David Israel Gómez Segovia
 */
public abstract class SerVivo {
    private String nombre;
    private int edad;
    
    /**
     * Constructor vacío.
     */
    public SerVivo() {
    }

    /**
     * Constructor con parámetros que crea un SerVivo.
     * @param nombre Nombre del SerVivo.
     * @param edad Edad del SerVivo.
     */
    public SerVivo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //MÉTODOS DEFINIDOS POR EL PROGRAMADOR
    
    /**
     * Método que indica cuando el ser vivo respira.
     * @return 
     */
    public abstract String repirar();
    //{  return "Estoy respirando";}

    /**
     * Método que indica cuando el ser vivo duerme.
     * @return Retorna la cadena "Estoy durmiendo"
     */
    public String dormir(){ 
        return "Estoy durmiendo";
    }
    
    /**
     * Método que indica cuando el ser vivo come.
     * @return Retorna la cadena "Estoy comiendo"
     */
    public String comer(){ 
        return "Estoy comiendo"; 
    }

     /**
     * Método que devuelve la información del SerVivo.
     * @return Devuelve la informacion del SerVivo en forma de String.
     */
    @Override
    public String toString() {
        return "\nSerVivo{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
}
