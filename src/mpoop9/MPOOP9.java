package mpoop9;

import actividadExtra.Auto;
import actividadExtra.Copiloto;
import actividadExtra.Gato;
import actividadExtra.Perro;
import actividadExtra.Piloto;

/**
 * Clase principal
 * @author David Israel Gomez Segovia
 */
public class MPOOP9 {

    public static void main(String[] args) {
        // Poligono pol = new Poligono(); X No se puede porque no  
        // se pueden instanciar clases abstractas
        Triangulo triangulo = new Triangulo(); // Crea un Triangulo que se llama triangulo
        System.out.println(triangulo);
        Cuadrilatero cuadrilatero = new Cuadrilatero();
        System.out.println(cuadrilatero);
        
        System.out.println(triangulo.getBase());
        Triangulo triangulo2 = triangulo; // Apuntan a la misma direccion de memoria
        System.out.println(triangulo2.getBase());
        triangulo2.setBase(9);
        System.out.println(triangulo2.getBase());
        System.out.println(triangulo.getBase());
        
        triangulo2.setBase(triangulo.getBase());
        
        System.out.println("########## Actividades extra ###########");
        
        //Implementar clases generadas en el diagrama de clases e instanciarlas.
        
        System.out.println("\n-------------- Perro --------------");
        Perro perro  = new Perro(true, true, true, "Café", "Mestizo", "Verdes", "Laila", 5);
        System.out.println(perro);
        
        System.out.println("\n-------------- Gato --------------");
        Gato gato = new Gato( true , true , false, "azul", "chino", "verde", "Misifus", 2);
        System.out.println(gato);
        
        System.out.println("\n-------------- Piloto --------------");
        Piloto piloto = new Piloto(121,perro,"Omar Cruz",27);
        System.out.println(piloto);
        
        System.out.println("\n-------------- Copiloto --------------");
        Copiloto copiloto = new Copiloto(2185,gato,"Lara Croft",23);
        System.out.println(copiloto);
        
        System.out.println("\n-------------- Auto --------------");
        Auto auto = new Auto(4,4,2021,"Corolla");
        System.out.println(auto);
         
        System.out.println("\n-------------- Asignando lugar a los pasajeros de un auto --------------");
        auto.asignarAsiento(perro);
        auto.asignarAsiento(gato);
        auto.asignarAsiento(piloto);
        auto.asignarAsiento(copiloto);
    }
}