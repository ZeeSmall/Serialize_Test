package org.jpn.techbooster.sample.serializable;

import android.os.Environment;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;

public class SerializableData implements Serializable {
	private static final long serialVersionUID = 1L;
	private String string_;
	private int number_;
	private InputStream is;

	public SerializableData() {
		try{
			is = new FileInputStream(Environment.getExternalStorageDirectory().getPath() + "/" + "zx");
			System.out.println(new InputStreamReader(is).toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
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
