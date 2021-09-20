package com.yml.observerpattern;

public class Observer1<T> implements Observer<T>{

	@Override
	public void onUpdate(T data) {
		if( data instanceof Data) {
			System.out.println("Observer 1: "+((Data)data).getData());
		}
		
		
	}

}
