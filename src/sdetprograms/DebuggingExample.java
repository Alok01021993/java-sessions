package sdetprograms;

public class DebuggingExample {

	public static String sayHello(String name) {
		String msg="Hello"+name;
		return msg;
	}
	
	public static void main(String[] args) {
		String message=sayHello("Lazy Programmer official");
		System.out.println(message);
	}

}


