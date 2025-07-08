package primera_parte.aritemetica_aplicacion;

public class Aritmetica {
    private int operando1;
    private int operando2;
    //constructor vacio
    public Aritmetica(){

    }



    //sobrecarga de constructores
    public Aritmetica(int operando1,int operando2){
        //System.out.println("Ejecutando constructor");
        this.operando1 =operando1;
        this.operando2 =operando2;
       // System.out.println("operador this: "+this);
    }
    public void sumar(){
        var resultado = this.operando1 + this.operando2;
        System.out.println("la suma es: "+resultado);
    }
    public void resta(){
        var resultado = this.operando1 - this.operando2;
        System.out.println("la resta es: "+resultado);
    }
    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }
    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

}

