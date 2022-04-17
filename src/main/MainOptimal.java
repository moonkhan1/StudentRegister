/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import Util.InputUtil;
import Util.MenuUtil;
import Util.StudentUtil;
import beans.Student;
import java.util.Scanner;

/**
 *
 * @author Ayxan
 */
public class MainOptimal {
    public static void main(String[] args) throws InterruptedException  {
        int menu = 0;
        while (true) {
           menu = InputUtil.requireNumber("What do you want to do?:"
                    + "\n1.Register a student"
                    + "\n2.Show all Students"
                    + "\n3.Find Student"
                    + "\n4.Update student"
                    + "\n5.Exit");
            MenuUtil.processMenu(menu);
            // Bu hisse optimalliq ucun MenuUtil e elave edildi
//            switch (menu){
//                case 1:
//                    StudentUtil.registerStudents();
//                    break;


               //* Bunlar Student util e kocurulur(registerStudents)*
//            System.out.println("How many student do you want to enroll");
//            sc = new Scanner(System.in);
//            int count = sc.nextInt();
//            int count = InputUtil.requireNumber("How many student do you want to enroll");
//            Config.students = new Student[count];
//            
//            for (int i = 0; i < count; i++) { // Burada nece eded telebe qeyd olunacaqsa onlari goturub Congfigdeki arraya otururuk
//                    System.out.println(i+1+".Register");
            // *Bunlar StudentUtile kocurulerek optimallasdirildi*
////                    String name = InputUtil.requireText("enter name: ");
////                    String surname = InputUtil.requireText("enter surname: ");
////                    int age = InputUtil.requireNumber("enter age: ");
////                    String group = InputUtil.requireText("enter group: ");
////
////                    Student st = new Student(name, surname, age, group); // Dolu(parametrleri goturen)konstructoru cagiraraq 
//            //yuxaridaki melumatlari otururuk
//                    Config.students[i]=StudentUtil.fillStudents();
//            
//            }
//            System.out.println("Registration completed successfuly");
            // *Bunlar StudentUtile kocurulerek optimallasdirildi*
//                for (int i = 0; i < Config.students.length; i++) {
//                Student st  = Config.students[i];
//                    System.out.println(st.getName()+" "+st.getSurname()+" "+st.getAge()+" "+st.getGroup());
            // Studentleri onlarin sayi qeder gotur ve print et
            
                    
            // Bu hisse optimalliq ucun MenuUtil e elave edildi
//                case 2:
//                    StudentUtil.printAllRegisteredStudents();
//                    break;
//                case 3:
//                    StudentUtil.findStudentsAndPrint();
//                    break;
//                case 4:
//                    StudentUtil.updateStudentWithSameObject();
//                    break;
//                case 5:
//                    System.out.println("Exiting from the system...");
//                    Thread.sleep(1000);
//                    break OUTER;
//                default:
//                    break;
//            }
        }
   }
}

