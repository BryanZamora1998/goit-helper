package com.goit.helper.enums;


public enum AuthenticationScheme {
	
	BEARER {
		@Override
		public String toString() {
			return "Bearer";
		}
	}, 
	BASIC {
		@Override
		public String toString() {
			return "Basic";
		}
	},
	REFRESH {
		@Override
		public String toString() {
			return "refreshToken";
		}
	};
	
}