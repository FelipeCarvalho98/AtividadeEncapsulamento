package br.edu.fatecpg.conversor.model;

public class Conversor {

	public String Converter(String min) {
		return min.toUpperCase();
	}
	public double Converter(int qlm) {
		return qlm * 0.621371;
	}
	public double Converter(double cel) {
		return (cel * 9/5) + 32;
	}
	
}
