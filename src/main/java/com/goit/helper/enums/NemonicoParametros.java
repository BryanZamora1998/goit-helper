package com.goit.helper.enums;

public enum NemonicoParametros {

	REFRESH_TOKEN_DURATION("REFRESH_TOKEN_DURATION"),
	TOKEN_DURATION("TOKEN_DURATION"),
	JWT_SECRET("JWT_SECRET");

	private String name;

	NemonicoParametros(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}