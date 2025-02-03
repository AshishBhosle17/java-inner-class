package static_inner_class;

class Outer {
	static private int data = 100;
	
	static class Inner {
		void innermeth1() {
			System.out.print("not a static meth " + data);
		}
		//ctrl+space
		static void innermeth2() {
			
			System.out.print("is a static meth " + data);
		}
	}
}
public class Main {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer.Inner();// obj initialisation of inner class
		inner.innermeth1(); //1 way- Correct way to call non-static method
		Outer.Inner.innermeth2(); //2 way- Correct way to call static method
		//Inner.innermeth2(); //3 way
	}

}

