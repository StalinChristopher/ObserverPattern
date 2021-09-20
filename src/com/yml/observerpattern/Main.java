package com.yml.observerpattern;

public class Main {

	public static void main(String[] args) {
		Subject subject = new Subject();
		Observer1 observer1 = new Observer1();
		Observer2 observer2 = new Observer2();
		Observer3 observer3 = new Observer3();
		Data data = new Data("Hello");
		
		subject.register(observer1);
		subject.register(observer2);
		subject.register(observer3);
		
		subject.update(data);
	}

}
