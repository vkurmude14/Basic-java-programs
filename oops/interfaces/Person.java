package oops.interfaces;

public class Person implements Student,YouTuber{

	public static void main(String[] args) {
		Person p= new Person();
		p.Study();
		p.makeVideo();
		

	}

	@Override
	public void Study() {
		// TODO Auto-generated method stub
		System.out.println("person is studying");
		
	}

	@Override
	public void makeVideo() {
		// TODO Auto-generated method stub
		System.out.println("person is making videos");
		
	}
	

}
