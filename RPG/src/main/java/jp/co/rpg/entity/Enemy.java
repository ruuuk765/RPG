package jp.co.rpg.entity;

public class Enemy implements Chara {

	private Integer id;
	private String name;
	private Integer appearLv;
	private Integer hp;
	private Integer mp;
	private Integer power;
	private Integer intelligence;
	private Integer defense;
	private Integer speed;
	private Integer dropXp;
	private Integer dropGold;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAppearLv() {
		return appearLv;
	}
	public void setAppearLv(Integer appearLv) {
		this.appearLv = appearLv;
	}
	@Override
	public Integer getHp() {
		return hp;
	}
	@Override
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	@Override
	public Integer getMp() {
		return mp;
	}
	@Override
	public void setMp(Integer mp) {
		this.mp = mp;
	}
	@Override
	public Integer getPower() {
		return power;
	}
	@Override
	public void setPower(Integer power) {
		this.power = power;
	}
	@Override
	public Integer getIntelligence() {
		return intelligence;
	}
	@Override
	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}
	@Override
	public Integer getDefense() {
		return defense;
	}
	@Override
	public void setDefense(Integer defense) {
		this.defense = defense;
	}
	@Override
	public Integer getSpeed() {
		return speed;
	}
	@Override
	public void setSpeed(Integer speed) {
		this.speed = speed;
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
}
