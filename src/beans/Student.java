/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author Ayxan
 */
public class Student {
    private String name;
    private String surname;
    private int age;
    private String group;

    public Student(String name, String surname, int age, String group) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.group = group;
    }  
//    Her seyi saxlayan constructor

    public Student() {
    }
     // Bos constructor(Her birnicen isdifade eleye bilmek ucun) 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    // Get and Set methods
    public String getFullInfo(){
        return this.getName()+" "+this.getSurname()+" "+this.getAge()+" "+this.getGroup();
    }
}

    

