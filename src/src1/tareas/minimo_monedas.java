package src1.tareas;

import libs.Input;

public class minimo_monedas {
	static float monto;
	static int c25,c10,c5,c1,mone;
	static double vein;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hola!  Cuanto cambio te debo?O hai! ");
        monto = Input.get_float();
        cambio();
        mone=c25+c10+c5+c1;
        System.out.println(mone);

	}
	
	public static void cambio () {
		while(monto>=.25) {
		c25=c25+1;
		 monto -=.25;
		
		}
		
		while(monto>=.10) {
			c10=c10+1;
			monto-=.10;
		
		}
		while(monto>=.05) {
			c5=c5+1;
			monto-=.10;
		}
		while(monto>=.01) {
			c1=c1+1;
			monto-=.01;
		}
	}

}
