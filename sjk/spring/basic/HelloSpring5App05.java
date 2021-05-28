package sjk.spring.basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import sjk.spring.beans.HelloSpring5Bean03;
import sjk.spring.beans.HelloSpring5Bean04Factory;

public class HelloSpring5App05 {
	
	// 스프링 프레임워크 첫번째 사례
    // 이전 예제에서는 factory 패턴을 이용해서
    // 객체를 생성하는 코드를 작성했었음
    // 하지만, 스프링을 사용하면 이러한 과정은 필요 X
	
	// 스프링 프레임워크
    // DI, IoC, AOP를 적용한 콘솔/GUI/웹 응용프로그램 개발에
    // 사용하는 오픈소스 라이브러리
    // 복잡한 절차를 요구하고 비용이 많이 드는 EJB에 비해
    // 사용이 간단하고, 무료 서블릿 컨테이너에도
    // 무난히 실행됨
	
	// 스프링을 이용한 개발의 필수 요건은 인터페이스 기반 설계임

    // 추가 라이브러리
    // spring-core
    // spring-beans
	
	
	// 실행원리
    // 예제에서 보듯 객체 생성시 new 연산자를 사용하지 않고
    // 스프링이 대신 객체를 생성하고 프로그램에서는
    // DI를 통해 이것을 사용함

    // 1. bean05.xml에 스프링 컨테이너가 미리 생성해두어야 할
    // 객체와 이름을 정의해 둠
    // 2. 프로그램이 실행되면, bean05.xml에 작성한 객체정보를
    // 스프링 컨터이너가 읽어서 객체를 만들어 둠
    // 3. BeanFactry에서 getBean이라는 메서드로
    // 해당 객체를 가져와서 HelloSpring5Bean03 변수에 주입
    // 4. 이 변수의 sayHello 메서드를 호출하고 인삿말 출력
	
	
	// 스프링 컨테이너
    // 스프링 기반 프로그램은 일반적으로 스프링 컨테이너를
    // 통해 객체가 생성되고 소멸함
    // 즉, 객체(bean)의 생명주기를 관리하는 특수한 프로그램

    // 스프링에서는 2가지의 스프링 컨테이너를 제공
    // BeanFactory : DI에 대한 기본적인 기능만 제공
    // ApplicationContext : BeanFactory를 확장해 다양한 기능제공

	
	public static void main(String[] args) {
		
		BeanFactory bf = new XmlBeanFactory(
				new FileSystemResource("src/bean05.xml"));
		
		HelloSpring5Bean03 bean = 
				(HelloSpring5Bean03) bf.getBean("kor");
		bean.sayHello("스프링 5!");
		
//		타입변환
		bean = (HelloSpring5Bean03) bf.getBean("eng");
		bean.sayHello("Spring 5!");
		
		bean = (HelloSpring5Bean03) bf.getBean("jpn");
		bean.sayHello("スプリング 5!");
		
	}
	
}
