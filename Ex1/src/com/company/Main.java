package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(1, "Arstan", 4.7, 17, "male");
        Student student2 = new Student(2, "Artur", 5.0, 19, "male");
        Student student3 = new Student(3, "Kanykei", 4.8, 19, "female");
        Student student4 = new Student(4, "Ermek", 4.0, 16, "male");
        Student student5 = new Student(5, "Shamil", 0.0, 12, "male");
        Student student6 = new Student(6, "Eliza", 3.0, 9, "female");
        Student student7 = new Student(7, "Sabina", 4.9, 10, "female");
        Student student8 = new Student(8, "Askhat", 2.0, 1, "male");
        Student student9 = new Student(9, "Rauan", 3.8 , 18, "male");
        Student student10 = new Student(10, "Chyngyz", 4.3 , 35, "male");

        ArrayList<Student> studentArray = new ArrayList<Student>();
        studentArray.add(student1);
        studentArray.add(student2);
        studentArray.add(student3);
        studentArray.add(student4);
        studentArray.add(student5);
        studentArray.add(student6);
        studentArray.add(student7);
        studentArray.add(student8);
        studentArray.add(student9);
        studentArray.add(student10);

        System.out.println(getNamesList(studentArray));
        System.out.println(getNamesListByAge(studentArray, 18));
        printAnonymously(studentArray);
        System.out.println(getNamesFirstLetterList(studentArray));
    }

    public static List<String> getNamesList(ArrayList<Student> studentArray) {
        List<String> studentNamesList = studentArray.stream().map(x -> x.getName()).collect(Collectors.toList());
        return studentNamesList;
    }

    public static List<String> getNamesListByAge(ArrayList<Student> studentArray, int minAge) {
        List<String> studentNamesList = studentArray.stream().filter(x -> x.getAge() >= minAge).map(x -> x.getName()).collect(Collectors.toList());
        return studentNamesList;
    }

    public static void printAnonymously(ArrayList<Student> studentArray) {
        studentArray.stream().forEach(x -> System.out.printf("ID: %s, Средняя Оценка: %s %n", x.getId(), x.getAvgScore()));
    }

    public static List<String> getNamesFirstLetterList(ArrayList<Student> studentArray) {
        List<String> studentNamesList = studentArray.stream().map(x -> x.getName().substring(0, 1) + x.getName().length()).collect(Collectors.toList());
        return studentNamesList;
    }
}
