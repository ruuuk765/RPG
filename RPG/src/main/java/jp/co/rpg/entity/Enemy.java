package jp.co.rpg.entity;

public class Enemy {

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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAppearLv() {
		return appearLv;
	}
	public void setAppearLv(Integer appearLv) {
		this.appearLv = appearLv;
	}
	public Integer getHp() {
		return hp;
	}
	public void setHp(Integer hp) {
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
