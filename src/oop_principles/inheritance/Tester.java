package oop_principles.inheritance;

public class Tester extends Person{

    //default constructor
    public Tester(){}

    //2-args constructor
    public Tester(String fName, int age){
        super(fName,age);
    }

    //3-args constructor
    public Tester(String fName, int age, String DOB){
        super(fName, age, DOB);
    }

    //4-args constructor
    public Tester(String fName, int age, String DOB, String SSN){
        super(fName, age, DOB, SSN);
    }

    //5-args constructor
    public Tester(String fName, int age, String DOB, String SSN, boolean isAutomationTester){
        super(fName, age, DOB, SSN);
        this.isAutomationTester = isAutomationTester;
    }

    public boolean isAutomationTester;

    public void code(){
        System.out.println("Tester codes");
    }

    //Overload code method
    public void code(String language){
        System.out.println("Tester codes in " + language + " language");
    }

    @Override
    public void eat(){
        System.out.println("Tester eats");
    }

    //Override sleep() method that has no-args

    @Override
    public void sleep() {
        System.out.println("Tester sleeps");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "fName='" + fName + '\'' +
                ", age=" + age +
                ", DOB='" + DOB + '\'' +
                ", SSN='" + getSSN() + '\'' +
                ", isAutomationTester=" + isAutomationTester +
                '}';
    }
}