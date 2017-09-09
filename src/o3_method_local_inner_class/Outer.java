package o3_method_local_inner_class;

public class Outer {
	public void outerMethod(){
		String outerMethodString = "I am outerMethodString";
		class Inner{
			public void printOuterMethodString(){
				System.out.println(outerMethodString);
			}
		}
		Inner inner = new Inner();
		inner.printOuterMethodString();
	}
}
