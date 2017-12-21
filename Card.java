
public class Card {//
public enum Suit{Club,Diamond,Heart,Spade};//列舉出我有的花色
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
		       switch (suit){//當花色轉換時
		    	   case Club:
		    		   if (rank==1){
		    		   System.out.println("Club "+"Ace");   //1印ACE
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
			public Suit getSuit(){//取得花色的方法
				return suit;//回傳花色
			}
			public int getRank(){//取得數字大小
				return rank;//回傳數字
			}
		

	}


