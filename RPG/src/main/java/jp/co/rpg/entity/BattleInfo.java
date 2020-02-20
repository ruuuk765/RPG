package jp.co.rpg.entity;

import java.util.ArrayList;
import java.util.List;

public class BattleInfo {

	private static final String CONTINUE = "continue";
	private static final String WIN = "win";
	private static final String LOSE = "lose";

	private List<String> context = new ArrayList<String>();
	private String status = CONTINUE;
	private Integer userHp;
	private Integer userMp;
	private boolean isMagic = false;

	private User user;

	public List<String> getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context.add(context);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String s) {
		switch(s) {
		case "win":
			this.status = WIN;
			break;
		case "lose":
			this.status = LOSE;
			break;
		default:

			this.status = CONTINUE;
			break;
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
		this.userHp = user.getHp();
		this.userMp = user.getMp();
	}

	public Integer getUserHp() {
		return userHp;
	}

	public void setUserHp(Integer userHp) {
		this.userHp = userHp;
	}

	public Integer getUserMp() {
		return userMp;
	}

	public void setUserMp(Integer userMp) {
		this.userMp = userMp;
	}

	public boolean getIsMagic() {
		return isMagic;
	}

	public void setIsMagic(boolean bool) {
		this.isMagic = bool;
	}



}
