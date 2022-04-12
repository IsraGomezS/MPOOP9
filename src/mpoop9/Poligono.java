package mpoop9;
/**
 * Clase que crea un Polígono abstracto
 * @author David Israel Gomez Segovia
 */
public abstract class Poligono {
    /**
     * Método abstracto para obtener el area de un polígono
     */
    public abstract float area(); // porque no tiene funcionalidad
    /**
     * Método abstracto para obtener el perimetro de un polígono
     */
    public abstract float perimetro(); // porque no tiene funcionalidad
    /**
     * Metodo que devuelve la información del poligono.
     * @return Regresa la información del poligono como String.
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
}
