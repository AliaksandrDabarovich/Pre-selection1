package by.select.stage2.logic;

import by.select.stage2.bean.StringGroup;

public class StringGroupLogic {
	public void addElement(StringGroup stringGroup, String string) {
		stringGroup.getStringGroup().add(string);
	}
	public void print (StringGroup stringGroup) {
		for(int i=0; i<stringGroup.getStringGroup().size(); i++) {
			System.out.println(stringGroup.getStringGroup().get(i));
		}
	}
}
