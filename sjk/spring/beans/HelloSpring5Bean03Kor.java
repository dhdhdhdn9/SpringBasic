package sjk.spring.beans;

public class HelloSpring5Bean03Kor implements HelloSpring5Bean03 {
	
	@Override
	public void sayHello(String msg) {
		System.out.println("안녕하세요, " + msg);
	}

}
