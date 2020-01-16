package by.select.stage1.bean;

public class Calculator {
	private int a;
	private int b;	
	private char ch;
	
	public Calculator(int a, int b, char ch) {
		this.a=a;
		this.b=b;
		this.ch=ch;
		
	}
	public Calculator() {
		
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}
	
	
}
