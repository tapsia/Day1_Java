package oops;

  public class Overriding1 {

    public void method1() //Base class method
    {
         System.out.println ("BaseClass");
    }
}
 class Ovrriding2 extends Overriding1
{
    public void method1() //Derived Class method
    {
         System.out.println ("DerivedClass");
    }
}
 

 class OverRiding2_main {

	public static void main(String[] args) {
		Overriding1 o1 = new Overriding1();
		Overriding1 o2 = new Ovrriding2();
		o1.method1();
		o2.method1();
		
	}

}