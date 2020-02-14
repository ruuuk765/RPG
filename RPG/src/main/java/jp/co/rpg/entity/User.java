package jp.co.rpg.entity;

public class User {

	// フィールド
	private Integer id;
	private String userId;
	private String password;
	private String name;
	private Integer roleId;
	private Integer lv;
	private Integer maxHp;
	private Integer hp;
	private Integer maxMp;
	private Integer mp;
	private Integer power;
	private Integer intelligence;
	private Integer defense;
	private Integer speed;
	private Integer xp;
	private Integer gold;
	private Integer sinceDays;
	private String createDate;
	private String updataDate;
	private Integer adminFlg;
	private Integer clearFlg;
	private Integer deleteFlg;

	// getter setter
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public Integer getLv() {
		return lv;
	}
	public void setLv(Integer lv) {
		this.lv = lv;
	}
	public Integer getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(Integer maxHp) {
		this.maxHp = maxHp;
	}
	public Integer getHp() {
		return hp;
	}
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	public Integer getMaxMp() {
		return maxMp;
	}
	public void setMaxMp(Integer maxMp) {
		this.maxMp = maxMp;
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
	public Integer getXp() {
		return xp;
	}
	public void setXp(Integer xp) {
		this.xp = xp;
	}
	public Integer getGold() {
		return gold;
	}
	public void setGold(Integer gold) {
		this.gold = gold;
	}
	public Integer getSinceDays() {
		return sinceDays;
	}
	public void setSinceDays(Integer sinceDays) {
		this.sinceDays = sinceDays;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdataDate() {
		return updataDate;
	}
	public void setUpdataDate(String updataDate) {
		this.updataDate = updataDate;
	}
	public Integer getAdminFlg() {
		return adminFlg;
	}
	public void setAdminFlg(Integer adminFlg) {
		this.adminFlg = adminFlg;
	}
	public Integer getClearFlg() {
		return clearFlg;
	}
	public void setClearFlg(Integer clearFlg) {
		this.clearFlg = clearFlg;
	}
	public Integer getDeleteFlg() {
		return deleteFlg;
	}
	public void setDeleteFlg(Integer deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

}
