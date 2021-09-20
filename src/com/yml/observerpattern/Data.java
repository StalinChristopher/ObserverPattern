package com.yml.observerpattern;

public class Data {
	private String data;
	
	Data(String data){
		this.data = data;
	}

	@Override
	public String toString() {
		return "Data [data=" + data + "]";
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
}
