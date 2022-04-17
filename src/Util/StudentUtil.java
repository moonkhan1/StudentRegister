/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import beans.Student;
import main.Config;

/**
 *
 * @author Ayxan
 */
public class StudentUtil {
    public static Student fillStudents(){
       
        String name = InputUtil.requireText("enter name: ");
        String surname = InputUtil.requireText("enter surname: ");
        int age = InputUtil.requireNumber("enter age: ");
        String group = InputUtil.requireText("enter group: ");
                    
        Student st = new Student(name, surname, age, group);
        return st;
    }
    public static void printAllRegisteredStudents(){
        
        if(Config.students == null){
            System.out.println("There is no entry yet");
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {
                Student st  = Config.students[i];
                    System.out.println(st.getFullInfo());
        }
    }
    
    public static void registerStudents(){
        int count = InputUtil.requireNumber("How many student do you want to enroll");
            Config.students = new Student[count];
            
            for (int i = 0; i < count; i++) { // Burada nece eded telebe qeyd olunacaqsa onlari goturub Congfigdeki arraya otururuk
                    System.out.println(i+1+".Register");
                    // *Bunlar StudentUtile kocurulerek optimallasdirildi*
//                    String name = InputUtil.requireText("enter name: ");
//                    String surname = InputUtil.requireText("enter surname: ");
//                    int age = InputUtil.requireNumber("enter age: ");
//                    String group = InputUtil.requireText("enter group: ");
//                    
//                    Student st = new Student(name, surname, age, group); // Dolu(parametrleri goturen)konstructoru cagiraraq 
            //yuxaridaki melumatlari otururuk
                    Config.students[i]=StudentUtil.fillStudents();
            
            }
            System.out.println("Registration completed successfuly");
            StudentUtil.printAllRegisteredStudents();
    }
    
    
    
    
    public static Student[] findStudents(String text){
        int count = 0;
            for (int i = 0; i < Config.students.length; i++) {
                Student st = Config.students[i];
                if (st.getName().contains(text) || st.getSurname().contains(text) || st.getGroup().contains(text)){
                    count++;
                }
            }
            Student[] result = new Student[count];
            int found = 0;
            
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
                if (st.getName().contains(text) || st.getSurname().contains(text) || st.getGroup().contains(text)){
                    result[found++] = st;
                }
            
        }
        return result;
    }
    
    
    public static void findStudentsAndPrint(){
        String text = InputUtil.requireText("Type name | surname | group");
        Student[] result = findStudents(text);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getFullInfo());
                    
        }
    }
    
    
    public static void updateStudentWithObject(){
        StudentUtil.printAllRegisteredStudents();
        int i = InputUtil.requireNumber("How many people do you want to change");
        Student s = StudentUtil.fillStudents();
        Config.students[i-1]=s;    
    }
    public static void updateStudentWithSameObject(){
        
    }
    
    }
    
    
    

