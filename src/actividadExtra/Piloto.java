package actividadExtra;

/**
 * Clase que crea a un piloto.
 * @author David Israel Gómez Segovia
 */
public class Piloto extends Persona{
    private int noLicencia;
    
    /**
     * Constructor vacío.
     */
    public Piloto() {
    }
    
    /**
     * Constructor con parámetros que crea un piloto y se hereda de la clase Persona.
     * @param noLicencia Número de licencia del piloto.
     * @param mascota La mascota del piloto que es un tipo de dato Mascota.
     * @param nombre Nombre del piloto.
     * @param edad Edad del piloto.
     */
    public Piloto(int noLicencia, Mascota mascota, String nombre, int edad) {
        super(mascota, nombre, edad);
        this.noLicencia = noLicencia;
    }

    public int getNoLicencia() {
        return noLicencia;
    }

    public void setNoLicencia(int noLicencia) {
        this.noLicencia = noLicencia;
    }

    //MÉTODOS DEFINIDOS POR EL PROGRAMADOR
    
    /**
     * Método que indica cuando el piloto conduce.
     */
    public void conducir(){
        System.out.println("El piloto conduce por la calle.");
    }
    
    /**
     * Método que indica cuando el piloto pone el seguro a las puertas.
     */
    public void ponerSegurosPuertas(){
        System.out.println("El piloto pone los seguro de las puertas.");
    }
    
    /**
     * Método que indica cuando el piloto pasa a comprar comida al Drive Through de un restaurante.
     * @param restaurante Restaurante donde el piloto pasa a comprar comida.
     */
    public void pasarPorDriveThrough(String restaurante){
        System.out.println("El piloto va a pasar a comprar comida en "+restaurante);
    }
    
    /**
     * Método que devuelve la información del piloto.
     * @return Devuelve la informacion del piloto en forma de String.
     */
    @Override
    public String toString() {
        return super.toString() + "\nPiloto{" + "noLicencia=" + noLicencia + '}';
    }

    @Override
    public String repirar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
