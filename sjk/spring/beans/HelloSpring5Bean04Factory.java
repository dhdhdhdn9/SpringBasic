package sjk.spring.beans;

public class HelloSpring5Bean04Factory {

	// HelloSpring5Bean03 타입의 객체를 만드는 공장Factory라는 의미
	// 인삿말을 출력하는 객체를 생성하는 create 메서드 정의

	public static HelloSpring5Bean03 create(String type) {
			HelloSpring5Bean03 obj = null;
			
			if(type.equalsIgnoreCase("kor"))
				obj = new HelloSpring5Bean03Kor();
			else if (type.equalsIgnoreCase("eng"))
				obj = new HelloSpring5Bean03Eng();
			else if (type.equalsIgnoreCase("jpn"))
				obj = new HelloSpring5Bean03Jpn();
			
			return obj;
	}

}
