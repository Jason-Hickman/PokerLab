package pokerBase;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pokerEnums.eRank;
import pokerEnums.eSuit;

public class HandTest {

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
	public void TestisHandFlushTrue(){
		HandScore hs=new HandScore();
		ArrayList<Card> isHandFlush=new ArrayList<Card>();
		isHandFlush.add(new Card(eSuit.CLUBS,eRank.FIVE,1));
		isHandFlush.add(new Card(eSuit.CLUBS,eRank.FIVE,2));
		isHandFlush.add(new Card(eSuit.CLUBS,eRank.FIVE,4));
		isHandFlush.add(new Card(eSuit.CLUBS,eRank.FIVE,2));
		isHandFlush.add(new Card(eSuit.CLUBS,eRank.FIVE,3));
		Hand h=new Hand();
		h=SetHand(isHandFlush);
		boolean ActualisHandFlush=Hand.isHandFlush(h,hs);
		boolean ExceptionisHandFlush=true;
		assertEquals(ActualisHandFlush,ExceptionisHandFlush);
	}
	public void TestisHandFlushFalse(){
		HandScore hs=new HandScore();
		ArrayList<Card> isHandFlush=new ArrayList<Card>();
		isHandFlush.add(new Card(eSuit.CLUBS,eRank.FIVE,2));
		isHandFlush.add(new Card(eSuit.DIAMONDS,eRank.FIVE,4));
		isHandFlush.add(new Card(eSuit.HEARTS,eRank.FIVE,6));
		isHandFlush.add(new Card(eSuit.SPADES,eRank.FIVE,3));
		isHandFlush.add(new Card(eSuit.SPADES,eRank.FIVE,1));
		Hand h=new Hand();
		h=SetHand(isHandFlush);
		boolean ActualisHandFlush=Hand.isHandFlush(h,hs);
		boolean ExceptionisHandFlush=true;
		assertEquals(ActualisHandFlush,ExceptionisHandFlush);
	}
	public void TestisHandStraightTrue(){
		HandScore hs=new HandScore();
		ArrayList<Card> isHandStraight=new ArrayList<Card>();
		isHandStraight.add(new Card(eSuit.CLUBS,eRank.FIVE,4));
		isHandStraight.add(new Card(eSuit.SPADES,eRank.FIVE,5));
		isHandStraight.add(new Card(eSuit.SPADES,eRank.FIVE,6));
		isHandStraight.add(new Card(eSuit.SPADES,eRank.FIVE,7));
		isHandStraight.add(new Card(eSuit.DIAMONDS,eRank.FIVE,8));
		Hand h=new Hand();
		h=SetHand(isHandStraight);
		boolean ActualisHandStraight=Hand.isHandStraight(h,hs);
		boolean ExceptionisHandStraight=true;
		assertEquals(ActualisHandStraight,ExceptionisHandStraight);
	}
	public void TestisHandStraightFalse(){
		HandScore hs=new HandScore();
		ArrayList<Card> isHandStraight=new ArrayList<Card>();
		isHandStraight.add(new Card(eSuit.CLUBS,eRank.FIVE,4));
		isHandStraight.add(new Card(eSuit.SPADES,eRank.FIVE,6));
		isHandStraight.add(new Card(eSuit.SPADES,eRank.FIVE,6));
		isHandStraight.add(new Card(eSuit.SPADES,eRank.FIVE,7));
		isHandStraight.add(new Card(eSuit.DIAMONDS,eRank.FIVE,8));
		Hand h=new Hand();
		h=SetHand(isHandStraight);
		boolean ActualisHandStraight=Hand.isHandStraight(h,hs);
		boolean ExceptionisHandStraight=true;
		assertEquals(ActualisHandStraight,ExceptionisHandStraight);
	}
	public void TestisHandRoyalFlushTrue(){
		HandScore hs=new HandScore();
		ArrayList<Card> isHandRoyalFlush=new ArrayList<Card>();
		isHandRoyalFlush.add(new Card(eSuit.SPADES,eRank.FIVE,10));
		isHandRoyalFlush.add(new Card(eSuit.SPADES,eRank.FIVE,11));
		isHandRoyalFlush.add(new Card(eSuit.SPADES,eRank.FIVE,12));
		isHandRoyalFlush.add(new Card(eSuit.SPADES,eRank.FIVE,13));
		isHandRoyalFlush.add(new Card(eSuit.SPADES,eRank.FIVE,14));
		Hand h=new Hand();
		h=SetHand(isHandRoyalFlush);
		boolean ActualisHandRoyalFlush=Hand.isHandRoyalFlush(h,hs);
		boolean ExceptionisHandRoyalFlush=true;
		assertEquals(ActualisHandRoyalFlush,ExceptionisHandRoyalFlush);
	}
	public void TestisHandRoyalFlushFalse(){
		HandScore hs=new HandScore();
		ArrayList<Card> isHandRoyalFlush=new ArrayList<Card>();
		isHandRoyalFlush.add(new Card(eSuit.CLUBS,eRank.FIVE,4));
		isHandRoyalFlush.add(new Card(eSuit.SPADES,eRank.FIVE,5));
		isHandRoyalFlush.add(new Card(eSuit.SPADES,eRank.FIVE,9));
		isHandRoyalFlush.add(new Card(eSuit.SPADES,eRank.FIVE,7));
		isHandRoyalFlush.add(new Card(eSuit.SPADES,eRank.FIVE,8));
		Hand h=new Hand();
		h=SetHand(isHandRoyalFlush);
		boolean ActualisHandRoyalFlush=Hand.isHandRoyalFlush(h,hs);
		boolean ExceptionisHandRoyalFlush=true;
		assertEquals(ActualisHandRoyalFlush,ExceptionisHandRoyalFlush);
	}
	public void TestisHandStraightFlushTrue(){
		HandScore hs=new HandScore();
		ArrayList<Card> isHandStraightFlush=new ArrayList<Card>();
		isHandStraightFlush.add(new Card(eSuit.SPADES,eRank.FIVE,4));
		isHandStraightFlush.add(new Card(eSuit.SPADES,eRank.FIVE,5));
		isHandStraightFlush.add(new Card(eSuit.SPADES,eRank.FIVE,6));
		isHandStraightFlush.add(new Card(eSuit.SPADES,eRank.FIVE,7));
		isHandStraightFlush.add(new Card(eSuit.SPADES,eRank.FIVE,8));
		Hand h=new Hand();
		h=SetHand(isHandStraightFlush);
		boolean ActualisHandStraightFlush=Hand.isHandStraightFlush(h,hs);
		boolean ExceptionisHandStraightFlush=true;
		assertEquals(ActualisHandStraightFlush,ExceptionisHandStraightFlush);
	}
	public void TestisHandStraightFlushFalse(){
		HandScore hs=new HandScore();
		ArrayList<Card> isHandStraightFlush=new ArrayList<Card>();
		isHandStraightFlush.add(new Card(eSuit.DIAMONDS,eRank.FIVE,4));
		isHandStraightFlush.add(new Card(eSuit.SPADES,eRank.FIVE,5));
		isHandStraightFlush.add(new Card(eSuit.SPADES,eRank.FIVE,6));
		isHandStraightFlush.add(new Card(eSuit.SPADES,eRank.FIVE,13));
		isHandStraightFlush.add(new Card(eSuit.SPADES,eRank.FIVE,8));
		Hand h=new Hand();
		h=SetHand(isHandStraightFlush);
		boolean ActualisHandStraightFlush=Hand.isHandStraightFlush(h,hs);
		boolean ExceptionisHandStraightFlush=true;
		assertEquals(ActualisHandStraightFlush,ExceptionisHandStraightFlush);
	}
	public void TestisHandFourOfAKindTrue(){
		HandScore hs=new HandScore();
		ArrayList<Card> isHandFourOfAKind=new ArrayList<Card>();
		isHandFourOfAKind.add(new Card(eSuit.SPADES,eRank.FIVE,4));
		isHandFourOfAKind.add(new Card(eSuit.DIAMONDS,eRank.FIVE,4));
		isHandFourOfAKind.add(new Card(eSuit.CLUBS,eRank.FIVE,4));
		isHandFourOfAKind.add(new Card(eSuit.HEARTS,eRank.FIVE,4));
		isHandFourOfAKind.add(new Card(eSuit.SPADES,eRank.FIVE,8));
		Hand h=new Hand();
		h=SetHand(isHandFourOfAKind);
		boolean ActualisHandFourOfAKind=Hand.isHandFourOfAKind(h,hs);
		boolean ExceptionisHandFourOfAKind=true;
		assertEquals(ActualisHandFourOfAKind,ExceptionisHandFourOfAKind);
	}
	public void TestisHandFourOfAKindFalse(){
		HandScore hs=new HandScore();
		ArrayList<Card> isHandFourOfAKind=new ArrayList<Card>();
		isHandFourOfAKind.add(new Card(eSuit.SPADES,eRank.FIVE,4));
		isHandFourOfAKind.add(new Card(eSuit.DIAMONDS,eRank.FIVE,4));
		isHandFourOfAKind.add(new Card(eSuit.CLUBS,eRank.FIVE,4));
		isHandFourOfAKind.add(new Card(eSuit.HEARTS,eRank.FIVE,7));
		isHandFourOfAKind.add(new Card(eSuit.SPADES,eRank.FIVE,8));
		Hand h=new Hand();
		h=SetHand(isHandFourOfAKind);
		boolean ActualisHandFourOfAKind=Hand.isHandFourOfAKind(h,hs);
		boolean ExceptionisHandFourOfAKind=true;
		assertEquals(ActualisHandFourOfAKind,ExceptionisHandFourOfAKind);
	}
	public void TestisHandFullHouseTrue(){
		HandScore hs=new HandScore();
		ArrayList<Card> isHandFullHouse=new ArrayList<Card>();
		isHandFullHouse.add(new Card(eSuit.SPADES,eRank.FIVE,4));
		isHandFullHouse.add(new Card(eSuit.DIAMONDS,eRank.FIVE,4));
		isHandFullHouse.add(new Card(eSuit.CLUBS,eRank.FIVE,4));
		isHandFullHouse.add(new Card(eSuit.HEARTS,eRank.FIVE,8));
		isHandFullHouse.add(new Card(eSuit.SPADES,eRank.FIVE,8));
		Hand h=new Hand();
		h=SetHand(isHandFullHouse);
		boolean ActualisHandFullHouse=Hand.isHandFullHouse(h,hs);
		boolean ExceptionisHandFullHouse=true;
		assertEquals(ActualisHandFullHouse,ExceptionisHandFullHouse);
	}
	public void TestisHandFullHouseFalse(){
		HandScore hs=new HandScore();
		ArrayList<Card> isHandFullHouse=new ArrayList<Card>();
		isHandFullHouse.add(new Card(eSuit.SPADES,eRank.FIVE,4));
		isHandFullHouse.add(new Card(eSuit.DIAMONDS,eRank.FIVE,4));
		isHandFullHouse.add(new Card(eSuit.CLUBS,eRank.FIVE,5));
		isHandFullHouse.add(new Card(eSuit.HEARTS,eRank.FIVE,8));
		isHandFullHouse.add(new Card(eSuit.SPADES,eRank.FIVE,8));
		Hand h=new Hand();
		h=SetHand(isHandFullHouse);
		boolean ActualisHandFullHouse=Hand.isHandFullHouse(h,hs);
		boolean ExceptionisHandFullHouse=true;
		assertEquals(ActualisHandFullHouse,ExceptionisHandFullHouse);
	}
	public void TestisHandThreeOfAKindTrue(){
		HandScore hs=new HandScore();
		ArrayList<Card> isHandThreeOfAKind=new ArrayList<Card>();
		isHandThreeOfAKind.add(new Card(eSuit.SPADES,eRank.FIVE,4));
		isHandThreeOfAKind.add(new Card(eSuit.DIAMONDS,eRank.FIVE,4));
		isHandThreeOfAKind.add(new Card(eSuit.CLUBS,eRank.FIVE,4));
		isHandThreeOfAKind.add(new Card(eSuit.HEARTS,eRank.FIVE,8));
		isHandThreeOfAKind.add(new Card(eSuit.SPADES,eRank.FIVE,9));
		Hand h=new Hand();
		h=SetHand(isHandThreeOfAKind);
		boolean ActualisHandThreeOfAKind=Hand.isHandThreeOfAKind(h,hs);
		boolean ExceptionisHandThreeOfAKind=true;
		assertEquals(ActualisHandThreeOfAKind,ExceptionisHandThreeOfAKind);
	}
	public void TestisHandThreeOfAKindFalse(){
		HandScore hs=new HandScore();
		ArrayList<Card> isHandThreeOfAKind=new ArrayList<Card>();
		isHandThreeOfAKind.add(new Card(eSuit.SPADES,eRank.FIVE,4));
		isHandThreeOfAKind.add(new Card(eSuit.DIAMONDS,eRank.FIVE,4));
		isHandThreeOfAKind.add(new Card(eSuit.CLUBS,eRank.FIVE,5));
		isHandThreeOfAKind.add(new Card(eSuit.HEARTS,eRank.FIVE,6));
		isHandThreeOfAKind.add(new Card(eSuit.SPADES,eRank.FIVE,8));
		Hand h=new Hand();
		h=SetHand(isHandThreeOfAKind);
		boolean ActualisHandThreeOfAKind=Hand.isHandThreeOfAKind(h,hs);
		boolean ExceptionisHandThreeOfAKind=true;
		assertEquals(ActualisHandThreeOfAKind,ExceptionisHandThreeOfAKind);
	}
	public void TestisHandTwoPairTrue(){
		HandScore hs=new HandScore();
		ArrayList<Card> isHandTwoPair=new ArrayList<Card>();
		isHandTwoPair.add(new Card(eSuit.SPADES,eRank.FIVE,4));
		isHandTwoPair.add(new Card(eSuit.DIAMONDS,eRank.FIVE,4));
		isHandTwoPair.add(new Card(eSuit.CLUBS,eRank.FIVE,7));
		isHandTwoPair.add(new Card(eSuit.HEARTS,eRank.FIVE,8));
		isHandTwoPair.add(new Card(eSuit.SPADES,eRank.FIVE,8));
		Hand h=new Hand();
		h=SetHand(isHandTwoPair);
		boolean ActualisHandTwoPair=Hand.isHandTwoPair(h,hs);
		boolean ExceptionisHandTwoPair=true;
		assertEquals(ActualisHandTwoPair,ExceptionisHandTwoPair);
	}
	public void TestisHandTwoPairFalse(){
		HandScore hs=new HandScore();
		ArrayList<Card> isHandTwoPair=new ArrayList<Card>();
		isHandTwoPair.add(new Card(eSuit.SPADES,eRank.FIVE,4));
		isHandTwoPair.add(new Card(eSuit.DIAMONDS,eRank.FIVE,5));
		isHandTwoPair.add(new Card(eSuit.CLUBS,eRank.FIVE,7));
		isHandTwoPair.add(new Card(eSuit.HEARTS,eRank.FIVE,8));
		isHandTwoPair.add(new Card(eSuit.SPADES,eRank.FIVE,9));
		Hand h=new Hand();
		h=SetHand(isHandTwoPair);
		boolean ActualisHandTwoPair=Hand.isHandTwoPair(h,hs);
		boolean ExceptionisHandTwoPair=true;
		assertEquals(ActualisHandTwoPair,ExceptionisHandTwoPair);
	}
	public void TestisHandPairTrue(){
		HandScore hs=new HandScore();
		ArrayList<Card> isHandPair=new ArrayList<Card>();
		isHandPair.add(new Card(eSuit.SPADES,eRank.FIVE,4));
		isHandPair.add(new Card(eSuit.DIAMONDS,eRank.FIVE,4));
		isHandPair.add(new Card(eSuit.CLUBS,eRank.FIVE,7));
		isHandPair.add(new Card(eSuit.HEARTS,eRank.FIVE,8));
		isHandPair.add(new Card(eSuit.SPADES,eRank.FIVE,10));
		Hand h=new Hand();
		h=SetHand(isHandPair);
		boolean ActualisHandPair=Hand.isHandPair(h,hs);
		boolean ExceptionisHandPair=true;
		assertEquals(ActualisHandPair,ExceptionisHandPair);
	}
	public void TestisHandPairFalse(){
		HandScore hs=new HandScore();
		ArrayList<Card> isHandPair=new ArrayList<Card>();
		isHandPair.add(new Card(eSuit.SPADES,eRank.FIVE,2));
		isHandPair.add(new Card(eSuit.DIAMONDS,eRank.FIVE,4));
		isHandPair.add(new Card(eSuit.CLUBS,eRank.FIVE,7));
		isHandPair.add(new Card(eSuit.HEARTS,eRank.FIVE,8));
		isHandPair.add(new Card(eSuit.SPADES,eRank.FIVE,10));
		Hand h=new Hand();
		h=SetHand(isHandPair);
		boolean ActualisHandPair=Hand.isHandPair(h,hs);
		boolean ExceptionisHandPair=true;
		assertEquals(ActualisHandPair,ExceptionisHandPair);
	}
	public void TestisHandHighCardTrue(){
		HandScore hs=new HandScore();
		ArrayList<Card> isHandHighCard=new ArrayList<Card>();
		isHandHighCard.add(new Card(eSuit.SPADES,eRank.FIVE,3));
		isHandHighCard.add(new Card(eSuit.DIAMONDS,eRank.FIVE,4));
		isHandHighCard.add(new Card(eSuit.CLUBS,eRank.FIVE,7));
		isHandHighCard.add(new Card(eSuit.HEARTS,eRank.FIVE,8));
		isHandHighCard.add(new Card(eSuit.SPADES,eRank.FIVE,10));
		Hand h=new Hand();
		h=SetHand(isHandHighCard);
		boolean ActualisHandHighCard=Hand.isHandHighCard(h,hs);
		boolean ExceptionisHandHighCard=true;
		assertEquals(ActualisHandHighCard,ExceptionisHandHighCard);
	}
	public void TestisHandHighCardFalse(){
		HandScore hs=new HandScore();
		ArrayList<Card> isHandHighCard=new ArrayList<Card>();
		isHandHighCard.add(new Card(eSuit.SPADES,eRank.FIVE,4));
		isHandHighCard.add(new Card(eSuit.DIAMONDS,eRank.FIVE,4));
		isHandHighCard.add(new Card(eSuit.CLUBS,eRank.FIVE,7));
		isHandHighCard.add(new Card(eSuit.HEARTS,eRank.FIVE,10));
		isHandHighCard.add(new Card(eSuit.SPADES,eRank.FIVE,10));
		Hand h=new Hand();
		h=SetHand(isHandHighCard);
		boolean ActualisHandHighCard=Hand.isHandHighCard(h,hs);
		boolean ExceptionisHandHighCard=true;
		assertEquals(ActualisHandHighCard,ExceptionisHandHighCard);
	}
	
}