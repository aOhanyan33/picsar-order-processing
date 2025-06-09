package org.example.HomeworkTasks;



    class Student implements Comparable<Student> {
        String name;
        int grade;
        int age;

        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        public Student(int age, String name) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        @Override
        public int compareTo(Student other) {
            return Integer.compare(this.grade, other.grade); // ascending
            //return this.grade - student.getGrade();


        }

        @Override
        public String toString() {
            return "name='" + name + "', grade=" + grade ;
        }

    }

