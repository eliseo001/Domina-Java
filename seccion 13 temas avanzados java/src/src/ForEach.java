public class ForEach {
    public static void main(String[] args) {
        System.out.println("ForEach");
        int edades[] ={5,10,30,45,60};
        //for each  //each significa cada elemento
        for (int edad:edades){ //la desventaja es que perdemos el indice
            System.out.println(edad);
        }
    }
}
