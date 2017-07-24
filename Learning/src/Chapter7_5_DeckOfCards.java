

import java.util.Random;

//DeckOfCards class represents a deck of playing cards
public class Chapter7_5_DeckOfCards {
	
	private Chapter7_5_Card[] deck; // array of Card objects
	
	private int currentCard; // index of next Card to be dealt (0-51)
	
	private static final int NUMBER_OF_CARDS = 52; // constant # of Cards
	
	// random number generator
	private static final Random randomNumbers = new Random();
	
	// constructor fills deck of Cards
	public Chapter7_5_DeckOfCards()
	{
		String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
				"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
		
		deck = new Chapter7_5_Card[ NUMBER_OF_CARDS ]; // create array of Card objects
		
		currentCard = 0; // set currentCard so first Card dealt is deck[ 0 ]
		
		// populate deck with Card objects
		for ( int count = 0; count < deck.length; count++ )
			deck[ count ] = new Chapter7_5_Card( faces[ count % 13 ], suits[ count / 13 ] );
		
	}
	
	
	// shuffle deck of Cards with one-pass algorithm
	public void shuffle()
	{
		// after shuffling, dealing should start at deck[ 0 ] again
		currentCard = 0; // reinitialize currentCard
		
		// for each Card, pick another random Card (0-51) and swap them
		for ( int first = 0; first < deck.length; first++ )
		{
			// select a random number between 0 and 51
			int second = randomNumbers.nextInt( NUMBER_OF_CARDS );
			
			// swap current Card with randomly selected Card
			Chapter7_5_Card temp = deck[ first ];
			deck[ first ] = deck[ second ];
			deck[ second ] = temp;
		
		}
		
		
	}
	
	// deal one Card
	public Chapter7_5_Card dealCard()
	{
		// determine whether Cards remain to be dealt
		if(currentCard < deck.length)
			return deck[ currentCard++ ]; // return current Card in array
		else
			return null; // return null to indicate that all Cards were dealt
	}
	
}
