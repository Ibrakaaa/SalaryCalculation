package Giris;

public class Employee {
    public static void main( String[] args){

        EmployeeLog e1 = new EmployeeLog("Ahmet",2000,45,1995);
        e1.toPrint();
        e1.raiseSalary();
        e1.bonus();
        e1.tax();
        e1.totalSalary();


    }
}
