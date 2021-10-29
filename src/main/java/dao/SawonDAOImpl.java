package dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vo.SawonVO;

@Repository
public class SawonDAOImpl implements SawonDAO{
	
	@Autowired
	private SqlSession sql;

	// 회원가입
	@Override
	public void sawonRegister(SawonVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.insert("sawonMapper.sawonRegster", vo);
	}

	// 로그인
	@Override
	public SawonVO login(SawonVO vo) throws Exception {
		// TODO Auto-generated method stub
		return sql.selectOne("sawonMapper.login", vo);
	}

	// 회원정보 수정
	@Override
	public void sawonUpdate(SawonVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.update("sawonMapper.sawonUpdate", vo);
		
	}

	// 회원탈퇴
	@Override
	public void sawonDelete(SawonVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.delete("sawonMapper.sawonDelete", vo);
	}

}
