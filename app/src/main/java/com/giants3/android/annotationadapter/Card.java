package com.giants3.android.annotationadapter;

public class Card {
	public int type; //
	public static int MEMBER_TYPE = 1;
	public static int NUMBER_TYPE = 2;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Card [type=");
		builder.append(type == MEMBER_TYPE ? "MEMBER_TYPE" : "NUMBER_TYPE");
		builder.append("]");
		return builder.toString();
	}

}
