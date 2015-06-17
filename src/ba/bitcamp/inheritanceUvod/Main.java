package ba.bitcamp.inheritanceUvod;

public class Main {
	
	public static void main(String[] args){
		
		
		Employee e = new Employee("John", "male");
		System.out.println(e);
		
		SalaryEmployee se = new SalaryEmployee("sue", "female", 2000);
		System.out.println(se);
		
		
		HourlyEmployee he = new HourlyEmployee("Joe", "male", 15);
		System.out.println(he);
	}

}
