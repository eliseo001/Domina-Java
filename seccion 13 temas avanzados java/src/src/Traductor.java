public interface Traductor {

    //publi y abstract
    void traducir();

    //metodos con implementacion por default

    default void iniciarTraductor(){
        System.out.println("iniciando traductor...");
    }
}

class Ingles implements Traductor{
    @Override
    public void traducir(){
        System.out.println("traduzco a ingles");
    }
}
class Frances implements Traductor{
    public void traducir(){
        System.out.println("traduzco a frances");
    }
    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando traductor en frances");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles=new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();
        //traductor en frances
        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();


    }
}
