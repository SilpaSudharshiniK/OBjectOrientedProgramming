package com.java.oops;

class Box{
	int width;
	int height;
	
	Box(int w,int h){
		width=w;
		height=h;
	}
	
	boolean isEquals(Box b) {
		if(this.width==b.width && this.height==b.height) {
			
			//this.width,this.height is for b1		
			return true;
		}
		
		else {
			return false;
	   }
	
	}
}

public class ObjectToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Box b1 = new Box(200,30);
         Box b2 = new Box(20,30);
         if(b1.isEquals(b2)) {
        	 System.out.println("Both are equal");
         }
         else {
        	 System.out.println("Both are not equal");
         }
         
//         boolean result = b1.isEquals(b2);
//         System.out.println(result);
//          
	}

}
