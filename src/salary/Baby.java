package salary;

public class Baby {
	Baby(int age, String name){
		this.age=age;
		this.name=name;
		number++;
	}
	void print(){
		System.out.println(age+" "+name);
		age++;
	}
	static int number=0;
	int age;
	String name;
}
