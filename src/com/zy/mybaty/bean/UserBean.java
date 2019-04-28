package com.zy.mybaty.bean;

public class UserBean {
	//主键
	private String id;
	private String username;
	private String password;
	private String account;
	public UserBean(){

	   
    }
    public UserBean(String username,String password,String account){
    	this.username=username;
    	this.password=password;
    	this.account=account;
	   
    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
}
