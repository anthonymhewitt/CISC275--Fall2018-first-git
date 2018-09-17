public class Animal implements Comparable{
	int legs;
	String name;
	public int getLegs(){
		return legs;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.legs-((Animal)o).getLegs();
	}
	
}