package com.BridgeLabz.java8feature;

public class ThreadUsingLamda {
public static void main(String[] args) {
	Runnable r = () -> {
		for (int i = 0; i <10; i++) {
			System.out.println("hi child class");}
	};
	Thread t = new Thread (r);
	t.start();
	for (int i = 0; i <10; i++) {
		System.out.println("hi main class");
	}
}
}
