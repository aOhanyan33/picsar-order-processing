package org.example.Homework132;

public class Homework132 {

    //--------Task1------ option 1
//    public enum DayOfWeek {
//        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//    }
//    public static void main(String[] args) {
//        // Get current day from system (Java's DayOfWeek enum)
//        java.time.DayOfWeek currentJavaDay = LocalDate.now().getDayOfWeek();
//
//        //  Java's DayOfWeek to your custom DayOfWeek enum
//        DayOfWeek currentDay = DayOfWeek.valueOf(currentJavaDay.name());
//
//        switch (currentDay){
//
//            case MONDAY:
//                System.out.println("Start of the work week!");
//                break;
//            case TUESDAY:
//            case WEDNESDAY:
//            case THURSDAY:
//            case FRIDAY:
//                System.out.println("Working day");
//                break;
//            case SATURDAY:
//                System.out.println("Time to relax!");
//                break;
//            case SUNDAY:
//                System.out.println("Not working day!");
//                break;
//
//        }
//    }
//}

//-------Task 1 ----- option 2

//    public enum DayOfWeek {
//        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//    }
//    public static void main(String[] args) {
//        java.time.DayOfWeek javaDay = LocalDate.now().getDayOfWeek();
//        DayOfWeek currentDay = DayOfWeek.valueOf(javaDay.name());
//
//
//        Map<DayOfWeek, String> messages = new HashMap<>();
//        messages.put(DayOfWeek.MONDAY, "Start of the work week!");
//        messages.put(DayOfWeek.TUESDAY, "Woking day, TUESDAY!");
//        messages.put(DayOfWeek.WEDNESDAY, "Woking day, WEDNESDAY");
//        messages.put(DayOfWeek.THURSDAY, "Woking day, THURSDAY!");
//        messages.put(DayOfWeek.FRIDAY, "Woking day, FRIDAY");
//        messages.put(DayOfWeek.SATURDAY, "Time to relax!");
//        messages.put(DayOfWeek.SUNDAY, "Not working day");
//
//
//        System.out.println(messages.get(currentDay));
//    }
//}

         //------Task2------
//public enum DayOfWeek {
//        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//    }
//    public static void main(String[] args) {
//
//        DayOfWeek currentDay = DayOfWeek.TUESDAY;
//
//        switch (currentDay){
//
//            case MONDAY:
//            case TUESDAY:
//            case WEDNESDAY:
//            case THURSDAY:
//            case FRIDAY:
//                System.out.println("Working day");
//                break;
//            case SATURDAY:
//            case SUNDAY:
//                System.out.println("Not working day!");
//                break;
//
//        }
//    }
//}
           // -------Task3-------
   public enum Seasons {
        SPRING(28),
        Summer(35),
        Automn(22),
        Winter(8);

        private int avgTemp;

        Seasons (int avgTemp){
        this.avgTemp = avgTemp;
        }

        public int getAvgTemp(){
            return avgTemp;
        }
   }


   public static void main(String[] args) {

    for (Seasons s : Seasons.values()){
    System.out.println("Temperature =   " + s.getAvgTemp());
   }}
}




