
package main;

import beans.Student;
import java.util.Scanner;

/**
 *
 * @author Ayxan
 */
public class Main {

  
    public static void main(String[] args) {
        System.out.println("What do you want to do?:"
                + "\n1.Register a student"
                + "\n2.Show all Students"
                + "\n3.Find Student"
                + "\n4.Update student" );
        Scanner sc =new Scanner(System.in);
        int menu = sc.nextInt();
        if(menu==1){
            System.out.println("How many student do you want to enroll");
            sc = new Scanner(System.in);
            int count = sc.nextInt();
            Config.students = new Student[count];
                for (int i = 0; i < count; i++) { // Burada nece eded telebe qeyd olunacaqsa onlari goturub Congfigdeki arraya otururuk
                    System.out.println(i+1+".Register"); // Register sozunun qarsisinda nomre saya uygun artacaq
                    
            sc = new Scanner(System.in); // Bu hisse elave edilmediyi zaman 
            //Scanerler arasinda xett qirilmasi bas verir
            System.out.println("enter name: ");
            String name = sc.nextLine();
            System.out.println("enter surname: ");
            sc = new Scanner(System.in);
            String surname = sc.nextLine();
            System.out.println("enter age: ");
            sc = new Scanner(System.in);
            int age = sc.nextInt();
            System.out.println("enter group: ");
            sc = new Scanner(System.in);
            String group = sc.nextLine();
        
            Student st = new Student(name, surname, age, group); // Dolu(parametrleri goturen)konstructoru cagiraraq 
            //yuxaridaki melumatlari otururuk
            Config.students[i]=st; // Yuxarida yaranan obyekti menimsedirik bu arraya
            
        }
                System.out.println("Registration completed successfuly");
                
                for (int i = 0; i < Config.students.length; i++) {
                Student st  = Config.students[i];
                    System.out.println(st.getName()+" "+st.getSurname()+" "+st.getAge()+" "+st.getGroup());
                    // Studentleri onlarin sayi qeder gotur ve print et 
            }
        } 
        
    }
    
}
