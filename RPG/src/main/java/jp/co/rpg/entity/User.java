package jp.co.rpg.entity;

public class User implements Chara{

	// フィールド
	private Integer id;
	private String userId;
	private String password;
	private String name;
	private Role role;
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
	private String updateDate;
	private Integer adminFlg;
	private Integer clearFlg;
	private Integer deleteFlg;

	public User() {

	}

	public User(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}
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
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	public void setRoleId(Integer roleId) {
		if(role == null)
			role = new Role();
		role.setId(roleId);
	}

	public void setRoleName(String roleName) {
		if(role == null)
			role = new Role();
		role.setName(roleName);
	}
	public Role getRole() {
		return this.role;
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
	@Override
	public Integer getHp() {
		return hp;
	}
	@Override
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	public Integer getMaxMp() {
		return maxMp;
	}
	public void setMaxMp(Integer maxMp) {
		this.maxMp = maxMp;
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
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
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
