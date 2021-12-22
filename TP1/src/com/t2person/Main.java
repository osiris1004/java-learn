package com.t2person;

public class Main {
    public static void main(String[] args) {
        Person student = new Person();
        student.setLastName("");
        student.setFirstName("");
        student.setAge(2);

        System.out.println("full name:"+student.getFullName());
        System.out.println("are you a teenage :"+student.isTeen());

    }
}
