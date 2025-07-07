public class Aritmetica {
    int operando1;
    int operando2;
    //constructor vacio
    public Aritmetica(){

    }
    //sobrecarga de constructores
    public Aritmetica(int operando1,int operando2){
        System.out.println("Ejecutando constructor");
        this.operando1 =operando1;
        this.operando2 =operando2;
        System.out.println("operador this: "+this);
    }
    void sumar(){
        var resultado = this.operando1 + this.operando2;
        System.out.println("la suma es: "+resultado);
    }
    void resta(){
        var resultado = this.operando1 - this.operando2;
        System.out.println("la resta es: "+resultado);
    }

    public static void main(String[] args) {
        System.out.println("ejemple aritmetica");

        var aritmetica1 = new Aritmetica (5,8);
        var aritmetica2 = new Aritmetica(12,16);
        //   aritmetica1.operando1=5;
        //  aritmetica1.operando2=8;
        //aritmetica2.operando1=12;
        //aritmetica2.operando2=16;
        aritmetica1.sumar();
        aritmetica1.resta();

        aritmetica2.sumar();
        aritmetica2.resta();

        //constructor vacio

        var aritmetica3= new Aritmetica();
        aritmetica3.operando2= 8;
        aritmetica3.operando1=10;
        aritmetica3.sumar();
        System.out.println("Dir. men obj1: "+aritmetica1);
        //creamos un segundo opbjeto

        var aritmetica4 = new Aritmetica(12,16);
        System.out.println("Dir. men obj1: "+aritmetica4);


    }
}

