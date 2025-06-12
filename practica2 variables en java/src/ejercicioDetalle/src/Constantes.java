public class Constantes {
    public static void main(String[] args) {
        System.out.println("constantes ");
        //LAS CONSTANTES SE DECLARAN EN MAYUSCULAS
        final int DIAS_EN_SEMANA = 7;

        System.out.println("DIAS_EN_SEMANA = " + DIAS_EN_SEMANA);

        //DIAS_EN_SEMANA = 8;  error
        final var PI = 3.1416;
        System.out.println("PI = " + PI);
        System.out.println("math.Pi " + Math.PI);//constantes ya definidas
        final var MENSAJE_BIENVENIDA = "Bienveniodo ";
        System.out.println("MENSAJE_BIENVENIDA = " + MENSAJE_BIENVENIDA);
        final var   MINUTO_POR_SEGUNDO = 60;
        System.out.println("MINUTO_POR_SEGUNDO = " + MINUTO_POR_SEGUNDO);
    }
}
