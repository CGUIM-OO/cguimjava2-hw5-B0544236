
public class Card {//
public enum Suit{Club,Diamond,Heart,Spade};//�C�|�X�ڦ������
			private Suit suit; //Definition: 1~4, Clubs=1, Diamonds=2, Hearts=3, Spades=4
			private int rank; //1~13
			/**
			 * @param s suit
			 * @param r rank
			 */
			public Card(Suit s,int r){
				suit=s;
				rank=r;
			}	
			//TODO: 1. Please implement the printCard method (20 points, 10 for suit, 10 for rank)
			public void printCard(){
				//Hint: print (System.out.println) card as suit,rank, for example: print 1,1 as Clubs Ace
		       //Suit thisCardsuit=Suit.Club;
		       switch (suit){//�����ഫ��
		    	   case Club:
		    		   if (rank==1){
		    		   System.out.println("Club "+"Ace");   //1�LACE
		    		   }
		    		   else System.out.println("Club "+rank);
		    		   break;
		    	   case Diamond:
		    		   if (rank==1){
		    		   System.out.println("Diamond "+"Ace");   
		    		   }
		    		   else System.out.println("Diamond "+rank);
		    		   break;
		    	   case Heart:
		    		   if (rank==1){
		    		   System.out.println("Heart "+"Ace");   
		    		   }
		    		   else System.out.println("Heart "+rank);
		    		   break;
		    	   case Spade:
		    		   if (rank==1){
		    		   System.out.println("Spade "+"Ace");   
		    		   }
		    		   else System.out.println("Spade "+rank);
		    		   break;
		    		   
		       
		       }
			}
			public Suit getSuit(){//���o��⪺��k
				return suit;//�^�Ǫ��
			}
			public int getRank(){//���o�Ʀr�j�p
				return rank;//�^�ǼƦr
			}
		

	}


