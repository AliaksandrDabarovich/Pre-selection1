package by.select.stage1.logic;
import java.util.Scanner;

public class CalculatorLogic {
	Scanner sc=new Scanner (System.in);
	public int insertNum() {
		System.out.println("Введите число >");
		while (sc.hasNextInt()==false) {
			sc.next();
			System.out.println("Введите число >");
		}
		return sc.nextInt();
		
	}
	
	public char insertSign() {
		System.out.println("Введите знак >");
		while (sc.hasNextLine ()==false) {
			sc.next();
			System.out.println("Введите знак >");
		}
		return sc.next().charAt(0);
		
	}
	
	public int count (int a, int b, char ch) {
		int result;
		switch (ch){
	    case '-':
	    	result=a-b;
		      break;
	    case '+':
	      result=a+b;
	      break;
	    case '*':
		      result=a*b;
		      break;
	    case '/':
		      result=a/b;
		      break;
	     default:
	    	 result=0;
		      break;
	}
		return result;
		
	}
	
	
}
