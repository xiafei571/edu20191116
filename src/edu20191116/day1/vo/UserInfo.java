package edu20191116.day1.vo;

import java.util.Date;

public class UserInfo {

	private Integer uid;

	private String loginId;

	private String userName;

	private String password;

	private String email;

	private String phone;

	private int valid;

	private Date gmt_create;

	private Date gmt_modified;

	// 开关
	private Integer onOff;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getValid() {
		return valid;
	}

	public void setValid(int valid) {
		this.valid = valid;
	}

	public Date getGmt_create() {
		return gmt_create;
	}

	public void setGmt_create(Date gmt_create) {
		this.gmt_create = gmt_create;
	}

	public Date getGmt_modified() {
		return gmt_modified;
	}

	public void setGmt_modified(Date gmt_modified) {
		this.gmt_modified = gmt_modified;
	}

	public UserInfo(Integer uid, String loginId, String userName, String password, String email, String phone,
			int valid, Date gmt_create, Date gmt_modified) {
		super();
		this.uid = uid;
		this.loginId = loginId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.valid = valid;
		this.gmt_create = gmt_create;
		this.gmt_modified = gmt_modified;
	}

	public UserInfo() {

	}

	@Override
	public String toString() {
		return "userName:" + this.userName;
	}

	public Integer getOnOff() {
		return onOff;
	}

	public void setOnOff(Integer onOff) {
		this.onOff = onOff;
	}
}
