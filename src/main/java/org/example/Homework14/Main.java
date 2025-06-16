package org.example.Homework14;

public class Main {
    public static void main(String[] args) {

        Sportsman obj1 = new Sportsman("Football", Sportsman.SportCategory.TEAM) {
            @Override
            public void play() {
                System.out.println("I am playing football with my team");
            }
//                if (category == SportCategory.SINGLE){
//                    System.out.println("I am playing football with my team");}
//                else {System.out.println("I am playing football alone");}}
        };

        Sportsman obj2 = new Sportsman("Tennis", Sportsman.SportCategory.SINGLE) {
             @Override
                public void play() {
                    System.out.println("I am playing tennis alone");
                }
        };

        Sportsman obj3 = new Sportsman("Basketball", Sportsman.SportCategory.TEAM) {
            @Override
            public void play() {
                System.out.println("I am playing Basketball with Team");
            }
        };

        obj1.play();
        obj2.play();
        obj3.play();

    }
}
