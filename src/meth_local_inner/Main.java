package meth_local_inner;

class A {
	void meth() {
		final int data =10;
		
		class Local {
			void localmeth() {
				 System.out.println("Inside local meth "+data);
			}
		}
		// creating an instance of local class &call its meth
		Local local = new Local();
        local.localmeth();
	}
}
public class Main {
	public static void main (String[] args) {
		A a = new A();
		a.meth();
	}

}
