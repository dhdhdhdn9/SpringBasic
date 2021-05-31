package sjk.spring.annotation;

import org.springframework.stereotype.Repository;

import sjk.spring.sungjuk.SungJuk;
import sjk.spring.sungjuk.SungJukDAO;

/*DAO class에서 쓰인다.
DataBase에 접근하는 method를 가지고 있는 Class에서 쓰인다.
괄호 안에는 호출하고자하는 Repository 패키지 내의 코드(DB에 접근하는 모든 코드)를 넣는다.*/
@Repository("sdao")
public class SungJukDAOImpl implements SungJukDAO {

	@Override
	public void insertSungJuk(SungJuk sj) {
		System.out.println("성적 추가 완료!");
	}

}
