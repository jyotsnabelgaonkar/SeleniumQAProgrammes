package JavaCodes;

public class StaticFunctionExample {
	public static void main(String args[])  
	{  
	//creating an object of the class A  
		StaticFun obj = new StaticFun();  
	//calling a the non-static function by using the object of the class  
	obj.display();  
	//calling a static function by using the class name  
	StaticFun.show();  
	}
}
