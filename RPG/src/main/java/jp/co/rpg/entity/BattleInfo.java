package jp.co.rpg.entity;

import java.util.ArrayList;
import java.util.List;

public class BattleInfo {
	private List<String> context = new ArrayList<String>();
	private boolean isContinue = false;
	private Integer hp;
	private Integer mp;

	public List<String> getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context.add(context);
	}

	public boolean getIsContinue() {
		return isContinue;
	}

	public void setIsContinue(boolean bool) {
		this.isContinue = bool;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public void setMp(Integer mp) {
		this.mp = mp;
	}
}
