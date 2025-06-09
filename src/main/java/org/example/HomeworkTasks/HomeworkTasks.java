package org.example.HomeworkTasks;
import java.util.*;

public class HomeworkTasks {

    //     ----  Խնդիր 1. Լիստի Բոլոր զույգ թվերի քառակուսիները վերադարձնել նոր ցուցակով
//    public static void main(String[] args){

//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        ArrayList<Integer> newNumbers = new ArrayList<Integer>();
//        numbers.add(17);
//        numbers.add(-10);
//        numbers.add(14);
//        numbers.add(-2);
//        numbers.add(15);
//
//        for (int num : numbers) {
//            if (num % 2 == 0) {
//                newNumbers.add(num*num);
//            }
//        }
//        System.out.println(newNumbers);
//}}


//   -----Խնդիր 2. Դասավորել ուսանողներին ըստ գնահատականի

//        public static void main(String[] args) {
//            List<Student> students = new ArrayList<>();
//            students.add(new Student("Ani", 85));
//            students.add(new Student("Gagik", 92));
//            students.add(new Student("Mariam", 78));
//
//          //Comparable: sort by grade ascending
//            Collections.sort(students);
//            System.out.println("By grade ascending:");
//            students.forEach(s -> System.out.println(s.name + ": " + s.grade));
//
//
//            Collections.sort(students, Collections.reverseOrder());
//            System.out.println(students);
//        }
//    }



// -----Խնդիր 3. Գտնել միջին տարիքը հաճախորդների ցանկի
//public static void main(String[] args) {
//    List<Student> students = new ArrayList<>();
//    students.add(new Student(5,"Ani"));
//    students.add(new Student(3,"Gagik"));
//    students.add(new Student(4, "Mariam"));
//
//    int ageSum = 0;
//    for (Student student : students){
//        ageSum += student.getAge();
//    }
//    double averageAge = (double) ageSum / students.size();
//    System.out.println("Age average =  " + averageAge);
//   }
//}

// -------Խնդիր 4. Ֆիլտրել և տպել այն ուսանողներին, ովքեր ունեն գնահատական > 85

//    public static void main(String[] args) {
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("Ani", 86));
//        students.add(new Student("Gagik", 92));
//        students.add(new Student("Mariam", 78));
//
//        for (Student student : students) {
//            if (student.getGrade() > 85)
//                System.out.println(student.getName() + " - " + student.getGrade());
//        }
//    }}


// ------Խնդիր 5. Ստուգել՝ արդյոք ուսանողների Լիստում կա  “David” անունով ուսանող
//
//        public static void main(String[] args) {
//             List<Student> students = new ArrayList<>();
//             students.add(new Student("Ani", 85));
//             students.add(new Student("Gagik", 92));
//             students.add(new Student("Mariam", 78));
//
//            boolean tDavaid = false;
//            String name = "David";
//            for (Student student : students) {
//                if (student.getName().equals(name)) {
//                    tDavaid = true;
//                    break;
//                }
//            }
//            System.out.println("Contains David is  " + tDavaid);
//
//}}

// ------Խնդիր 6. Լիստից հեռացնել բոլոր ուսանողներին, ովքեր ստացել են 60-ից ցածր գնահատական
//            public static void main(String[] args) {
//            List<Student> students = new ArrayList<>();
//            students.add(new Student("Ani", 85));
//            students.add(new Student("Gagik", 92));
//            students.add(new Student("Mariam", 50));
//
//            students.removeIf(student -> student.getGrade() < 60);
//                for (Student student : students) {
//                    System.out.println(student.getName() + " - " + student.getGrade());
//                    }
//            System.out.println(students);}}

//-------Խնդիր 7. Վերադարձնել այն հաճախորդների ցուցակը, որոնց անունը սկսվում է “K”-ով
    public static void main(String[] args) {
        ArrayList<String> customers = new ArrayList<String>();
        ArrayList<String> newCustomers = new ArrayList<String>();
        customers.add("Anna");
        customers.add("Karen");
        customers.add("Kara");
        customers.add("Dav");

        for (String cust : customers) {
            if (cust.startsWith("K")) {
                newCustomers.add(cust);
            }
        }
        System.out.println(newCustomers);}}







