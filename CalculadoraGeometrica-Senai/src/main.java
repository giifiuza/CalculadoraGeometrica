import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\n-=-=-=-=-CALCULADORA GEOMÉTRICA-=-=-=-=-");
            System.out.print("[1] - CÍRCULO\n" +
                    "[2] - QUADRADO\n" +
                    "[3] - TRIÂNGULO\n" +
                    "[4] - RETÂNGULO\n" +
                    "[5] - PENTÁGONO\n" +
                    "[6] - EXIT\n" +
                    "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n"+
                    "Choose an option: ");
            int op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    System.out.print("Input the side: ");
                    double lado = sc.nextDouble();
                    Circulo circulo = new Circulo(lado);
                    System.out.printf("A area é: %.2f", circulo.area());
                    System.out.println(" ");
                    System.out.printf("O perimetro é: %.2f", circulo.perimetro());
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.print("Input the side: ");
                    double ladoQuad = sc.nextDouble();
                    Quadrado quadrado = new Quadrado(ladoQuad);
                    System.out.printf("A area é: %.2f", quadrado.area());
                    System.out.println(" ");
                    System.out.printf("O perimetro: %.2f", quadrado.perimetro());
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.print("Input the side: ");
                    double ladoTri = sc.nextDouble();
                    System.out.print("Input the side: ");
                    double ladoTri2 = sc.nextDouble();
                    System.out.print("Input the side: ");
                    double ladoTri3 = sc.nextDouble();
                    Triangulo triangulo = new Triangulo(ladoTri, ladoTri2, ladoTri3);
                    System.out.printf("A area é: %.2f", triangulo.area());
                    System.out.println(" ");
                    System.out.printf("O perimetro: %.2f", triangulo.perimetro());
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.print("Input the height: ");
                    double alturaRetan = sc.nextDouble();
                    System.out.print("Input the base: ");
                    double baseRetan = sc.nextDouble();
                    Retangulo retangulo = new Retangulo(alturaRetan,baseRetan);
                    System.out.printf("A area é: %.2f", retangulo.area());
                    System.out.println(" ");
                    System.out.printf("O perimetro é: %.2f", retangulo.perimetro());
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.print("Input the size: ");
                    double ladoPent = sc.nextDouble();
                    Pentagono pentagono = new Pentagono(ladoPent);
                    System.out.printf("A area é: %.2f", pentagono.area());
                    System.out.println(" ");
                    System.out.printf("O perimetro é: %.2f", pentagono.perimetro());
                    System.out.println(" ");
                    break;
                case 6:
                    break;

            }
        }

    }
}