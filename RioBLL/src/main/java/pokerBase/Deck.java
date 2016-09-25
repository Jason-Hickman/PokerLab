package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

public class Deck  {
	
	public ArrayList<Card> deck = new ArrayList<Card>();
	
	Deck(){
		getDeckCards();
	}
	
	public  void getDeckCards(){
		for(int x = 0; x<4; x++){//0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades
			for(int y = 1; y<14; y++){//1=2, 2=3, ..., 10=J, 11=Q, 12=K, 13=A
				deck.add(new Card(y,x));
			}
		}
		Collections.shuffle(deck);//Randomizes Deck
	}

	public Card drawCard(){
		return deck.remove(0);
	}
	
	public int getDeckSize(){
		return deck.size();
	}
}
