package com.fares.learning.ioc.and.di.ch3;

public class BookWorkOracle implements Oracle {

	private Encyclopaedia encyclopaedia;

//	public BookWorkOracle(Encyclopaedia encyclopaedia) {
//		this.encyclopaedia = encyclopaedia;
//	}
	
	public BookWorkOracle() {
		
	}
	
//	public void setEncyclopaedia(Encyclopaedia encyclopaedia) {
//		this.encyclopaedia=encyclopaedia;
//	}

	public String defineMeaningOfLife() {
		return "Encyclopaedia are waste of money - go see the world instead";
	}

}
