package com.goit.helper.enums;


public enum FormatoFecha {

	YYYY_MM_DD("yyyy-MM-dd"),
	YYYY_MM_DD_HH_MM_SS("yyyy-MM-dd hh:mm:ss");

	private String name;

	FormatoFecha(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
