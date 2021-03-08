package management;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
 Teachers Kasia = new Teachers(1,"Kasia" ,3000);
 Teachers Ania = new Teachers(2 ,"Ania", 3500);
 Teachers Adam = new Teachers(3,"Adam", 5000);

    List<Teachers> teachersList = new ArrayList<>();
    teachersList.add(Kasia);
    teachersList.add(Ania);
    teachersList.add(Adam);


    Student Tomek = new Student(1, "Tomek", 2);
    //@Override
   // Student Kasia = new Student(2, "Kasia", 3);
    Student Bob = new Student(2, "Bob", 3);

    List<Student> StudentList = new ArrayList<>();
    StudentList.add(Tomek);
    StudentList.add(Bob);



    School XYZ = new School(teachersList, StudentList);
    Teachers Paul = new Teachers(3, "Paul", 8000);
    XYZ.addTeacher(Paul);


    Tomek.addPayment(300);

    XYZ.getAllMoney(); // It is ignored

        System.out.println("School have $" + XYZ.getAllMoney()+ " because  Tomek paid $" + Tomek.getFeesPaid() );

    Tomek.addPayment(300);

        System.out.println("School have  $" + XYZ.getAllMoney() );

    Kasia.reciveSalary(200);

        System.out.println("School spent  $" + XYZ.getAllMoneySpent()+ " to " + Kasia.getName()
        + " and XYZ have now " + XYZ.getAllMoney());


    Adam.reciveSalary(Adam.getSalary());
        System.out.println("School have $" + XYZ.getAllMoney()+ " because  Adam Salary is  $" + Adam.getSalary() );

        System.out.println("\n");

        System.out.println(Bob);
        System.out.println(Kasia);

        System.out.println("\n");
       System.out.println(XYZ.getTeachers());
    }
}
