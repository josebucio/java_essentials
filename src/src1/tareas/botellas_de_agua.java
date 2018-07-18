package src1.tareas;

import libs.Input;

public class botellas_de_agua {
	
	static int min,botellas=12,total;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("¿Cuantos minutos tarda en bañarse?  ");
		min=Input.get_int();
		total=min*botellas;
		System.out.print("Usted gasto "+total+" botellas de agua al bañarse");

	}

}
