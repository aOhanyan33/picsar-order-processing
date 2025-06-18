package org.example.Homework15;

public class Main {

    //----Task 1-----
//    public static void main (String[] args){
//        Box<Integer> intBox = new Box<>();
//        intBox.setValue(10);
//        System.out.println(intBox.getValue());
//
//        Box<Boolean> boolBox = new Box<>();
//        boolBox.setValue(true);
//        System.out.println(boolBox.getValue());
//
//    }



    //-----Task2----
    public static void main (String[] args){
        Pair<String, Integer> pair = new Pair<>();
        pair.setKey("Ara");
        pair.setValue(30);

        System.out.println("Key:  " + pair.getKey() + "  Value: " + pair.getValue());
    }
}
