package jp.co.rpg.たたかうコマンドのサンプル;

public class attackSample {

	//抽象クラス
	public abstract class Chara {

		public abstract BattleInfo win();

		public BattleInfo attack(Chara opponent) {

			BattleInfo bi = new BattleInfo();

			//攻撃
			bi.strings = this.GetName() + は + opponent.getName + に + this.power() + のダメージを与えた。;
			this.setHp(this.getHp -= opponent.power());

			//HP0チェック
			if(opponent.getHp() <= 0) {
				 //ユーザーか敵かで処理が違う
				return win(bi, opponent);
			}else {
				bi.isContinue = ture;
				return bi;
			}
		}
	}

	//Chara継承先はエンティティ
	//User
	public class User extends Chara{
		//カラムごとのフィールドとゲッターセッターがある

		@Override
		//ユーザー勝利の場合
		public BattleInfo win(BattleInfo bi, Chara opponent) {
			//経験値増加
			this.setXp(this.getXp += opponent.getDropXp());
			//お金増加
			this.setGold(this.getGold += opponent.getDropGold());
			//javascript側で使う勝利フラグ
			bi isWin = true;

			bi Strings += opponent.getName() + を倒した。 + opponent.getDropXp() + opponent.getDropGold() + 手に入れた。;

			//LVアップ
			if(this.getXp >= 次のレベルに必要な経験値) {
				bi = this.levelUp(bi);
			}

			return bi;
		}

		//LVアップメソッド
		public BattleInfo levelUp(BattleInfo bi) {
			bi Strings += レベルが上がった！;

			乱数 ran = 20~40;
			this.setHp(this.getHp() += ran);
			bi Strings += HPが + ran + 上がった;

			ran = 10~20;
			this.setMp(this.Mp() += ran);
			bi Strings += MPが + ran + 上がった;

			ran = 2~5;
			this.setPower(this.getPower() += ran);
			bi Strings += 力が + ran + 上がった;

			//などをステータス分書く。

			return bi;
		}
	}

	//Charaの継承先はエンティティ
	//Enemy
	public class Enemy extends Chara{
		//カラムごとのフィールドとゲッターセッターがある

		@Override
		//敵勝利の場合
		public BattleInfo win(Battleinfo bi, Chara opponent) {
			//ユーザーはお金を半分失う
			opponent.setGold(opponent.getGold()/2);
			//javascript側で使う敗北フラグ
			bi isWin = false;

			bi Strings += opponent.getName() + は負けてしまった;

			return bi;

		}
	}

}
