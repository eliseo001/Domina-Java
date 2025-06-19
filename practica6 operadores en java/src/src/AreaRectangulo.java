import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        System.out.println("Calculo area y perimetro de un rectangulo");



        var sc = new Scanner(System.in);
        System.out.print("Ingresa la base del rectangulo: ");
        var base = sc.nextDouble();
        System.out.print("ingresa la altura del rectangulo: ");
        var altura = sc.nextDouble();

        var area = base *altura;
        var perimetro = 2*(base +altura);
        System.out.printf("""
                %nCalculo de area y perimetro del rectangulo
                %n------------------
                Altura: %.2f
                Base: %.2f 
                Area: %.2f
                Perimetro: %.2f
                """, altura,base,area, perimetro);

    }
}
