package SeleniumAutomation.FirstTest;

public class Encapsulation {

	public static void main(String[] args) {
		
		person p1= new person();
		p1.setAge(35);
		System.out.println("My age is :" +p1.getAge());
		// TODO Auto-generated method stub

	}

}

class person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	

	
}