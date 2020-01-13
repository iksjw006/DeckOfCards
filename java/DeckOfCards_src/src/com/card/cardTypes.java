package com.card;

// import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class cardTypes {
	
	private String  valueDisplay;
	
	// A card may have more than one value, example of ACE equals  1 or 11
	// Or a wild card could be any value
	private Map<Integer,Integer> valuePoints;
	
	private boolean isWild = false;
	
	
	public cardTypes(Integer value, Map<Integer,Integer> possibleValues, String DisplayName, boolean wildCard){
		valueDisplay = DisplayName;
		setValuePoints(possibleValues);
		setWild(wildCard);
	}
	
	public static final Map<Integer, cardTypes> createCardsPoker() {
		Map<Integer, cardTypes> myMap = new HashMap<Integer, cardTypes>();
		myMap.put(0, new cardTypes(2, new HashMap<Integer, Integer>(0,2), "Two", false));
		myMap.put(1, new cardTypes(3, new HashMap<Integer, Integer>(0,3), "Three", false));
		myMap.put(2, new cardTypes(4, new HashMap<Integer, Integer>(0,4), "Four", false));
		myMap.put(3, new cardTypes(5, new HashMap<Integer, Integer>(0,5), "Five", false));
		myMap.put(4, new cardTypes(6, new HashMap<Integer, Integer>(0,6), "Six", false));
		myMap.put(5, new cardTypes(7, new HashMap<Integer, Integer>(0,7), "Seven", false));
		myMap.put(6, new cardTypes(8, new HashMap<Integer, Integer>(0,8), "Eight", false));
		myMap.put(7, new cardTypes(9, new HashMap<Integer, Integer>(0,9), "Nine", false));
		myMap.put(8, new cardTypes(10, new HashMap<Integer, Integer>(0,10), "Ten", false));
		myMap.put(9, new cardTypes(11, new HashMap<Integer, Integer>(0,10), "Jack", false));
		myMap.put(10, new cardTypes(12, new HashMap<Integer, Integer>(0,10), "Queen", false));
		myMap.put(11, new cardTypes(13, new HashMap<Integer, Integer>(0,10), "King", false));

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); 
        hm.put(0, 1);
        hm.put(1, 11);
		myMap.put(12, new cardTypes(14, hm, "Ace", false));

		return myMap;
	}	
	
	public String getDisplayName() {
		return valueDisplay;
	}
	
	public void setDisplayName(String valueDisplay) {
		this.valueDisplay = valueDisplay;
	}


	public Map<Integer,Integer> getValuePoints() {
		return valuePoints;
	}

	public void setValuePoints(Map<Integer,Integer> valuePoints) {
		this.valuePoints = valuePoints;
	}

	public boolean isWild() {
		return isWild;
	}

	public void setWild(boolean isWild) {
		this.isWild = isWild;
	}

	
}
