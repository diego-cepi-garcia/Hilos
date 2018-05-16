/**
 * 
 */
package org.apb;

/**
 * @author J. Alvaro Peredo Botello
 * @Fecha: 15 may. de 2018
 */

// Para que sea un Hilo esta clase debe heredar de otra
public class Lavanderia  extends Thread {
	/*
	 * Si deseamos manejar atributos, todos estos deben ser
	 * privados, esto es necesario y fundamental para que no
	 * toquemos otro hilo que no sea el que necesitamos
	 */
	private String nombre;
	private int tiempo;
	
	public Lavanderia (String n, int t) {
		nombre = n;
		tiempo = t;
	}
	
	/* Los hilos siempre deben tener un metodo para ejecutar
	 * que se llama run.
	 * Cuando inicio un hilo debo indicar nombre del hilo, start
	 * Esto significa que buscamos este metodo y lo ejecutamos,
	 * si este metodo no tiene nada, el hilo no hace nada.
	 * Siempre se debe usar un try catch, en este metodo.
	 * en este metodo usamos sleep, para que duerma un tiempo x en milesegundos.
	 */	
	public void run() {
		try {
			sleep(tiempo);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("Finalizamos el Hilo: "+ nombre + " tiempo: " + tiempo );
	}
	
	

}
