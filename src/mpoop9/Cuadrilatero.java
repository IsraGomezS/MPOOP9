package mpoop9;
/**
 * Clase que crea un Cuadrilatero.
 * @author David Israel Gomez Segovia
 */
public class Cuadrilatero extends Poligono{
    private int alfa,beta;
    private float a,b;
    private float base,altura;
    /**
     * Constructor vacío.
     */
    public Cuadrilatero() {
    }
    /**
     * Constructor que recibe parámetros.
     * @param base Base del Cuadrilatero.
     * @param altura Altura del Cuadrilatero
     */
    public Cuadrilatero(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }

    public int getBeta() {
        return beta;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Polimorfismo sobrecargado del método area de la clase Poligono.
     * @return Regresa el valor del área del Cuadrilatero.
     */
    @Override
    public float area() {
        return base*altura;
    }
    /**
     * Polimorfismo sobrecargado del método perímetro de la clase Poligono
     * @return Regresa el valor del perímetro del Cuadrilatero.
     */
    @Override
    public float perimetro() {
        return 2*base + 2*altura;
    }
    /**
     * Método que devuelve la información del Triangulo.
     * @return Regresa la información del Cuadrilatero como String.
     */
    @Override
    public String toString() {
        return super.toString() + "Cuadrilatero{" + '}';
    } 
}