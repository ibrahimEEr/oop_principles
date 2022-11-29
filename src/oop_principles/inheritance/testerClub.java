package oop_principles.inheritance;

public class testerClub {
    public static void main(String[] args) {

        FrontendTester ft1 = new FrontendTester("Othman", 23, "1993", "000", true);
        BackendTester bt1 = new BackendTester("John", 45, "1982", "111", false);
        FrontendTester ft2 = new FrontendTester("Ibrahim", 29, "1983", "222", false);
        BackendTester bt2= new BackendTester("James", 36, "1990", "333", false);

       Tester[] testers =  {ft1,ft2,bt1,bt2};  // Polymorphic array

       int manualTester = 0, automationTester = 0, sumAge = 0;

        for (Tester tester : testers) {
            if(tester.isAutomationTester) manualTester++;
            else automationTester++;
            sumAge += tester.age;
        }

        System.out.println(manualTester);
        System.out.println(automationTester);
        System.out.println("avarage age is = " + sumAge/testers.length);




    }
}
