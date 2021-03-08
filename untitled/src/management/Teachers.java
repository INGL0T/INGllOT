package management;

public class Teachers {

    private int id;
    private String name ;
    private int salary;
    private int moneyEarned;

public Teachers(int id, String name , int salary ){

    this.id = id;
    this.name=name;
    this.salary=salary;
    this.moneyEarned = 0;
}

        // code below return  id , name , salary;


public int getId(){
    return id;


}
 public String getName(){
    return name;
 }

 public int getSalary()
 {
     return salary;
 }

 // changing Salary

    public void changeSalary(int salary){
    this.salary= salary;
    }

    public void reciveSalary(int sal){
        moneyEarned += sal;
        School.updateAllMoneySpent(sal);
    }

    public String toString() {
        return "Teachers name: " + name + "\n" + "Salary $ " + salary;
    }
}
