import java.util.ArrayList;
import java.util.Random;

public class Deck {

	
			private ArrayList<Card> cards;
			private ArrayList<Card> usedCard;
			private ArrayList openCard;//打開的牌
			public int nUsed=0;
			public Deck(int nDeck){
				cards=new ArrayList<Card>();
				usedCard=new ArrayList<Card>();
				openCard=new ArrayList<Card>();
				//1 Deck have 52 cards, https://en.wikipedia.org/wiki/Poker
				//Hint: Use new Card(x,y) and 3 for loops to add card into deck
				//Sample code start
				//Card card=new Card(1,1); ->means new card as clubs ace
				//cards.add(card);
				//Sample code end
				for(int n=1; n<=nDeck; n++){//first, run the for loop of how much is n(nDeck)
				    for(Card.Suit s: Card.Suit.values()){//Suit put outside finish one suit(ex. clubs >diamond>....)
					    for(int j=1; j<=13; j++){//same suit: rank i=1... to i=13 (clubs 1-13 then diamond1-13
						  Card card=new Card(s,j);//instance method need to new and then it just can be used
						  cards.add(card);//use newed object to put card in ArrayList cards裡
					    }
				    }
				}
                shuffle();//先洗牌
			}	
			//TODO: Please implement the method to print all cards on screen (10 points)
			public void printDeck(){
				//Hint: print all items in ArrayList<Card> cards, 
				//TODO: please implement and reuse printCard method in Card class (5 points)
		        int Size= cards.size();
		        for(int i=0; i<Size; i++){//java index從0開始而非1
		        	cards.get(i).printCard();//Card c= cards.get(i); c=printCard();
		        	
		        }
			}
			public Card getOneCard(boolean isOpend){
				Card Nowcard;
				Nowcard=cards.get(nUsed);//發某張牌(看現在輪到哪我用nUsed來計數) 
				//System.out.println(Nowcard);
				usedCard.add(cards.get(nUsed));//記錄用過的牌
				//System.out.println(Nowcard);
				nUsed++;//nUsed計數,表示發了一張了待會再呼叫發卡片就會發下一張
				if(isOpend){
					openCard.add(Nowcard);
				}
				//問:有點疑惑洗牌和判斷是不是放這邊
				if (usedCard.size()==cards.size()){/*因為我採用的方式不是發完就刪掉那張牌，而是直接發到下一張，
				所以牌還在,因此牌總數其實沒變動，所以當用過卡數=沒變動的完整卡數就表示發完了*/
					shuffle();//發完了就重洗牌
				}
				
				
				return Nowcard;
			}
			
			public void shuffle(){
				Random rnd= new Random();
				Card Tempcard;//用來暫存要交換的卡
				//int j=rnd.nextInt(cards.size()+1);
				//
				for(int i=0; i<cards.size(); i++){//都先假設現在是一副牌的狀況 0~51<52 52張 我要從第一張 cards index0開始洗牌
					
					int j=rnd.nextInt(cards.size());//隨機產生0~51 
					while(j==i){
					j=rnd.nextInt(cards.size());//我不要讓他跟自己交換	
					}
					Tempcard=cards.get(i);//先暫時存目前的這張卡片
					cards.set(i, cards.get(j));//將隨機的某張牌(j)拿來和目前輪到的這張牌換
					cards.set(j, Tempcard);//地j張牌此時也跟原本輪到的第i張牌交換
				}
				
						
			    /*for(int i=0;i<usedCard.size(); i++){
				usedCard.remove(i);
			    }	//Card c= cards.get(i); c=printCard();*/
				openCard.clear();
				usedCard.clear();//用過的卡清空
			    nUsed=0;//nUsed用(發)過的卡數清空
				
			}
			
			
			public ArrayList<Card> getAllCards(){
				return cards;
			}
			public ArrayList<Card> getOpenedCard(){
				return openCard;
			}
		}
	


