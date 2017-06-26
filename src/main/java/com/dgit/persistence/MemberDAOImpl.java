package com.dgit.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dgit.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	//어느 mapper를 사용할 지 결정
	private static final String namespace = "com.dgit.mapper.MemberMapper";

	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace + ".getTime"); //MemberMapper.xml 내 함수이름(getTime)
	}

	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace + ".insertMember", vo);
	}

	@Override
	public MemberVO readMember(String userId) throws Exception {
		return sqlSession.selectOne(namespace + ".readMember", userId);
	}

	@Override
	public MemberVO readWithPW(String userId, String userPw) throws Exception {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("userId", userId);
		paramMap.put("userPw", userPw);
		
		sqlSession.selectOne(namespace + ".readWithPW", paramMap);
		return null;
	}

	@Override
	public List<MemberVO> listMember() {
		sqlSession.selectList(namespace + ".listMember");
		return null;
	}

	@Override
	public void updateMember(MemberVO vo, String userId) {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("vo", vo);
		paramMap.put("userId", userId);
		
		sqlSession.update(namespace + ".updateMember", paramMap);
	}

	@Override
	public void deleteMember(String userId) {
		sqlSession.delete(namespace + ".deleteMember", userId);
	}

}
