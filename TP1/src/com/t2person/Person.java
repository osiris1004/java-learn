package com.t2person;

public class Person {
    private  String lastName;
    private String firstName;
    private int age;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getAge() {
        return age;
    }



    public boolean isTeen(){
        return age >=12 && age <=20 ? true : false;
    }
    public  String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty()){
            return " please make sure you insert your names";
        }else {
                return getLastName()+" "+getFirstName();
            }
    }
}
