package balu.app;

import java.util.Map;

public class Student {
	private Map<String, String> data;

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Student [data=" + data + "]";
	}

}
