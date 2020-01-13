package com.card;

import com.suit.suit;
// import com.suit.suits;

public class card {

	private boolean drawn = false;
	private cardTypes  cardValue;
	private suit   	   suit;
	
	public card (suit cardSuit, cardTypes cardValue){
		this.suit      = cardSuit;
		this.cardValue = cardValue;
	}
	
	public cardTypes getCardValue() {
		return cardValue;
	}
	public void setCardValue(cardTypes cardValue) {
		this.cardValue = cardValue;
	}
	
	public suit getCardSuit() {
		return suit;
	}
	public void setCardSuit(suit cardSuit) {
		this.suit = cardSuit;
	}

	public boolean isDrawn() {
		return drawn;
	}

	public void setDrawn(boolean drawn) {
		this.drawn = drawn;
	}
	
	
}
