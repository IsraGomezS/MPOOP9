package actividadExtra;

/**
 * Clase que crea un auto.
 * @author Ddavid Israel Gómez Segovia
 */
public class Auto {
    private int numRuedas, numPuertas, anioLanzamiento;
    private String modelo;
    
    /**
     * Constructor vacío.
     */
    public Auto() {
    }
    
    /**
     * Constructor con parámetros que crea un auto.
     * @param numRuedas Número de ruedas del auto.
     * @param numPuertas Número de puertas del auto.
     * @param anioLanzamiento Año de lanzamiento del auto.
     * @param modelo Modelo de auto.
     */
    public Auto(int numRuedas, int numPuertas, int anioLanzamiento, String modelo) {
        this.numRuedas = numRuedas;
        this.numPuertas = numPuertas;
        this.anioLanzamiento = anioLanzamiento;
        this.modelo = modelo;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    //MÉTODOS DEFINIDOS POR EL PROGRAMADOR
    
    /**
     * Método que indica cuando el auto va al frente.
     */
    public void irAlFrente(){
        System.out.println("El auto va hacia el frente.");
    }
    
    /**
     * Método que indica cuando el auto frena.
     */
    public void frenar(){
        System.out.println("El auto está frenando.");
    }
    
     /**
     * Método que indica cuando el auto enciende sus faros.
     */
    public void encenderFaros(){
        System.out.println("El coche enciende sus faros.");
    }
    
     /**
      * Método que asigna una posición en el auto al pasajero que recibe como argumento.
      * @param pasajero Tipo de dato SerVivo que se clasifica en un lugar dentro del auto.
      */
    public void asignarAsiento(SerVivo pasajero){
        if(pasajero instanceof Mascota){
            System.out.println("Esta mascota va en las cajas transportadoras de los asientos traseros.");
            //System.out.println(pasajero);
        }
        
        else if(pasajero instanceof Piloto){
            System.out.println("El pasajero va al frente trás el volante, es el piloto.");
        }
        
        else{
             System.out.println("El pasajero va al frente junto al piloto, es el copiloto.");   
                } 
    }
    
    /**
     * Método que devuelve la información del auto.
     * @return Devuelve la informacion del auto en forma de String.
     */
    @Override
    public String toString() {
        return "Auto{" + "numRuedas=" + numRuedas + ", numPuertas=" + numPuertas + ", anioLanzamiento=" + anioLanzamiento + ", modelo=" + modelo + '}';
    }
}