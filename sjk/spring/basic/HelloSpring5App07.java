package sjk.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import sjk.spring.beans.HelloSpring5Bean03;

public class HelloSpring5App07 {
	
	// 지금까지의 스프링 프레임워크 사용방법
    // 1. DI할 bean 객체를 Ioc컨테이너에 등록
    //                      => xml bean 정의
    // 2. 등록된 bean 객체를 필요한 곳에 DI
    //                      => autowiring
	
	// xml bean 정의 최소화
    // DI를 사용하려면 먼저 bean 정의파일에 <bean> 선언
    // DI 방법은 생성자(<construtor-arg>)나
    // setter(<property>) 중 하나를 선택함
    // 하지만, DI를 적용할 bean의 갯수가 늘어나면
    // bean 정의파일에 작성할 태그도 늘어남 - 귀찮음
	
	// 물론, autowired라는 속성을 이용하면
    // <construtor-arg>나 <property>태그를 생략가능하지만
    // 근본적인 해결책은 아님
	
	// 스프링에 애노테이션을 도입한 계기
    // 구글의 '밥 리'라는 사람이
    // 'xml만으로 DI를 설정하는 스프링은 즐~!' 이라고
    // 비난하고, 애노테이션 기반의 초경량 DI 프레임워크를 만듦
    // 결국, 스프링 2.5부터 애노테이션을 지원하기 시작함

    // 작성해야 하는 태그를 줄이는 방법
    // <context:anntation-config>를 사용하면
    // bean를 줄일 수 있음
    // <context:component-scan>을 사용하면
    // 아예 bean 설정을 생략할 수 있음
	
	// 스프링 핵심 애노테이션
    // @Resource
    // @Qualifer
    // @Autowired : DI 적용시 사용, 스프링 표준
    // @Inject    : DI 적용시 사용, 자바 표준
    // @Component : 일반적인 클래스 객체에 사용 (Bean 정의 시 사용)
    // @Service   : 주로 서비스 객체에 사용 (Bean 정의 시 사용)
    // @Repository : 주로 DAO 객체에 사용 (Bean 정의 시 사용)
    // @Controller : 주로 MVC 객체에 사용
	
	//추가 라이브러리
	// spring-aop


	public static void main(String[] args) {
		ApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/bean05.xml");
		
		HelloSpring5Bean03 bean = 
				(HelloSpring5Bean03) ctx.getBean("kor");
		bean.sayHello("스프링 5!");
		
		bean = (HelloSpring5Bean03) ctx.getBean("eng");
		bean.sayHello("Spring 5!");
		
		bean = (HelloSpring5Bean03) ctx.getBean("jpn");
		bean.sayHello("スプリング 5!");

	}

}
