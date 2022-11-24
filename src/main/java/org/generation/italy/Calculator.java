package org.generation.italy;

public class Calculator {
	private double num1;
	private double num2;
	

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double add(double num1, double num2){
		return num1 + num2;
	}
	
	public double substract(double num1, double num2){
		return num1 - num2;
	}
	
	public double divide(double num1, double num2){
		return num1 / num2;
	}
	
	public double multiply(double num1, double num2){
		return num1 + num2;
	}
	
	@Override
	public String toString() {
		
		return "La somma è: " + add(num1, num2) + "\nLa sottrazione è: " + substract(num1, num2) + 
				"\nLa divisione è pari ad: " + divide(num1, num2) + "\nLa moltpilicazione è pari ad: " + multiply(num1, num2);
	}
}

























