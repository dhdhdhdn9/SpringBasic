package sjk.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sjk.spring.sungjuk.SungJuk;
import sjk.spring.sungjuk.SungJukDAO;
import sjk.spring.sungjuk.SungJukService;

/*Service Class에서 쓰인다.
비즈니스 로직을 수행하는 Class라는 것을 나타내는 용도이다.
괄호 안에는 호출하고자하는 Service 패키지 내의 코드(비즈니스 로직과 관련된 모든 코드)를 넣는다*/
@Service("sjsrv")
public class SungJukServiceImpl implements SungJukService {

	/* 필요한 의존 객체의 “타입"에 해당하는 빈을 찾아 주입한다.
	 * 타입: 생성자, setter, 필드
	 * Autowired는 기본값이 true이기 때문에 
	 * 의존성 주입을 할 대상을 찾지 못한다면 애플리케이션 구동에 실패한다.*/
	@Autowired 
	private SungJukDAO sdao;

	@Override
	public void newSungJuk() {
		SungJuk sj = new SungJuk("혜교", 99, 96, 76);
		// 뭔가 처리를 한 다음,
		System.out.println("성적 생성 완료!");
		sdao.insertSungJuk(sj);
	}	

}
