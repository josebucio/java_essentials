package ejercicios;

public class Baby {

	    char sex;
		int numDispers;
		String name;
        double weight;
        

	public Baby(String babyname,char babysex,int numDispers,double weight){
        	this.name = babyname;
        	this.numDispers = numDispers;
        	this.sex = babysex;
        	this.weight = weight;
        	
        }
	
	public void cry () {
		System.out.println("wawawawa");
	}
	
	public void eat () {
		System.out.println("chum-chum");
	}
	
	public void sleep () {
		System.out.println("row-row");
	}
	
	public String toString() {
		return this.name+" "+this.sex;
	}
}
