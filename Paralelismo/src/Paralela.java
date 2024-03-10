
public class Paralela  extends Thread{
 //Propriedades da classe
	private int numero = 0;
	
	//metodo construttor cheio da classe
	public Paralela (int numero) {
		this.numero = numero;
	}
	//Metodos sobreescrito da classe 
	public void run() {
		System.out.println("Paralela número: "+ numero);
		System.out.println("Quantidade de Threads no numero"+ Thread.currentThread().getName()+":"+ Thread.activeCount());
	}
}
