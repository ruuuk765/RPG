package jp.co.rpg.entity;

public class User extends Chara{

	// フィールド
	private String userId;
	private String password;
	private Role role;
	private Integer lv;
	private Integer maxHp;
	private Integer maxMp;
	private Integer xp;
	private Integer gold;
	private Integer sinceDays;
	private String createDate;
	private String updateDate;
	private Integer adminFlg;
	private Integer clearFlg;
	private Integer deleteFlg;

//	コンストラクタ
	public User() {

	}
	public User(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}

//	getter setter
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
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

	public Integer getMaxMp() {
		return maxMp;
	}

	public void setMaxMp(Integer maxMp) {
		this.maxMp = maxMp;
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
	@Override
	public void winner(BattleInfo bi, Chara chara) {
		Enemy enemy = (Enemy)chara;
		xp = xp + enemy.getDropXp();
		gold = gold + enemy.getDropGold();
		bi.setContext(enemy.getName() + "を倒した。<br>"
				+ enemy.getDropGold() + "G を獲得した。<br>"
				+ enemy.getDropXp() + "xp を獲得した。");

//		レベルアップの確認


		bi.setStatus("win");
	}
}
