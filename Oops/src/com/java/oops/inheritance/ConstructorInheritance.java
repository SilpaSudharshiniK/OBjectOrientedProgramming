package com.java.oops.inheritance;

class Rectangle
{
	int length;
	int breadth;
    Rectangle()
    {
        length=breadth=1;
    }
    Rectangle(int l,int b)
    {
    	length=l;
    	breadth=b;
    }
    int volumeR(int cms) {
    	System.out.println("Volume of Rectangle in cms is "+cms);
		return length*breadth;
	}
}

class Cuboid extends Rectangle
{
	int height;
	Cuboid()
    {
        height=1;
    }
	Cuboid(int h)
    {
        height=h;
    }
	Cuboid(int l,int b,int h)
    {
		super(l,b);//should be the first statement in the constructor
		height=h;
    }
	int volume(int cms) {
		System.out.println("Volume of Cuboid in cms is "+cms);
		return length*breadth*height;
	}    
}

public class ConstructorInheritance {

    public static void main(String[] args) {       
    	Cuboid c = new Cuboid(10,20,30);
    	System.out.println("Volume of Cuboid is "+c.volume(5));
//    	Rectangle r = new Rectangle(20,20);
//    	System.out.println("Volume is Rectangle is "+r.volumeR(5));
    	
    }    
}

