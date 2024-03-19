package controller;

public class SapoThread extends Thread {
	
    private static int colocacao = 1;
    private static final Object lock = new Object();
	
	int distancia; 
    int min;
    int range;

	public SapoThread (int distancia, int range) {
		this.distancia = distancia; 
		this.range = range; 
	}
	
	public void run() {
		int soma = 0;
		int id = (int) getId(); 
			
		while(soma<50) {
		soma = soma + (int) (Math.random() * range) + min; 
		System.out.println("O sapo da Thread "+ id + " percorreu "+ soma + " Metros de " + distancia + " Metros");
		}
		colocação(id);
	}
	
	public void colocação(int id) {
        synchronized(lock) {
            System.out.println("O sapo da Thread "+ id + " chegou em "+ colocacao + "° Colocação");
            colocacao++;
	}
	}
}
