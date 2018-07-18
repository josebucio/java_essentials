package ejercicios;

public class Babyexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Baby prettybaby = new Baby("luis",'M',5,4.78);
		System.out.print(prettybaby +"\n");
		prettybaby.sleep();
		prettybaby.eat();
		prettybaby.cry();
	}

}