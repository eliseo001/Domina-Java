package zona_fit.enums;

public class Enums {
    //Los enums son clasesdonde todos los casos son conocidos por el compilador. Se utilizan para crear tipos que solo pueden tener pocos valores posibles.

   public enum DayOFWeek {
       MONDAY("MON"), TUESDAY("TUE"), WEDNESDAY("WED"), THURSDAY("THU"), FRIDAY("FRI"), SATURDAY("SAT"), SUNDAY("SUN");

       private final String abbreviation;

       DayOFWeek(String abbreviation) {
           this.abbreviation = abbreviation;
       }

       public String getAbbreviation() {
           return abbreviation;
       }
   }

   DayOFWeek weekStart = DayOFWeek.MONDAY;

    public static void main(String[] args) {

        Enums myExample = new Enums();

        if(myExample.weekStart == DayOFWeek.MONDAY){
            System.out.println("The week starts on Monday");
        }

        DayOFWeek someDay = DayOFWeek.SUNDAY;

        switch (someDay){
            case MONDAY -> System.out.println("The week just started.");
            case TUESDAY, WEDNESDAY, THURSDAY -> System.out.println("We are somewhere in the midle of the week.");
            case FRIDAY -> System.out.println("The weekend is near.");
            case SATURDAY, SUNDAY -> System.out.println("Weekend");
            default -> throw new AssertionError("Should not happend");
        }


        String text = switch (someDay) {
            case MONDAY -> "The week just started.";
            case TUESDAY, WEDNESDAY, THURSDAY -> "We are somewhere in the middle of the week.";
            case FRIDAY -> "The weekend is near.";
            case SATURDAY, SUNDAY -> "Weekend";
        };

        System.out.println(text);

        System.out.println(DayOFWeek.MONDAY.name());
        System.out.println(DayOFWeek.MONDAY.ordinal());

        DayOFWeek[] days = DayOFWeek.values();
        DayOFWeek monday = DayOFWeek.valueOf("MONDAY");

        compareDayOFWeek(DayOFWeek.MONDAY);

    }

    public static void compareDayOFWeek(DayOFWeek dayOfWeek){
        int comparison = dayOfWeek.compareTo(dayOfWeek.WEDNESDAY);

        if(comparison < 0){
            System.out.println("It´s before the middle of the work week");
        }else if (comparison > 0){
            System.out.println("It´s after the middle of the work week");
        }else {
            System.out.println("It´s the middle of the work week");
        }
    }
}
