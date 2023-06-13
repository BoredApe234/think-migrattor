package com.mps.think.setup.vo;

public class StatecodeVO {
	
	private Integer id;
	private String country;
	private String state;
	private String scode;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getScode() {
		return scode;
	}
	public void setScode(String scode) {
		this.scode = scode;
	}
	@Override
	public String toString() {
		return "StatecodeVO [id=" + id + ", country=" + country + ", state=" + state + ", scode=" + scode + "]";
	}
	
	

}
