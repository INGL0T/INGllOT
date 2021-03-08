package management;

import java.util.List;

public class School {

    private List<Teachers> teachers ;
    private List<Student> students;
    private static  int allMoney;
    private static  int allMoneySpent;

    public School(List<Teachers> teachers, List<Student> student) {
        this.teachers = teachers;
        this.students = student;
        allMoney = 0;
        allMoneySpent=0;
    }
        // return list of teachers
    public List<Teachers> getTeachers() {
        return teachers ;
    }

        // add Teacher
    public void addTeacher(Teachers teacher) {
        teachers.add(teacher);
    }

        //return list of student
    public List<Student> getStudent() {
        return students;
    }


        //add student
    public void addStudent(Student student) {
        this.students.add(student);
    }

        // return all earned money
    public int getAllMoney() {
        return allMoney;
    }

         // money added to the school

    public static void updateAllMoney(int updateMoney) {
        allMoney += updateMoney;
    }


    // return total money spend
    public int getAllMoneySpent() {
        return allMoneySpent;
    }
    // add spend money. let's assume that is only money for teachers

    public static void updateAllMoneySpent(int MoneySpent) {
        allMoneySpent= allMoneySpent + MoneySpent;
        allMoney -= allMoneySpent;

    }
}
