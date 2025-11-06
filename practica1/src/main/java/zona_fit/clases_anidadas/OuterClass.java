package zona_fit.clases_anidadas;

import com.sun.java.accessibility.util.TopLevelWindowListener;

public class OuterClass {
    static String outerField = "Outer field";
    static String staticOuterField = "Other field";

    class InnerClass {
        void accessMembers(){
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    static class StaticNestedClass {
        void accessMembers(OuterClass outer) {
            System.out.println(outerField);
          //  System.out.println(outer.staticOuterField);

        }
    }


    public static void main(String[] args) {
        System.out.println("Inner class:");
        System.out.println("------------");
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.accessMembers();

        System.out.println("\nStatic nested class:");
        System.out.println("--------------------");
        StaticNestedClass staticNestedObject = new StaticNestedClass();
        staticNestedObject.accessMembers(outerObject);

        System.out.println("\nTop-level class:");
        System.out.println("----------------");
        TopLevelClass topLevelClass = new TopLevelClass();
        topLevelClass.accessMembers(outerObject);

    }
}
