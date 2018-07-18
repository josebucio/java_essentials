package src1.tareas;

import org.apache.commons.exec.InputStreamPumper;

import libs.Input;

public class mario_facil {
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
			for(y=0;y<=fi;y++) {
				System.out.print(e);
			}
			for(x=0;x<=cont;x++) {
				System.out.print(g);
			}
			
			System.out.print("\n");
		}
	}
	
	

}
