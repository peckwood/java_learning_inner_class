package o2_inner_class_access_fields;

public class Application {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.accessOuterString();
	}
}
