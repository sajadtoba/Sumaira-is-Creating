package learScan;

import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {
        // We need to create the PeopleNtech Student Name Robin, age 22, address New York State, Professional QA, Salary 10000.

        Scanner stPeopleNTech = new Scanner(System.in);
        String infoPeopleNTechStudent = stPeopleNTech.nextLine();
        System.out.println("PeopleNTech Student information below along with the details    "+ infoPeopleNTechStudent);

        Scanner stName = new Scanner(System.in);
        String studentName = stName.nextLine();
        System.out.println("Student Name is      "+"" +studentName);

        Scanner stAge = new Scanner(System.in);
        //String studentAge = stAge.next();
        String studentAge = stAge.nextLine();
        System.out.println("Student Age is      "+"" +studentAge);

        Scanner stAddress = new Scanner(System.in);
        String studentAddress = stAddress.nextLine();
        System.out.println("The Student lives in New York City   "+studentAddress);

        Scanner stProfession = new Scanner(System.in);
        String studentProfession = stProfession.next();
        System.out.println("Student works as a QA Engineer   "+studentProfession);

        Scanner stSalary = new Scanner(System.in);
        double studentSalary = stSalary.nextDouble();
        System.out.println("The student Salary is    "+ studentSalary);
stPeopleNTech.close();
stName.close();
stAge.close();
stAddress.close();
stProfession.close();
stSalary.close();


        //input.close();
        stName.close();
        stAge.close();


    }
}
