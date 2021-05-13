package encapsulations;

public class Student {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
		if (this.age>20) {
			System.out.println("You are not eligible");
		}else {
			System.out.println("You are eligible");
			this.age=age;
		}
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
