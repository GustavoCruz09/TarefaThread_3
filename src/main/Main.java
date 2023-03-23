package main;

import controller.ThreadSapo;

public class Main {

	public static void main(String[] args) {
		int colocacao = 1;
		
		for(int i = 0; i < 5; i++) {
			ThreadSapo thread = new ThreadSapo(i, colocacao);
			thread.start();
		}
		
	}
}
