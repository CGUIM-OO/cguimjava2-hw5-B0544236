import java.util.ArrayList;
import java.util.Random;

public class Deck {

	
			private ArrayList<Card> cards;
			private ArrayList<Card> usedCard;
			private ArrayList openCard;//���}���P
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
						  cards.add(card);//use newed object to put card in ArrayList cards��
					    }
				    }
				}
                shuffle();//���~�P
			}	
			//TODO: Please implement the method to print all cards on screen (10 points)
			public void printDeck(){
				//Hint: print all items in ArrayList<Card> cards, 
				//TODO: please implement and reuse printCard method in Card class (5 points)
		        int Size= cards.size();
		        for(int i=0; i<Size; i++){//java index�q0�}�l�ӫD1
		        	cards.get(i).printCard();//Card c= cards.get(i); c=printCard();
		        	
		        }
			}
			public Card getOneCard(boolean isOpend){
				Card Nowcard;
				Nowcard=cards.get(nUsed);//�o�Y�i�P(�ݲ{�b������ڥ�nUsed�ӭp��) 
				//System.out.println(Nowcard);
				usedCard.add(cards.get(nUsed));//�O���ιL���P
				//System.out.println(Nowcard);
				nUsed++;//nUsed�p��,��ܵo�F�@�i�F�ݷ|�A�I�s�o�d���N�|�o�U�@�i
				if(isOpend){
					openCard.add(Nowcard);
				}
				//��:���I�ôb�~�P�M�P�_�O���O��o��
				if (usedCard.size()==cards.size()){/*�]���ڱĥΪ��覡���O�o���N�R�����i�P�A�ӬO�����o��U�@�i�A
				�ҥH�P�٦b,�]���P�`�ƨ��S�ܰʡA�ҥH��ιL�d��=�S�ܰʪ�����d�ƴN��ܵo���F*/
					shuffle();//�o���F�N���~�P
				}
				
				
				return Nowcard;
			}
			
			public void shuffle(){
				Random rnd= new Random();
				Card Tempcard;//�ΨӼȦs�n�洫���d
				//int j=rnd.nextInt(cards.size()+1);
				//
				for(int i=0; i<cards.size(); i++){//�������]�{�b�O�@�ƵP�����p 0~51<52 52�i �ڭn�q�Ĥ@�i cards index0�}�l�~�P
					
					int j=rnd.nextInt(cards.size());//�H������0~51 
					while(j==i){
					j=rnd.nextInt(cards.size());//�ڤ��n���L��ۤv�洫	
					}
					Tempcard=cards.get(i);//���Ȯɦs�ثe���o�i�d��
					cards.set(i, cards.get(j));//�N�H�����Y�i�P(j)���өM�ثe���쪺�o�i�P��
					cards.set(j, Tempcard);//�aj�i�P���ɤ]��쥻���쪺��i�i�P�洫
				}
				
						
			    /*for(int i=0;i<usedCard.size(); i++){
				usedCard.remove(i);
			    }	//Card c= cards.get(i); c=printCard();*/
				openCard.clear();
				usedCard.clear();//�ιL���d�M��
			    nUsed=0;//nUsed��(�o)�L���d�ƲM��
				
			}
			
			
			public ArrayList<Card> getAllCards(){
				return cards;
			}
			public ArrayList<Card> getOpenedCard(){
				return openCard;
			}
		}
	


