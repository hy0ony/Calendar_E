package service;

import vo.SawonVO;

public interface SawonService {
	
	// 회원가입
	public void sawonRegister(SawonVO vo) throws Exception;
	
	// 로그인
	public SawonVO login(SawonVO vo) throws Exception;
	
	// 회원정보 수정
	public void sawonUpdate(SawonVO vo) throws Exception;
	
	// 회원탈퇴
	public void sawonDelete(SawonVO vo) throws Exception;

}
