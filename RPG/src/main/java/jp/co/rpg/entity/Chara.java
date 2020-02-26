package jp.co.rpg.entity;

public abstract class Chara {

	protected Integer id;
	protected String name;
	protected Integer hp;
	protected Integer mp;
	protected Integer power;
	protected Integer intelligence;
	protected Integer defense;
	protected Integer speed;


//	バトル計算処理
	public boolean battleCalc(BattleInfo bi,Chara chara) {

		boolean isCountinue = true;
		Integer damage = 0;

		if(bi.getIsMagic()) {
			//まほう
			spellMagic(bi, chara);
		}else {
			//たたかう
			damage = this.getPower() - chara.getDefense();
			if(damage <0)
				//最低ダメージは1とする
				damage = 1;
			bi.setContext(this.getName() + "は、" + chara.getName() + "に" + damage + "ダメージあたえた");
		}
		Integer remainHp = chara.getHp() - damage;

		//HPチェック
		if(remainHp <= 0) {
			//勝利or敗北
			win(bi, chara);
			isCountinue = false;
		}
		chara.setHp(remainHp);
		return isCountinue;
	}

	public abstract void win(BattleInfo bi, Chara chara);

	public abstract void spellMagic(BattleInfo bi, Chara chara);


	//	getter setter
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHp() {
		return hp;
	}
	public void setHp(Integer hp) {
		if(hp < 0)
			hp = 0;
		this.hp = hp;
	}
	public Integer getMp() {
		return mp;
	}
	public void setMp(Integer mp) {
		this.mp = mp;
	}
	public Integer getPower() {
		return power;
	}
	public void setPower(Integer power) {
		this.power = power;
	}
	public Integer getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}
	public Integer getDefense() {
		return defense;
	}
	public void setDefense(Integer defense) {
		this.defense = defense;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
}