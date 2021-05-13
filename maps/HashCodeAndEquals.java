package maps;

public class HashCodeAndEquals {
	public static void main (String[] args) {
		Pen pen1=new Pen(10,"Blue");
		Pen pen2=new Pen(10,"Blue");
		System.out.println(pen1.equals(pen2));
	
	}

}
class Pen{
	int price ;
	String colour;
	public  Pen(int price,String colour) {
		this.price=price;
		this.colour=colour;
		
	}
	@Override
	public boolean equals(Object obj) {
		Pen that=(Pen)obj;
		boolean isEqu=this.price==that.price && this.colour.equals(that.colour);
		return isEqu;
	}
	@Override
	public int hashCode() {
		return price+colour.hashCode();
	}
	
}
