package by.select.stage1.main;

import by.select.stage1.bean.Calculator;
import by.select.stage1.logic.CalculatorLogic;

public class Runner {
	public static void main (String []args) {
		int a;
		int b;
		char ch;
		Calculator calc = new Calculator(5,2,'-');
		
		
		CalculatorLogic calcLogic= new CalculatorLogic();
		a=calcLogic.insertNum();
		ch=calcLogic.insertSign();
		b=calcLogic.insertNum();		
		System.out.println(calcLogic.count(a, b, ch));
	}
	
}
