package simple_inner_class;

class A{
	
	  private int a=20;
	  
	  class B{
		  void meth() {
			  System.out.println(a);
		  }
	  }
	}


	public class Main {
		public static void main(String[] args) {
			A a=new A(); // outter class obj
			A.B b=a.new B(); // inner class  obj
			b.meth(); // 20
		}

	}
