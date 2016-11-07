package oops;

 class Overloading1 {
	int sum(int a , int b)
	{ 
		int c = a+b;
		System.out.println("Sum is: " + c);
		return c;
	}
	
	void sum(int x, int y, int z)
	{
		int total= x+y+z;
		System.out.println("Sum is: " + total);
	}
}

 class Overloading1_main {

	public static void main(String[] args) {
	
		Overloading1 ol = new Overloading1();
		ol.sum(2, 3);
		ol.sum(1, 2, 3);
	}
}

