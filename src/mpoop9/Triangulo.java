package mpoop9;
/**
 * Clase que crea un Triangulo
 * @author David Israel Gomez Segovia
 */
public class Triangulo extends Poligono{
    private int alfa, beta, gamma;
    private float a,b,c;
    private float base,altura;
    /**
     * Constructor vacío
     */
    public Triangulo() {
    }
    /**
     * Constructor que recibe parámetros.
     * @param base Base del Triangulo
     * @param altura Altura del Triangulo
     */
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }

    public int getBeta() {
        return beta;
    }

    public int getGamma() {
        return gamma;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Polimorfismo sobrecargado del método area de la clase Poligono.
     * @return Regresa el valor del área del Triangulo.
     */
    @Override // porque esta sobre escribiendo estos metodos
    public float area() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return base+altura/2;
    }
    /**
     * Polimorfismo sobrecargado del método perímetro de la clase Poligono
     * @return Regresa el valor del perímetro del Triangulo.
     */
    @Override
    public float perimetro() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return a+b+c;
    }
    /**
     * Método que devuelve la información del Triangulo.
     * @return Regresa la información del Triangulo como String.
     */
    @Override
    public String toString() {
        return super.toString() + "Triangulo{" + '}';
    }
}
