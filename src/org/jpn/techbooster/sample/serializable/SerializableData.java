package org.jpn.techbooster.sample.serializable;

import java.io.Serializable;
import java.util.HashMap;

public class SerializableData implements Serializable {
	private static final long serialVersionUID = 1L;
	private String string_;
	private int number_;
	private HashMap<Integer, String> map = new HashMap<Integer, String>();

	public SerializableData() {
		map.put(1, "get");
	}

	public String getString() {
		return string_;
	}
	
	public void setString(String string) {
		string_ = string;
	}

	public int getNumber() {
		return number_;
	}
	
	public void setNumber(int number) {
		number_ = number;
	}

}
