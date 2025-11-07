package zona_fit.clasesAnonimas;

public class HelloWordAnonymousClasses {

    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }

    public void sayHello(){

        class englishGreeting implements HelloWorld {
            String name  = "word";

            public void greet() {
                greetSomeone("word");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }
        HelloWorld helloWorld = new englishGreeting();

        HelloWorld franchGreeting = new HelloWorld() {
            String name = "tout le monde";

            public void greet() {
                greetSomeone("tout le monde");
            }

            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salud " + name);
            }

        };

        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("hola " + name);
            }
        };

        helloWorld.greet();
        franchGreeting.greet();
        spanishGreeting.greet();
    }

    public static void main(String[] args) {
        HelloWordAnonymousClasses myApp = new HelloWordAnonymousClasses();
        myApp.sayHello();
    }
}
