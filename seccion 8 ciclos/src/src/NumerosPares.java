public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("Numeros pares e impares con while");

        var contador =1;
        while (contador<=20){
            if (contador%2==0){
                System.out.println("contador: "+contador+ " es par");
            contador++;
            }else{
                System.out.println("contador: "+contador+ " es impar");
                contador++;
            }

        }
    }
}
