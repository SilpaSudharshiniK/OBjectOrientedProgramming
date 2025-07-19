package com.java.oops.inheritance;

//super class reference holding object of sub class which calls object of sub class.

class TV
{
    public void switchON(){ System.out.println("TV is Switched ON"); }
    
    public void changeChannel() { System.out.println("TV Channel is Changed "); }
    
}

class SmartTV extends TV
{
    @Override
    public void switchON(){ System.out.println("Smart TV is Switched ON"); }
    
    @Override
    public void changeChannel() { System.out.println("SmartTV Channel is Changed "); }
    
    public void browse(){ System.out.println("Smart Tv Browsing"); }
    
}

public class Overriding 
{

    public static void main(String[] args) 
    {
        TV t = new SmartTV();
        
        t.switchON();
        t.changeChannel();
        //t.browse();  //as this function is not there in super class it will throw error (method browse() is undefined for the type TV)
        
    }
    
}
