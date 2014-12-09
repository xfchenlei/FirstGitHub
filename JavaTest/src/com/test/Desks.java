package com.test;

public enum Desks {
	One(1), Two(2), Three(3);

	public int code;

	private Desks(int code) {
		this.code = code;
	}
}
