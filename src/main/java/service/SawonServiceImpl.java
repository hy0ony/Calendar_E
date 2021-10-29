package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.SawonDAO;
import vo.SawonVO;

@Service
public class SawonServiceImpl implements SawonService{

	@Autowired
	private SawonDAO dao;
	
	// 회원가입
	@Override
	public void sawonRegister(SawonVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.sawonRegister(vo);
	}

	// 로그인
	@Override
	public SawonVO login(SawonVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dao.login(vo);
	}

	// 회원정보 수정
	@Override
	public void sawonUpdate(SawonVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.sawonUpdate(vo);
	}

	// 회원탈퇴
	@Override
	public void sawonDelete(SawonVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.sawonDelete(vo);
	}
	
	

}
