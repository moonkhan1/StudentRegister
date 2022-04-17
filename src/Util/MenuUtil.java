/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

/**
 *
 * @author Ayxan
 */
public class MenuUtil {
    public static void processMenu(int selectedMenu) throws InterruptedException{
        
        switch (selectedMenu){
                case 1:
                    StudentUtil.registerStudents();
                    break;
                case 2:
                    StudentUtil.printAllRegisteredStudents();
                    break;
                case 3:
                    StudentUtil.findStudentsAndPrint();
                    break;
                case 4:
                    StudentUtil.updateStudentWithSameObject();
                    break;
                case 5:
                    System.out.println("Exiting from the system...");
                    Thread.sleep(1000);
                    System.exit(0);
                    break;
                default:
                    break;
            }
    }
}
