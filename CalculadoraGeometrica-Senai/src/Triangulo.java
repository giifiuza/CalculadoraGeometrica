public class Triangulo extends poligono{
    public Triangulo(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }

    @Override
    public double area() {
        double s = (this.lados[0]+this.lados[1]+this.lados[2])/2;
        return  Math.sqrt(s*(s-this.lados[0])*(s-this.lados[1])*(s-this.lados[2]));
    }

    @Override
    public double perimetro() {
        return this.lados[0]+this.lados[1]+this.lados[2];
    }
}
