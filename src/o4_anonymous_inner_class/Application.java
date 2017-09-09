package o4_anonymous_inner_class;

public class Application {
	public static void main(String[] args) {
		MyInterfaceUser user = new MyInterfaceUser();
		
		MyInterface myInterfaceImpl = new MyInterface(){
			@Override
			public void print() {
				System.out.println("print stuff1");
				
			}
		};
		user.useMyInterface(myInterfaceImpl);
		
		//as method argument
		user.useMyInterface(new MyInterface(){
			@Override
			public void print() {
				System.out.println("print stuff2");
				
			}
		});
	}
}
