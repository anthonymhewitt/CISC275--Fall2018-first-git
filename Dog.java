import java.lang.String;
public class Dog extends Animal{

	public String toString(){
		return this.name;
	}
	
	public Dog(String name, int legs){
	
		this.legs = legs;
		this.name = name;
	}


}
	