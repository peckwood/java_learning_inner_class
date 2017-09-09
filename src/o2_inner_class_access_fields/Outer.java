package o2_inner_class_access_fields;

public class Outer {
	private String outerString = "I am outer string";
	
	public class Inner{
		public void accessOuterString(){
			System.out.println(outerString);
		}
	}
}
