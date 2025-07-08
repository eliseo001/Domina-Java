package primera_parte.prueba;

import primera_parte.aritemetica_aplicacion.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("ejemple aritmetica");

        var aritmetica1 = new Aritmetica(5,8);
        var aritmetica2 = new Aritmetica(12,16);
        //   aritmetica1.operando1=5;
        //  aritmetica1.operando2=8;
        //aritmetica2.operando1=12;
        //aritmetica2.operando2=16;
        System.out.println("Atributo operando1: "+aritmetica1.getOperando1());
        aritmetica1.sumar();
        aritmetica1.resta();

        aritmetica2.sumar();
        aritmetica2.resta();

        //constructor vacio

        var aritmetica3= new Aritmetica();
        aritmetica3.setOperando1(8);
        aritmetica3.setOperando2(10);
        aritmetica3.sumar();
      //  System.out.println("Dir. men obj1: "+aritmetica1);
        //creamos un segundo opbjeto

        var aritmetica4 = new Aritmetica(12,16);
        //System.out.println("Dir. men obj1: "+aritmetica4);


    }
}
