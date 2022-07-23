package Giris;

public class EmployeeLog {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double tax ;
    double bonus ;
    double raiseSalary ;
    double workTime ;
    double totalSalary ;

    EmployeeLog(String name, int salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
       /* this.tax= tax;
        this.bonus = bonus;
        this.raiseSalary = raiseSalary;
        this.workTime = workTime;
        this.totalSalary = totalSalary;*/

    }

    void tax(){
        if(this.salary<=1000 && this.salary>0){
            this.tax = 0;
        }else if(this.salary>1000){
            this.tax =this.salary*0.03;
        }
        System.out.println("Vergi: "+this.tax);
    }
    void bonus(){
        if(this.workHours>40){
            this.bonus = (this.workHours - 40)* 30;
            System.out.println("Bonus: "+this.bonus);
        }else{
            System.out.println("Bu Ay Bonus Kazanamadiniz... ");
        }

    }

    void raiseSalary(){
        if((2021-this.hireYear)>9 && (2021-this.hireYear)<20){
            this.raiseSalary = this.salary*0.10;
        }else if((2021-this.hireYear)>19){
            this.raiseSalary = this.salary*0.15;
        }else{
            this.raiseSalary = this.salary*0.05;
        }

        System.out.println("Maas Artisi: "+this.raiseSalary);

    }
    void totalSalary(){
      this.totalSalary  = ((this.salary+this.bonus+this.raiseSalary) - this.tax);
        System.out.println("Toplam Maas: "+this.totalSalary);
    }

    void toPrint(){
        System.out.println("Calisan Adi: "+this.name +"\n"+
        "Maasi: "+this.salary+"\n"+
        "Calisma Saati: "+this.workHours+"\n"+
        "Baslangic Yili: "+this.hireYear);
    }



}
