public class Rectangulo extends Figura {
    private double base;
    private double altura;
    public Rectangulo (double b, double h){
        this.base = b;
        this.altura = h;
    }
    public double area(){
        return this.base * this.altura;
    }
}
