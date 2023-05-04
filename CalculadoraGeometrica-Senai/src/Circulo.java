public class Circulo extends poligono{

    public Circulo(double raio){
        super(raio);
    }
    @Override
    public double area() {
        return Math.pow(Math.PI * this.lados[0], 2);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * this.lados[0];
    }
}
