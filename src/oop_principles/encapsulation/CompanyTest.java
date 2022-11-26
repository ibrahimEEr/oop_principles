package oop_principles.encapsulation;

import java.sql.SQLOutput;

public class CompanyTest {
    public static void main(String[] args) {

        Company company1 = new Company("Apple", "California", "123-312-2345");
        Company company2 = new Company("Google", "California", "000-055-5555");

        System.out.println("Company 1 is = " + "\"" + company1.getName() + "\"" +" and company 2 is = \"" + company2.getName()+ "\"");


    }
}
