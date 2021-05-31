package sjk.spring.annotation;

import org.springframework.stereotype.Component;

import sjk.spring.beans.HelloSpring5Bean03;


@Component("kor")
public class HelloSpring5Bean07Kor implements HelloSpring5Bean03 {
	
	@Override
	public void sayHello(String msg) {
		System.out.println("안녕하세요, " + msg);
	}

}
