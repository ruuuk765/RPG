package jp.co.rpg.entity;

public interface Chara {

	Integer getHp();

	void setHp(Integer hp);

	Integer getMp();

	void setMp(Integer mp);

	Integer getPower();

	void setPower(Integer power);

	Integer getIntelligence();

	void setIntelligence(Integer intelligence);

	Integer getDefense();

	void setDefense(Integer defense);

	Integer getSpeed();

	void setSpeed(Integer speed);

	void setName(String name);

	String getName();

}
