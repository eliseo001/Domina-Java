public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("Suma acumulativa");
        final var MAXIMO = 15;
        var i =0;
        var acumulativo =0;
        while (i<=MAXIMO){

            System.out.println("acumulador + numero ->"+acumulativo+"+"+i);
            acumulativo += i++;
            System.out.println("suma parcial: "+acumulativo);
        }
        System.out.println("La suma de los primeros " +MAXIMO+" son: "+acumulativo);
    }
}
