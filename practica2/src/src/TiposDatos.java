public class TiposDatos {

    public static void main(String[] args) {
        //tipos de datos enteros
        byte tipoByte = 12; //hasta el numero 127

        System.out.println("tipoByte = " + tipoByte);

        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);

        int tipoInt = 2147383647;
        System.out.println("tipoInt = " + tipoInt);

        long tipoLong = 9876543212334241L; //se le agrega una l
        System.out.println("tipoLong = " + tipoLong);

        //Punto flotante
        float tipoFloat = 3.14F; //se utilisza "F" para indicar que es tipo floaT
        System.out.println("tipoFloat = " + tipoFloat);

        double tipoDouble = 3.1343D; //Se utiliza "D" para indica que es un tipo double
        System.out.println("tipoDouble = " + tipoDouble);
        
        
        //caracter
        char tipoChar = 'A'; //caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);

        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);


        //tipos object
        String nombre= null;
        System.out.println("nombre = " + nombre);

        nombre = "Eliseo";
        System.out.println("nombre = " + nombre);
    }

}


