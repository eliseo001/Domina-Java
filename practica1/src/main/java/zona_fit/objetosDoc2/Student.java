package zona_fit.objetosDoc2;

public class Student {
    private String name;
    private int age;
    private String major;

    //Deafult constructor
    public Student() {
        name = "Unknow";
        age = 0;
        major = "Undeclared";
    }

    //constructor with name only
    public Student(String studentName){
        name = studentName;

        age  = 18; //default age

        major = "Undeclared";
    }

    //constructor with name and age
    public Student(String studentName, int studentAge){
        name = studentName;

        age = studentAge;

        major = "Undeclared";
    }

    //constructor with all parameters
    public Student(String studentName, int studentAge, String studentMajor){
        name = studentName;

        age = studentAge;

        major = studentMajor;
    }

    public void displayInfo(){
        System.out.println("Name:" + name + " Age:" + age + " Major:" + major);
    }

    public void changeMajor(String newMajor){
        major = newMajor;

        System.out.println(name + " change major to: " + newMajor);
    }

    public static void main(String[] args) {
        var student1 = new Student(); //Default

        var student2 = new Student("Alice"); //name only

        var student3 = new Student("Bob", 20); //name and age

        var student4 = new Student("Carl", 30, "Undeclared"); //all parameters

        student1.displayInfo();

        student2.displayInfo();

        student3.displayInfo();

        student4.displayInfo();

        //modifie objects
        System.out.println("\n=== After Changes ===");

        student2.changeMajor("Matematics");

        student3.changeMajor("Physics");
    }
}
