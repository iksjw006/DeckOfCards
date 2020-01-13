package com.deck;

import java.awt.Color;
import java.awt.Image;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.card.card;
import com.card.cardTypes;
import com.suit.suit;

public class deck {

	private Color deckColor = Color.blue; 
	private Image deckImage = null;
	
	public static Map<Integer, card> CreateDeck (Map<Integer, suit> Suits, Map<Integer, cardTypes> Cards, Integer shoeSize){
		// Initialize and create a new deck
		// standard deck consists of 4 suits and 13 cards per suit
		// included option if multiple decks are desired by making shoe size greater than 1
		
		Integer cardIndex = 0;
		Map<Integer, card> myMap = new HashMap<Integer, card>();
        // using keySet() for iteration over keys 
		for (int deckCount = 0; deckCount < shoeSize; deckCount++) {
	        for (Integer order : Suits.keySet()) {  
	            // System.out.println("suit: " + order.toString()); 
	            // using values() for iteration over keys 
	            for (Integer value : Cards.keySet()) {  
	                // System.out.println(" card: " + value.toString()); 
	                myMap.put(cardIndex, new card(Suits.get(order), Cards.get(value)));
	                cardIndex++;
	        	}
	        }
		}
        return myMap;
	}
	
	public static Map<Integer, card> ShuffleDeck(Map<Integer, card> Deck){
		// Shuffle the index of the provided deck 1 to 8 times to randomize order.
		// Then use the randomized index to add each card to a new map and return the new map 

		List<Integer> keys = new ArrayList<Integer>(Deck.keySet());
		Map<Integer, card> shuffledDeck = new HashMap<Integer, card>();
		LocalDateTime now = LocalDateTime.now();

		for(int shuffleCount = 0; shuffleCount < (now.getNano() % 9)+1; shuffleCount++) {
			// System.out.println("Shuffle Count = " + shuffleCount);
			Collections.shuffle(keys);
		}
		
		for (Object o : keys) {
		    // Access keys/values put in new map confirm that the order is randomized
			// System.out.println("Card - " + Deck.get(o).getCardValue().getDisplayName() + " of " + Deck.get(o).getCardSuit().getSuitName() + " " + Deck.get(o).getCardSuit().getSuitIcon().toString());
			Deck.get(o).setDrawn(false);
			shuffledDeck.put(keys.indexOf(o),Deck.get(o));
		}
		return shuffledDeck;
	}

	public Color getDeckColor() {
		return deckColor;
	}

	public void setDeckColor(Color deckColor) {
		this.deckColor = deckColor;
	}

	public Image getDeckImage() {
		return deckImage;
	}

	public void setDeckImage(Image deckImage) {
		this.deckImage = deckImage;
	}
	
}
