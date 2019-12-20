/*
   Properties 
   Methods (Behaviours)

 * Method category 
   No-args No-returntype
   No-args returntype
   args No-returntype
   args returntype
 */
package com.java.lec3;

public class Student {

    private int age;
    private String firstName;
    private String lastName;

    /**
     * no-args no-returntype
     */
    public void printStudentName() {
        System.out.println("Student Name:" + this.firstName + " " + this.lastName);
    }

    /**
     * no-args returntype
     *
     * @return
     */
    public int getStudentAge() {
        System.out.println("Student age:" + this.age);
        return this.age;
    }

    /**
     * args no-returntyoe
     *
     * @param nm
     */
    public void setStudentName(String nm) {
        System.out.println("New Name:" + nm);
        this.lastName = nm;
    }

    /**
     * args returntype
     * @param ag
     * @return 
     */
    public int getFathersAge(int ag) {
        int fAge = this.age + ag;
        System.out.println("Fathers age:"+ag);
        return fAge;
    }

}
