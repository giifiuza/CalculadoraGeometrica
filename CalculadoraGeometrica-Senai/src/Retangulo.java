public class Retangulo extends poligono{

    public Retangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        return this.lados[0]*this.lados[1];
    }

    @Override
    public double perimetro() {
        return (this.lados[0]+this.lados[1])*2;
    }
}
