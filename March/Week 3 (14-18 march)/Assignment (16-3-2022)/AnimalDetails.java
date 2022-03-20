package march_14_Assignment;

class Animal{
	int legs;
	String typeOfEater;
	 public static void eat() {
		 System.out.println("I eat");
	 }	 
	Animal(){
		this.legs=4;
		this.typeOfEater="Omnivores";
	}
		
	public Animal(int legs, String typeOfEaters) {
	this.legs = legs;
	this.typeOfEater = typeOfEaters;
	}

	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public String getTypeOfEaters() {
		return typeOfEater;
	}
	public void setTypeOfEaters(String typeOfEaters) {
		this.typeOfEater = typeOfEaters;
	}
	
	public String toString() {
		return "Animal [legs= " + legs + ", typeOfEater= " + typeOfEater +"]";
	}	 	 
}


public class AnimalDetails {
	public static void main(String[] args) {
		Animal dog=new Animal();
		System.out.println("------Dog------");
		System.out.println(dog);
		System.out.println();
		
		System.out.println("------Cat------");
		Animal cat=new Animal();
		System.out.println(cat);
		System.out.println();
		
		System.out.println("------Cow------");
		Animal cow=new Animal();
		cow.setLegs(4);
		cow.setTypeOfEaters("Herbivores");
		System.out.println(cow);
		System.out.println();
		
		System.out.println("------Elephant------");
		Animal elephant=new Animal(4,"herbivores");
        System.out.println(elephant);
	}
}
