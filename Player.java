import java.util.ArrayList;

public class Player extends Person{

	public static void main(String[] args){}

	// TODO Auto-generated method stub
	private String name; // 玩家姓名
	private int chips; // 玩家現有籌碼
	private int bet; // 玩家此局下注的籌碼
	//private ArrayList<Card> oneRoundCard; // 此牌局的卡
    
	public Player(String name, int chips) {// Player
											// constructor，新增Player物件時，需要姓名、擁有的籌碼等兩個參數
		this.name = name;
		this.chips = chips;
	}

	public String getName() {// name的getter
		return name;
	}

	public int makeBet() {// 下注
		if (chips >= 1)// 檢查籌碼是否大於要下注的錢
			bet = 1;
		else
			bet = 0;
		
		//chips = chips - bet;
		return bet;
	}

	/*public void setOneRoundCard(ArrayList cards) { // 設定此牌局所得到的卡 setter

		oneRoundCard = cards;
	} */

	public boolean hit_me(Table table) {// 是否要牌，是回傳true，不再要牌則回傳false
        
		
        
		if (getTotalValue() <= 16) {
			// 基本參考條件：16點以下要牌，17點以上不要牌
			return true;
		} else
			return false;
		// 提示：用oneRoundCard來算
	}

	/*public int getTotalValue() {
		int sum=0;
		for (int i = 0; i < oneRoundCard.size(); i++) {
			if(oneRoundCard.get(i).getRank()>=11&&oneRoundCard.get(i).getRank()<=13){//卡牌1~13 都算10
			sum = sum + 10;}
			if(sum<=10&&oneRoundCard.get(i).getRank()==1)//如果小於等於10才把ACE當11/
				sum=sum+11;
			else
				sum=sum+oneRoundCard.get(i).getRank();//其餘就照加
		}
		return sum;
		// 回傳此牌局所得的卡點數加總
	}*/

	public int getCurrentChips() {
		return chips;
	}

	// 回傳玩家現有籌碼
	public void increaseChips(int diff) {

		chips = chips + diff;
		// 玩家籌碼變動，setter
	}

	public void sayHello() {// (5pt)
		// 玩家Say Hello
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
	}
	
	
}
