package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import com.card.card;
import com.card.cardTypes;
import com.deck.deck;
import com.suit.suit;
import com.suit.suits;

public class userInteraction {
	private static Map<Integer, suit> Suits;
	private static Map<Integer, cardTypes> CardValues;
	private static Map<Integer, card> Deck;
	
	private static Integer deckIndex = 0;
	
	public static void Begin() {
		initializeObjects();
		// We could use scanner or buffered reader here to read user input

		boolean Exit = false;
	    System.out.println("Ready To Begin");
	    System.out.println("The deck has not been shuffled yet.");
	    System.out.println("Press - \nS - Shuffle Deck\nC - Select Card\nE - Exit Application");
		while(!Exit) {
			try {

			    InputStreamReader streamReader = new InputStreamReader(System.in);
			    BufferedReader bufferedReader = new BufferedReader(streamReader);

				switch(bufferedReader.readLine().toLowerCase()) {
				  case "e":
				      Exit = true;
				      break;
				  case "s":
					  shuffle();
					  break;
				  case "c":
					  deal_card();
					  break;
				  default:
				    System.out.println("Valid values are \nS - Shuffle Deck\nC - Select Card\nE - Exit Application");
				}
			} catch (IOException e) {
			    e.printStackTrace();
			}
		}
	}	
	
	public static void End() {
		System.out.println("Cleaning Up.\n");
		Suits = null;
		CardValues = null;
		Deck = null;
		System.out.println("Exiting Application.\n");
	}
	
	private static void initializeObjects() {
		// Initialize suits
		Suits = suits.createStandardSuits();
		System.out.println("Suits Genereated.");
		// Initialize card values
		CardValues = cardTypes.createCardsPoker();
		System.out.println("Cards Genereated.");
		// Initialize deck, shoe size of 1 standard deck
		Deck = deck.CreateDeck(Suits, CardValues, 1);
		// System.out.println("Deck Genereated. Number of cards - " + Integer.toString(Deck.size()));
	}

	private static void shuffle() {
		System.out.println("Shuffling cards in the deck.");
		Deck = deck.ShuffleDeck(Deck);
		System.out.println("Cards shuffled.");
		deckIndex = 0;
	}
	
	private static void deal_card() {
		card NextCard;
		if (deckIndex < Deck.size()) {
			NextCard = Deck.get(deckIndex);
			NextCard.setDrawn(true);			
			System.out.println("Card is " + NextCard.getCardValue().getDisplayName() + " of " + NextCard.getCardSuit().getSuitName());
			deckIndex++;
		} else {
			System.out.println("All Cards Used, Please shuffle the deck if you want to select another.");
		}
	}
	
}
