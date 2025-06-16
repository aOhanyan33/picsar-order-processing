package org.example.Homework13;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WriteInFile {

    public static Map<String, String> contactMap = new HashMap<>();
    public  static void main(String[] args) {
        boolean isAlive = true;
        Scanner scanner = new Scanner(System.in);

        while (isAlive) {
            System.out.println("Type 1 for add contact");
            System.out.println("Type 2 for delete contact");
            System.out.println("Type 3 for search contact");
            System.out.println("Type any other for exit");

            switch (scanner.next()) {
                case "1":
                    System.out.println("Type name");
                    String name = scanner.next();
                    System.out.println("Type number");
                    String number = scanner.next();
                    addContact(name, number);
                    System.out.println("contact added");
                    break;
                case "2":
                    System.out.println("Type name for delete");
                    deleteContact(scanner.next());
                    break;
                case "3":
                    System.out.println("Type name for search");
                    searchContact(scanner.next());
                    break;
                default:
                    isAlive = false;
                    System.out.println("goodby");
                    break;
            }
        }
    }

    public static void addContact(String name, String phoneNumber) {
        contactMap.put(name, phoneNumber);
        System.out.println("added number of" + name);
        writeContactsToFile();
    }

    private static void writeContactsToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("contacts.txt", true))){
            for (Map.Entry<String, String> entry : contactMap.entrySet()) {
                writer.write("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }


    }


    public static void deleteContact(String name) {
        contactMap.remove(name);
        System.out.println("remove number of" + name);
    }

    public static void searchContact(String name) {
        System.out.println("Number if aaa is : " + contactMap.get(name));
    }
    }



