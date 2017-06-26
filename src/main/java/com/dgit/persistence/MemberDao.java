package com.dgit.persistence;

import java.util.List;

import com.dgit.domain.MemberVO;

public interface MemberDao {
	public String getTime();
	public void insertMember(MemberVO vo);
	public MemberVO readMember(String userId) throws Exception;
	public MemberVO readWithPW(String userId, String userPw) throws Exception;
	public List<MemberVO> listMember();
	public void updateMember(MemberVO vo, String userId);
	public void deleteMember(String userId);
}
