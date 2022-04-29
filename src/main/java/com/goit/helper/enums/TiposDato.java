package com.goit.helper.enums;

public enum TiposDato {
	
	STRING("S"),
	NUMBER("N");

	private String name;

	TiposDato(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
