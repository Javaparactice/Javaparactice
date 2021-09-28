class Employee{
int Id;
String name;
double salary;
public void CalculateTax(){
if(salary>0.0){
double tax=(salary*10)/100;
System.out.println(name+ "has to pay "+tax+" as tax per annum");
}
}
}
public class EmployeeTaxCalculation{
public static void main(String[] args){
Employee emp1=new Employee();
emp1.Id=6567;
emp1.name="akash";
emp1.salary=100000.0;
emp1.CalculateTax();


Employee emp2=new Employee();
emp2.Id=456890;
emp2.name="kavi";
emp2.salary=300000.0;
emp2.CalculateTax();
}
}


output:

Microsoft Windows [Version 10.0.19043.928]
(c) Microsoft Corporation. All rights reserved.

C:\Users\vinith>cd desktop

C:\Users\vinith\Desktop>javac EmployeeTaxCalculation.java

C:\Users\vinith\Desktop>java EmployeeTaxCalculation
akashhas to pay 10000.0 as tax per annum
kavihas to pay 30000.0 as tax per annum

C:\Users\vinith\Desktop>

C:\Users\vinith\Desktop>


