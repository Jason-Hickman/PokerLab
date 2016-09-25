/**
 * 
 */
package pokerBase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class DeckTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getDeckCards(){
		Deck deck = new Deck();
		int deckSize = deck.getDeckSize();
		assertTrue(deckSize == 52);
	}

	public void drawCard()  {
		Deck deck = new Deck();
		Card card1 = deck.drawCard();
		Card card2 = deck.drawCard();
		assertTrue(((card1.rank != card2.rank)|(card1.suit != card2.suit))&(deck.getDeckSize()==50));
	}
}
