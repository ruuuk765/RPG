package jp.co.rpg.entity;

public class Enemy extends Chara {


	private Integer appearLv;
	private Integer dropXp;
	private Integer dropGold;

//	getter setter
	public Integer getAppearLv() {
		return appearLv;
	}
	public void setAppearLv(Integer appearLv) {
		this.appearLv = appearLv;
	}
	public Integer getDropXp() {
		return dropXp;
	}
	public void setDropXp(Integer dropXp) {
		this.dropXp = dropXp;
	}
	public Integer getDropGold() {
		return dropGold;
	}
	public void setDropGold(Integer dropGold) {
		this.dropGold = dropGold;
	}
	@Override
	public void winner(BattleInfo bi, Chara chara) {
		User user = (User)chara;
		user.setGold(user.getGold() / 2);
		bi.setContext(user.getName() + "は、まけてしまった。<br>"
				+ "所持金が半分になった。");
		bi.setStatus("lose");

	}
	@Override
	public void MagicAttack(BattleInfo bi, Chara chara) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
