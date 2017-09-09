package o1_access_inner_class_via_method;

public class Outer {
	private class Inner{
		public void print(){
			System.out.println("This is inner class");
		}
	}
	public void accessInner(){
		Inner inner = new Inner();
		inner.print();
	}
}
