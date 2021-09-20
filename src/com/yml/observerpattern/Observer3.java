package com.yml.observerpattern;

public class Observer3<T> implements Observer<T>{

	@Override
	public void onUpdate(T data) {
		if( data instanceof Data) {
			System.out.println("Observer 3: "+((Data)data).getData());
		}
		
	}

}
