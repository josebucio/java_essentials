package src1.tareas;

import libs.Input;

public class mario_dificil {
	static int pisos,i,cont,x,y,fi;
	
	 static String g="#",e=" ";
	
	public static void main(String[] args) {
		pisos=Input.get_int();
		piramide();
		
	}
	
	static void piramide() {
		
		for (i=1;i<=pisos;i++){
			cont=cont+1;
			fi=pisos-cont;
			espacio();
			gato();
			System.out.print("  ");
			gato();
			System.out.print("\n");
		}
	}
	
	static public void espacio() {
		for(y=1;y<=fi;y++) {
			System.out.print(e);
		}
		
	}
	
	static public void gato(){
	
		for(x=1;x<=cont;x++) {
			System.out.print(g);
		}
	}
}