package com.dgit.ex00;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dgit.domain.MemberVO;
import com.dgit.persistence.MemberDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDaoTest {
	@Autowired
	private MemberDao dao;
	
	//@Test
	public void testTime(){
		System.out.println(dao.getTime());
	}
	
//	@Test
	public void testInsertMember(){
		MemberVO vo = new MemberVO();
		vo.setUserId("user01");
		vo.setUserPw("user00");
		vo.setUserName("user00");
		vo.setEmail("user00@naver.com");
		
		dao.insertMember(vo);
	}
	
	@Test
	public void testReadMember() throws Exception{
		dao.readMember("user00");
	}
	
//	@Test
	public void testReadWithPW() throws Exception{
		//dao.readWithPW("user00", "user00");
	}
	
	
//	@Test
	public void testListMember(){
		dao.listMember();
	}
	
//	@Test
	public void testUpdateMember(){
		MemberVO vo = new MemberVO();
		vo.setUserId("user1");
		vo.setUserPw("user1");
		vo.setUserName("user1");
		vo.setEmail("user1@naver.com");
		
		dao.updateMember(vo, "user00");
	}
	
//	@Test
	public void testDeleteMember(){
		dao.deleteMember("user01");
	}
}
