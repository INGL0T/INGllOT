package management;

public class Student {
    private int id;
    private String name;
    private int grade ;
    private int feesPaid;
    private int feesTotal;



    // We have unique id , name and grade for each student, but fessPaid and feesTotal are fore everyone same.

    public  Student( int id,String name, int grade){
        this.id=id;
        this.name=name;
        this.grade=grade;
        this.feesPaid = 0;
        this.feesTotal= 10000;
    }


    // Someday student will grade , so we have to create a method for changing grade
    public void changeGrade(int grade) {
        this.grade = grade;
    }


        // Also our students will paid for school. We need now to update our payment (add not subtract)

    public void addPayment(int fees ){
       this.feesPaid += fees;
        School.updateAllMoney(feesPaid);

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public double getFeesTotal() {
        return feesTotal;
    }

public String toString(){
        return "Student name: " + name + "\n" + "Fees paid $ " + feesPaid;
}

}
