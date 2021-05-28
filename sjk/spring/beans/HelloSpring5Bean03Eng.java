package sjk.spring.beans;

public class HelloSpring5Bean03Eng implements HelloSpring5Bean03 {
	
	@Override
	public void sayHello(String msg) {
		System.out.println("Hello, " + msg);
	}

}
