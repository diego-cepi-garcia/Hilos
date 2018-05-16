/**
 * 
 */
package org.apb;

/**
 * @author J. Alvaro Peredo Botello
 * @Fecha: 15 may. de 2018
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lavanderia l1,l2,l3;
		l1 = new Lavanderia("Pantalon", 100*1000);
		l2 = new Lavanderia("Camisa", 10*1000);
		l3 = new Lavanderia("Media", 50*1000);
		
		l1.start();
		l2.start();
		l3.start();

	}

}
