import java.util.ArrayList;

public class Player extends Person{

	public static void main(String[] args){}

	// TODO Auto-generated method stub
	private String name; // ���a�m�W
	private int chips; // ���a�{���w�X
	private int bet; // ���a�����U�`���w�X
	//private ArrayList<Card> oneRoundCard; // ���P�����d
    
	public Player(String name, int chips) {// Player
											// constructor�A�s�WPlayer����ɡA�ݭn�m�W�B�֦����w�X����ӰѼ�
		this.name = name;
		this.chips = chips;
	}

	public String getName() {// name��getter
		return name;
	}

	public int makeBet() {// �U�`
		if (chips >= 1)// �ˬd�w�X�O�_�j��n�U�`����
			bet = 1;
		else
			bet = 0;
		
		//chips = chips - bet;
		return bet;
	}

	/*public void setOneRoundCard(ArrayList cards) { // �]�w���P���ұo�쪺�d setter

		oneRoundCard = cards;
	} */

	public boolean hit_me(Table table) {// �O�_�n�P�A�O�^��true�A���A�n�P�h�^��false
        
		
        
		if (getTotalValue() <= 16) {
			// �򥻰Ѧұ���G16�I�H�U�n�P�A17�I�H�W���n�P
			return true;
		} else
			return false;
		// ���ܡG��oneRoundCard�Ӻ�
	}

	/*public int getTotalValue() {
		int sum=0;
		for (int i = 0; i < oneRoundCard.size(); i++) {
			if(oneRoundCard.get(i).getRank()>=11&&oneRoundCard.get(i).getRank()<=13){//�d�P1~13 ����10
			sum = sum + 10;}
			if(sum<=10&&oneRoundCard.get(i).getRank()==1)//�p�G�p�󵥩�10�~��ACE��11/
				sum=sum+11;
			else
				sum=sum+oneRoundCard.get(i).getRank();//��l�N�ӥ[
		}
		return sum;
		// �^�Ǧ��P���ұo���d�I�ƥ[�`
	}*/

	public int getCurrentChips() {
		return chips;
	}

	// �^�Ǫ��a�{���w�X
	public void increaseChips(int diff) {

		chips = chips + diff;
		// ���a�w�X�ܰʡAsetter
	}

	public void sayHello() {// (5pt)
		// ���aSay Hello
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
	}
	
	
}
