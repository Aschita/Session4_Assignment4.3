package assignment_4c;

//Final Method Program

class FinalDemoMethod{
	final void demo(){
		System.out.println("Demo of Final Method");
	}
}

public class FinalMethod extends FinalDemoMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	FinalMethod fm = new FinalMethod();
	fm.demo();
	}
}
