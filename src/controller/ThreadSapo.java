package controller;

public class ThreadSapo extends Thread{
	
	private int i;

	public ThreadSapo(int i/*, int colocacao*/) {
		this.i = i;
//		this.colocacao = colocacao;
	}
	
	@Override
	public void run() {
		Corrida();
	}

	private void Corrida() {
		
		int pulo = 0, percorrido = 0;
		
		while (percorrido < 30) { //sapinho correndo
			pulo = (int) (Math.random() * 5);
			percorrido += pulo;
			System.out.println("Sapo: " + (i + 1) + " agora pulou " + pulo + " metros e percorreu ate agora " + percorrido + " metors");
			Podio(i, percorrido);
		}
	}

	private void Podio(int i, int percorrido) {
		int colocacao = 1;
		
		if(percorrido >= 30) { 
			System.out.println("O Sapo " + (i + 1) + " ficou em " + colocacao + "° lugar");
			colocacao++;
		}
	}
}
