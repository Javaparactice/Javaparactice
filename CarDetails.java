class Car{
 String name;
 String color;
 String brand;
public void CarDetails(){
System.out.println("Name of the car is "+name+" /n color of the car is "+color+" /n brand of the car is "+brand);
}
}
public class CarDetails{
public static void main(String[] args){
Car hyundai=new Car();
 hyundai.name="i20";
 hyundai.color="red";
 hyundai.brand="hyundai";
 hyundai.CarDetails();
Car maruthi=new Car();
 maruthi.name="a20";
 maruthi.color="blue";
 maruthi.brand="maruthi";
 maruthi.CarDetails();
}
}


output:

Microsoft Windows [Version 10.0.19043.928]
(c) Microsoft Corporation. All rights reserved.

C:\Users\vinith>cd desktop

C:\Users\vinith\Desktop>javac CarDetails.java

C:\Users\vinith\Desktop>java CarDetails
Name of the car is i20 /n color of the car is red /n brand of the car is hyundai
Name of the car is a20 /n color of the car is blue /n brand of the car is maruthi

C:\Users\vinith\Desktop>