package pokerBase;

import java.util.Comparator;

public class Card {
	
	public int suit;//Originally private, but had to make public to test
	public int rank;//Originally private, but had to make public to test
	Card(int startRank, int startSuit){
		rank = startRank;
		suit = startSuit;
	}
	
	public int geteSuit(){
		return suit;
	}
	
	public int geteRank(){
		return rank;
	}
}
