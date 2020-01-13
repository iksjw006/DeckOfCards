package com.suit;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;


public class suits {

	private String suitName;
	private String suitValue;
	private String suitIcon;
	Map<Integer, suit> myMap = createStandardSuits();
	
	public final static Map<Integer, suit> createStandardSuits() {
		Map<Integer, suit> myMap = new HashMap<Integer, suit>();
		myMap.put(0, new suit("Hearts",1, new Color(255,0,0), "♥"));
		myMap.put(1, new suit("Clubs",2, new Color(50,50,50), "♣"));
		myMap.put(2, new suit("Diamonds",3, new Color(255,0,0), "♦"));
		myMap.put(3, new suit("Spades",4, new Color(50,50,50), "♠"));
		return myMap;
	};
	
	public final static Map<Integer, suit> createNonStandardSuits() {
		Map<Integer, suit> myMap = new HashMap<Integer, suit>();
		myMap.put(0, new suit("Cardiac Muscles",1, new Color(255,0,0), "♥"));
		myMap.put(1, new suit("Truncheons",2, new Color(50,50,50), "♣"));
		myMap.put(2, new suit("Compacted Carbons",3, new Color(255,0,0), "♦"));
		myMap.put(3, new suit("Garden Tools",4, new Color(50,50,50), "♠"));
		return myMap;
	};
	
	
	public String getSuitName() {
		return suitName;
	}

	public String getSuitValue() {
		return suitValue;
	}

	public String getSuitIcon() {
		return suitIcon;
	}

	public void setSuitIcon(String suitIcon) {
		this.suitIcon = suitIcon;
	}

	
}
