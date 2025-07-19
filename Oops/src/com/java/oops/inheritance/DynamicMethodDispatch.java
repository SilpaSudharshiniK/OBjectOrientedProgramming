package com.java.oops.inheritance;

//method overloading - compile time polymorphism - decides to take with methods decides 
//at the time of compiling

//method overriding - run time polymorphism(dynamic polymorphism)

class Car
{
    public void start(){System.out.println("Car Started");}
    public void accelerate(){System.out.println("Car is Accelerated");}
    public void changeGear(){System.out.println("Car Gear Changed");}
    
}

class LuxaryCar extends Car
{
	//@Override
    public void changeGear(){System.out.println("Automatic Gear");}
	
    public void openRoof(){System.out.println("Sun Roof is Opened");}
    
}

public class DynamicMethodDispatch 
{

    public static void main(String[] args) 
    {
        Car c=new LuxaryCar();
        c.start();
        c.accelerate();
        c.changeGear();
//    c.openRoof(); object should be a reference of LuxaryCar class - LuxaryCar c=new LuxaryCar();
    }
    
} 

