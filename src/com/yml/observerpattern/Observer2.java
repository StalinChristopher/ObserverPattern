package com.yml.observerpattern;

public class Observer2<T> implements Observer<T>{

	@Override
	public void onUpdate(T data) {
		if( data instanceof Data) {
			System.out.println("Observer 2: "+((Data)data).getData());
		}
		
	}

}
