package com.suit;

import java.awt.Color;

public class suit {
	
	// Control the properties for the suits we define
	private String suitName;
	private Color suitColor;
	private Integer suitValue;
	private String suitIcon;
	
	public suit(String name, Integer suitValue, Color color, String icon){
		this.suitName = name;
		this.suitColor = color;
		this.suitValue = suitValue;
		this.suitIcon = icon;
	}
	
	public String getSuitName() {
		return suitName;
	}
	
	public void setSuitName(String suitName) {
		this.suitName = suitName;
	}
	
	public Color getSuitColor() {
		return suitColor;
	}

	public void setSuitColor(Color suitColor) {
		this.suitColor = suitColor;
	}

	public Integer getSuitValue() {
		return suitValue;
	}

	public void setSuitValue(Integer suitValue) {
		this.suitValue = suitValue;
	}

	public String getSuitIcon() {
		return suitIcon;
	}

	public void setSuitIcon(String suitIcon) {
		this.suitIcon = suitIcon;
	}
	
	
}
