package com.estsoft.mysite.vo;

public class GuestbookVo {
	private Long no;
	private String name;
	private String regDate;
	private String password;
	private String message;
	private Long no2;
	
	public Long getNo2() {
		return no2;
	}
	public void setNo2(Long no2) {
		this.no2 = no2;
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "GuestbookVo [no=" + no + ", name=" + name + ", regDate=" + regDate + ", password=" + password
				+ ", message=" + message + "]";
	}
}