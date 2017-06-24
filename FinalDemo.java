package assignment_4c;

//Final Variable
public class FinalDemo {
	final int MAX_VALUE; //Declaring the variable Final
	//Must be initialized through a constructor
	FinalDemo(){  
		MAX_VALUE=101;
	}  
	void display(){
		System.out.println(MAX_VALUE);
	}
public static void main(String args[]){  
	FinalDemo obj=new  FinalDemo();  
	obj.display();  
	}  
}

