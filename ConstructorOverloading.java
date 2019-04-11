class ConstructorOverloading
{
	ConstructorOverloading()
	{
		System.out.println("Non-Parameterized Constructor");
	}
		
	ConstructorOverloading(int a)
	{
		System.out.println("Parameterized Constructor with a single integer as argument");
	}

	ConstructorOverloading(double b)
	{
		System.out.println("Parameterized Constructor with a double as argument");
	}

	ConstructorOverloading(String c1, String c2)
	{
		System.out.println("Parameterized Constructor with a two Strings as argument");
	}
	
	public static void main(String args[])
	{
		new ConstructorOverloading();
		new ConstructorOverloading(10);
		new ConstructorOverloading(3.142);
		new ConstructorOverloading("Java","LabPrograms");
	}
}
