package actividadExtra;
/**
 * Clase que crea un perro.
 * @author David Israel Gómez Segovia
 */
public class Perro extends Mascota{
    private boolean colaCortada;
    private boolean correa;
    private boolean hueso;
    
    /**
     * Constructor vacío.
     */
    public Perro() {
    }
     /**
      * Constructor con parámetros que crea un perro y se hereda de la clase Mascota.
      * @param colaCortada Indica como booleano si el perro tiene la cola cortada.
      * @param correa Indica como booleano si el perro usa correa.
      * @param hueso Indica como booleano si el perro tiene un hueso para jugar y morder.
      * @param color Color de la mascota.
      * @param raza Raza de la mascota.
      * @param colorOjos Color de ojos de la mascota.
      * @param nombre Nombre de la mascota.
      * @param edad Edad de la mascota.
      */
    public Perro(boolean colaCortada, boolean correa, boolean hueso, String color, String raza, String colorOjos, String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
        this.colaCortada = colaCortada;
        this.correa = correa;
        this.hueso = hueso;
    }

    public boolean isColaCortada() {
        return colaCortada;
    }

    public void setColaCortada(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }

    public boolean isCorrea() {
        return correa;
    }

    public void setCorrea(boolean correa) {
        this.correa = correa;
    }

    public boolean isHueso() {
        return hueso;
    }

    public void setHueso(boolean hueso) {
        this.hueso = hueso;
    }
    
    //MÉTODOS DEFINIDOS POR EL PROGRAMADOR
    
    /**
     * Método que indica cuando el perro corre.
     * @return Retorna la acción que realiza la mascota como cadena.
     */
    public String correr(){
        return "Estoy corriendo";
    }
    
    /**
     * Método que indica cuando el perro esconde su hueso.
     * @return Retorna la acción que realiza la mascota como cadena.
     */
    public String esconderHueso(){
        return "Estoy escondiendo mi hueso";
    }
    
    /**
     * Método que indica cuando el perro muede su correa.
     * @return Retorna la acción que realiza la mascota como cadena.
     */
    public String morderCorrea(){
        return "Estoy mordiendo mi correa";
    }
    
    /**
     * Método que indica cuando el perro ladra.
     * @return Retorna la acción que realiza la mascota como cadena.
     */
    public String ladrar(){
        return "Estoy ladrando";
    }
    
    /**
     * Método que devuelve la información del perro.
     * @return Devuelve la informacion del perro en forma de String.
     */
    @Override
    public String toString() {
        return super.toString() + "\nPerro{" + "colaCortada=" + colaCortada + ", correa=" + correa + ", hueso=" + hueso + '}';
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