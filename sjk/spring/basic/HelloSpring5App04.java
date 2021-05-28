package sjk.spring.basic;

import sjk.spring.beans.HelloSpring5Bean03;
import sjk.spring.beans.HelloSpring5Bean04Factory;

public class HelloSpring5App04 {
	
	// 다섯번째 사례
    // 디자인 패턴에서 factory 패턴을 이용해서
    // 객체생성을 캡슐화	
	// 생성과정을 드러내지 않음
	
	// 문자열을 통해 생성해야 할 객체를 취사선택하게 됨
    // 개발자가 신경써야 할 부분이 늘어났다는 단점 발생
    // 즉, 비지니스 코드 작성하는 것도 버거운데
    // 객체 생성관련 클래스를 따로 작성하는 것은 더욱 힘듦
	
	// 해결 : 객체 생성부분은 외부의 힘을 빌림
    // 즉, 스프링의 IoC 컨테이너가 객체를 생성해주고
    // 그것을 주입받음
	
	public static void main(String[] args) {
//		bean.sayHello("스프링 5!");
//		bean.sayHello("Spring 5!");
//		bean.sayHello("スプリング 5!");
		
		HelloSpring5Bean03 bean = 
				HelloSpring5Bean04Factory.create("kor");
		bean.sayHello("스프링 5!");
		
		bean = HelloSpring5Bean04Factory.create("eng");
		bean.sayHello("Spring 5!");
		
		bean = HelloSpring5Bean04Factory.create("jpn");
		bean.sayHello("スプリング 5!");
		
	}
	
}
