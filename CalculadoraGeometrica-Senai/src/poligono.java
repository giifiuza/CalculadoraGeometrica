public abstract class poligono {

    double[] lados;

    public abstract double area();
    public abstract double perimetro();

    public poligono(double... lados){
        this.lados = lados;
    }


}
