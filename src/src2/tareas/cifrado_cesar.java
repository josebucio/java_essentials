package src2.tareas;

import libs.Input;

public class cifrado_cesar {
	
	static char mensaje[],cifrado;
	static int men;
	
	public static void main(String[] args) {
		System.out.print("mensaje inicial: ");
		mensaje=Input.get_char();
		cif();
	}
	
	static public void cif() {
		Input.print((int)mensaje);
		men=mensaje;
		
	//System.out.print(men);
		Input.print("\n"+(char)men);

	
	
		
	}

}
