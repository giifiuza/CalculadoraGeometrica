public class Quadrado extends poligono{


    public Quadrado(double lado){
        super(lado);
    }

    @Override
    public double area() {
        return Math.pow(this.lados[0], 2);
    }

    @Override
    public double perimetro() {
        return this.lados[0]*4;
    }

}
