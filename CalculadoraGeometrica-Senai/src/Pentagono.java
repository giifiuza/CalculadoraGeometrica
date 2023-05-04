public class Pentagono extends poligono{

    public Pentagono(double lado) {
        super(lado);
    }

    @Override
    public double area() {
        return 5 * (Math.pow(this.lados[0], 2))/(4*Math.tan(0.628319));
    }

    @Override
    public double perimetro() {
        return 5 * this.lados[0];
    }
}
