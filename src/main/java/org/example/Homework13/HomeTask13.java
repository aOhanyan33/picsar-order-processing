package org.example.Homework13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class HomeTask13 {
    public static void main(String[] args) {

          //--------- 1.	Word Counter
//	•	Read a sentence from the console.
//  •	Count the frequency of each word using a HashMap<String, Integer>.


    String text = "Apple home pen hen pen";

    String[] words = text.split(" ");
    //Stream.of(words).forEach(a-> System.out.println(a));

    Map<String, Integer> countsMap = new HashMap<>();

    for (String anyVar: words) {
        if (countsMap.get(anyVar) == null) {
            countsMap.put(anyVar, 1);
        }
        else {
            int currentCount = countsMap.get(anyVar); // countsMap.getValue, countsMap.getKey()
            countsMap.put(anyVar, currentCount + 1);

        }

    }
    System.out.println(countsMap);}}


//----------3.	Student Grades
//	•	Map: HashMap<String, Integer> where key is student name and value is grade.
//        •	Print names of all students who scored above 80.
//        HashMap<String, Integer> studentGrades = new HashMap<>();
//        studentGrades.put("Anna", 99);
//        studentGrades.put("David", 92);
//        studentGrades.put("Ani", 88);
//        studentGrades.put("Ara", 67);
//
//        //set <Entry<String, Integer>> set = hmap.entrySet();
//        for (Map.Entry<String, Integer> me : studentGrades.entrySet()) {
//            String student = me.getKey();
//            int grade = me.getValue();
//            if (grade > 80) {
//                System.out.println(student + " - " + grade);
//            }
//        }
//
//    }}