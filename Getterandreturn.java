class Cars{
	String name;
	int year;
	void speak() {
		System.out.println("Name is "+name+" year of manufacture is "+year);
	}
	void calculatefitness() { //not return anything
		int fitt=year+15;
		System.out.println("Fittness of Car "+name+" manufactured in a year "+year+" is "+fitt);
	}
	int calculatefitness1()//return
	{
		int fitt=year+15;
		return fitt;
	}
	
	int getAge()
	{
		return year;
	}
	String getName()
	{
		return name;
	}
}
public class Getterandreturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars car1 = new Cars();
		car1.name="Audi Q7";
		car1.year=2017;
		car1.speak();
		car1.calculatefitness();
		int fittness=car1.calculatefitness1();
		System.out.println(fittness);
		int year=car1.getAge();
		String name = car1.getName();
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+year);

	}

}
