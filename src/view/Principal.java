package view;

import controller.SapoThread;

public class Principal {
	
	public static void main(String[] args) {
		
		int distancia = 50; 
	    int max = 10;
	    int min = 0;
	    int range = max - min + 1;
	    
		Thread Sapo1 = new SapoThread(distancia, range); 
		Thread Sapo2 = new SapoThread(distancia, range);
		Thread Sapo3 = new SapoThread(distancia, range);
		Thread Sapo4 = new SapoThread(distancia, range);
		Thread Sapo5 = new SapoThread(distancia, range);
		Sapo1.start();
		Sapo2.start();
		Sapo3.start();
		Sapo4.start();
		Sapo5.start();
	    
	}

}
