package o5_static_inner_class;

public class Application {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer.Inner();
		inner.print();
	}
}
