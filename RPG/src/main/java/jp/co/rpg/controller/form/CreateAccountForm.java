package jp.co.rpg.controller.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CreateAccountForm {

	// フィールド
	@NotBlank(message="※入力してください")
	private String userId;
	@NotNull(message="※入力してください")
	private String password;
	@NotNull(message="※入力してください")
	private String passwordCheck;
	@NotNull(message="※入力してください")
	private String name;
	@NotNull(message="※入力してください")
	private Integer roleId;

	// getter setter
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordCheck() {
		return passwordCheck;
	}
	public void setPasswordCheck(String passwordCheck) {
		this.passwordCheck = passwordCheck;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}


}
