import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        System.out.println("Sets");
        Set<String>conjunto = new TreeSet<>();
        conjunto.add("jose");
        conjunto.add("jose");
        conjunto.add("manuel");
        conjunto.add("victoria");

        System.out.println("Elemento del set");
        conjunto.forEach(System.out::println);

        //remover elementos
        conjunto.remove("manuel");
        System.out.println("\nnuevos elementos del Set");
        conjunto.forEach(System.out::println);
    }
}
