package segunda_parte.animales;

public class Animal {
    //protected solamente deja que accedan al metodo las clases hijas
    protected void comer(){
        System.out.println("como muchas veces al dia");
    }
    protected void dormir(){
        System.out.println("Duermo muchas horas");
    }
    protected void hacerSonido(){ //en este caso hacerSonido utiliza polimorfismo por que adopta diferentes formas en sus clases heredadas
        System.out.println("El animal hace un sonido");
    }
}
//perro tambien hereda los metodos comer y dormir
class Perro extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("El perro ladrar");
    }
    @Override  //Override sobreescribe el metodo
    protected void dormir(){// sobre escritura del metodo heredado de la clase padre
        System.out.println("Suermo 15 horas al dias");
        System.out.println("metodo de la clase padre");
        super.dormir();//esto llama el metodo original de la clase padre
    }
}

class Gato extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("El gato maulla");
    }

}
     class PruebaAnimal {


    //metodo polimorfico
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }
    public static void main(String[] args) {
        System.out.println("Prueba animal herencia");

        var animal1= new Animal();
        animal1.comer();
        //perro1.hacerSonido// este metodo  existe en al clase hija
        var perro1= new Perro();
        perro1.hacerSonido();// la clase perro es la clase hija y haceden a los metodos de la clase padre
        perro1.dormir();
        var gato1= new Gato();
        animal1.hacerSonido();
        gato1.hacerSonido();

        System.out.println("Prueba polimorfismo");
        //objeto clase padre (Animal)
        var animal = new Animal();
        imprimirSonido(animal);
        imprimirSonido(perro1);
        imprimirSonido(gato1);


    }
}
