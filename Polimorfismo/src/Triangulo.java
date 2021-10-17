
public class Triangulo extends Figura {
    private double base;
    private double altura;
    public Triangulo (double b, double h){
        this.base=b;
        this.altura=h;
    }
    public double area (){
        return ((this.base * this.altura)/2);
    }
}
