package by.select.stage2.bean;

import java.util.List;
import java.util.ArrayList;

public class StringGroup {
	private List<String> stringGroup;

	public StringGroup() {
		stringGroup = new ArrayList<>();
	}

	public StringGroup(List<String> stringGroup) {
		this.stringGroup = stringGroup;
	}

	public List<String> getStringGroup() {
		return this.stringGroup;
	}

	public void setStringGroup(List<String> stringGroup) {
		this.stringGroup = stringGroup;
	}
}
