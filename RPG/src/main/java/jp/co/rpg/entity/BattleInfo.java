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

	private User user;
	private Enemy enemy;

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

	public Enemy getEnemy() {
		return enemy;
	}

	public void setEnemy(Enemy enemy) {
		this.enemy = enemy;
	}

}
