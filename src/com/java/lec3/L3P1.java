
package com.java.lec3;

public class L3P1 {
    public static void main(String[] args) {
        // create student object, working with object and its methods
        Student stu = new Student();
        stu.printStudentName(); // access object methods
        //use a return value from a method
        int studentAge = stu.getStudentAge();
        System.out.println("Student Age found:"+studentAge);
    }
}
