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

        var acumulativo2=0;
        int a=0;
        for(a=0;a<=MAXIMO;a++){
            acumulativo2 += a;
            System.out.println("acumulador2 + numero ->"+acumulativo2+"+"+a);

            System.out.println("suma parcial2: "+acumulativo2);

        }
        System.out.println("La suma de los primeros2 " +MAXIMO+" son: "+acumulativo2);

        var acumulativo3=0;
        var c=0;
        do {
            acumulativo3 += c++;
            System.out.println("acumulador3 + numero ->"+acumulativo3+"+"+c);

            System.out.println("suma parcial3: "+acumulativo3);

        }while (c<=MAXIMO);
        System.out.println("La suma de los primeros3 " +MAXIMO+" son: "+acumulativo3);
    }




}
