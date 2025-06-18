public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("Operadores de asignacion");
            //asignacioon =
        var miNumero =10;
        int miNumero2;
        miNumero2= 15;
        //asignacion compuesto
        //+=
        miNumero +=5;//miNumero = miNumero +5
        System.out.println("miNumero = " + miNumero);
        // -=, *=, /=, %=
        miNumero *=2; //miNumero =miNumero*2 ->30
        System.out.println("miNumero = " + miNumero);
        //asignacion de variables multiples
        int a = 10, b = 15,  c= 20;
        System.out.printf("a = %d, b = %d, c = %d", a, b, c);

    }
}
