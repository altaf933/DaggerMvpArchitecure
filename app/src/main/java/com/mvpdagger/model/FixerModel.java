package com.mvpdagger.model;

public class FixerModel{


	private String date;


	private Rates rates;


	private String base;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setRates(Rates rates){
		this.rates = rates;
	}

	public Rates getRates(){
		return rates;
	}

	public void setBase(String base){
		this.base = base;
	}

	public String getBase(){
		return base;
	}

	@Override
 	public String toString(){
		return 
			"FixerModel{" + 
			"date = '" + date + '\'' + 
			",rates = '" + rates + '\'' + 
			",base = '" + base + '\'' + 
			"}";
		}
}