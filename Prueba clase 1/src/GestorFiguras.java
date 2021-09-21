import java.util.Arrays;
public class GestorFiguras {

    public static double Suma(Figura[] i) {
        double resultado = 0;
        for (Figura f : i) {
            resultado = resultado + f.area();
        }
        System.out.println("La suma de areas es de: " + resultado);
        return resultado;
    }

    public static void Sort(Figura[] i) {
        Arrays.sort (i);
    }

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(10, 5);
        Triangulo triangulo = new Triangulo(7,8);
        Cuadrado cuadrado = new Cuadrado (6);
        Circulo circulo = new Circulo(7);
        Figura [] vector ={rectangulo, triangulo, cuadrado, circulo} ;
        GestorFiguras.Suma(vector);
        GestorFiguras.Sort(vector);
    }
}