package com.hack.bulgaria;

import java.util.*;

public class Polynomial {
	private static class Monom {
		int coefficient = 0;
		int power = 0;
		
		public Monom(int coefficient, int power) {
			super();
			this.coefficient = coefficient;
			this.power = power;
		}
		public int getCoefficient() {
			return coefficient;
		}
		public void setCoefficient(int coefficient) {
			this.coefficient = coefficient;
		}
		public int getPower() {
			return power;
		}
		public void setPower(int power) {
			this.power = power;
		}
		@Override
		public String toString() {
			String monom = "";
			monom += (coefficient >= 0) ? "+" : "";
			monom += coefficient;
			monom += "x^";
			monom += power;
			return monom;
		}		
	}
	List<Monom> monoms;
	public Polynomial() {
		this(new ArrayList<>());
	}
	private Polynomial(List<Monom> monoms) {
		this.monoms = monoms;
	}	
	public Polynomial normalize() {
		Polynomial p1 = new Polynomial();
		for (Monom monom : monoms) {
			int newCoef = monom.coefficient;
			boolean matchMonom = false;
			Monom newMonom = new Monom(0, 0);
			
			for (int i = monoms.indexOf(monom)+1; i < monoms.size(); i++) {
				if (monom.power != monoms.get(i).power && !matchMonom) {
					newCoef = monom.coefficient;
				} else if (monom.power == monoms.get(i).power) {
					matchMonom = true;
					newCoef += monoms.get(i).coefficient;
					monoms.get(i).setCoefficient(0);
				}
			}
			newMonom = new Monom(newCoef,monom.power);
			if (monom.coefficient != 0) {
				p1.monoms.add(newMonom);
			}
		}
		return p1;
	}
	public Polynomial add(Polynomial p2) {
		Polynomial p3 = new Polynomial();
		this.normalize();
		p2.normalize();
		for (Monom monom : monoms) {
			int newCoef = monom.coefficient;
			boolean matchMonom = false;
			Monom newMonom = new Monom(0, 0);
			for (Monom monom2 : p2.monoms) {
				if (monom.power != monom2.power && !matchMonom) {
					newCoef = monom.coefficient;
				} else if (monom.power == monom2.power) {
					matchMonom = true;
					newCoef += monom2.coefficient;
				}
			}
			newMonom = new Monom(newCoef, monom.power);
			p3.monoms.add(newMonom);
		}
		return p3.normalize();
	}
	
	public Polynomial subtraction(Polynomial p2) {
		Polynomial p3 = new Polynomial();
		this.normalize();
		p2.normalize();
		for (Monom monom : monoms) {
			int newCoef = monom.coefficient;
			boolean matchMonom = false;
			Monom newMonom = new Monom(0, 0);
			for (Monom monom2 : p2.monoms) {
				if (monom.power != monom2.power && !matchMonom) {
					newCoef = monom.coefficient;
				} else if (monom.power == monom2.power) {
					matchMonom = true;
					newCoef -= monom2.coefficient;
				}
			}
			newMonom = new Monom(newCoef, monom.power);
			p3.monoms.add(newMonom);
		}
		return p3.normalize();
	}
	
	public Polynomial multip(Polynomial p2) {
		Polynomial p3 = new Polynomial();

		for (Monom monom : monoms) {
			int newCoef = monom.coefficient;
			boolean matchMonom = false;
			Monom newMonom = new Monom(0, 0);
			for (Monom monom2 : p2.monoms) {
				if (monom.power != monom2.power && !matchMonom) {
					newCoef = monom.coefficient;
				} else if (monom.power == monom2.power) {
					matchMonom = true;
					newCoef *= monom2.coefficient;
				}
			}
			newMonom = new Monom(newCoef, monom.power);
			p3.monoms.add(newMonom);
		}
		return p3;
	}
	
	public Polynomial multipWithConst(int constant) {
		Polynomial p = new Polynomial();
		this.normalize();
		for (Monom monom : monoms) {
			int newCoef = monom.coefficient * constant;
			Monom newMonom = new Monom(newCoef, monom.power);
			p.monoms.add(newMonom);
		}
		return p.normalize();
	}

	public Polynomial firstDerivative() {
		Polynomial p = new Polynomial();
		this.normalize();
		for (Monom monom : monoms) {
			int newCoef = monom.coefficient * monom.power;
			monom.power--;
			if (monom.power >= 0) {
				Monom newMonom = new Monom(newCoef, monom.power);
				p.monoms.add(newMonom);
			}
		}
		return p.normalize();
	}
	//2x^4+3x^2-10x+3
	public static Polynomial fromString(String userPolynomial) {
		Polynomial p = new Polynomial();
		int previousSign = 0;
		userPolynomial = userPolynomial.replaceAll(" ", "");
		for (int i = 0; i <= userPolynomial.length(); i++) {
			if (i == userPolynomial.length() ||
				userPolynomial.charAt(i) == '+' || 
				userPolynomial.charAt(i) == '-') {
				
				String monom = userPolynomial.substring(previousSign, i);
				previousSign = i;
				int coef = 0;
				int power = 0;
				int indexOfX = monom.indexOf('x');
				int indexOfPowerSign = monom.indexOf('^');
				int coefEnd = 0;
				
				if (indexOfX != -1 && indexOfPowerSign != -1) {
					coefEnd = indexOfX;
					power = Integer.parseInt(monom.substring(indexOfPowerSign + 1, monom.length()));
				} else if (indexOfX != -1 && indexOfPowerSign == -1) {
					coefEnd = indexOfX;
					power = 1;
				} else {
					coefEnd = monom.length();
					power = 0;
				}
				
				String coefString = monom.substring(0, coefEnd);
				if (coefString.equals("+")) {
					coef = 1;
				} else {
					coef = Integer.parseInt(monom.substring(0, coefEnd));
				}
				p.monoms.add(new Monom(coef, power));
			}
		}
		return p.normalize();
	}

	@Override
	public String toString() {
		String polynomial = "";
		for (Monom monom : monoms) {
			polynomial += monom;
		}
		return polynomial;
	}

}