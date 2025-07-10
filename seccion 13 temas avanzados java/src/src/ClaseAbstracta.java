public class ClaseAbstracta {
    public static void main(String[] args) {
//FiguraGeometrica figuraGeometrica = new FiguraGeometrica(); //error no se puede intanciar
        FiguraGeometrica figuraGeometrica= new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica= new Circulo();
        figuraGeometrica.dibujar();

    }
}

//clase abstracta
abstract class FiguraGeometrica{//las clases abtractas no se pueden instancia
    public abstract void dibujar();


}


class Rectangulo extends FiguraGeometrica{
    public void dibujar(){
        System.out.println("Se debe dibuja un rectangulo");

    }

}

class Circulo extends FiguraGeometrica{

    public void dibujar(){
        System.out.println("se debe dibujar un circulo");
    }
}
