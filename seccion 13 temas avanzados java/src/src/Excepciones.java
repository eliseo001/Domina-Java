public class Excepciones {
    public static void main(String[] args) {
        System.out.println("exepciones");
        int valor1 = 10,valor2 =0;
        try {
            var resultaedo = valor1/valor2;
            System.out.println("resultado= "+ resultaedo);
        }catch (Exception e){
            System.out.println("Ocurrio un error: "+ e);
        }


    }
}
