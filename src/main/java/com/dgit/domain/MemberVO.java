package com.dgit.domain;

import java.util.Date;

public class MemberVO {
	private String userId;
	private String userPw;
	private String userName;
	private String email;
	private Date regdate;
	private Date updatedate;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	
	@Override
	public String toString() {
		return String.format("MemberVO [userId=%s, userPw=%s, userName=%s, email=%s, regdate=%s, updatedate=%s]",
				userId, userPw, userName, email, regdate, updatedate);
	}
}
