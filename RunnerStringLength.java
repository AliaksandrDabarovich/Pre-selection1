package by.select.stage2.main;

import java.util.Collections;
import java.util.List;

import by.select.stage2.bean.StringGroup;
import by.select.stage2.logic.ComparatorStringLength;
import by.select.stage2.logic.StringGroupLogic;

public class RunnerStringLength {

	public static void main(String[] args) {
		StringGroup stringGroup = new StringGroup();
		List<String> list = stringGroup.getStringGroup();
		StringGroupLogic stringGroupLogic = new StringGroupLogic();
		stringGroupLogic.addElement(stringGroup, "Это первая строка");
		stringGroupLogic.addElement(stringGroup, "Вторая");
		stringGroupLogic.addElement(stringGroup, "А вот третья");
		stringGroupLogic.print(stringGroup);
		Collections.sort(list, new ComparatorStringLength());
		System.out.println("--------------------------------------");
		stringGroupLogic.print(stringGroup);
	}

}
