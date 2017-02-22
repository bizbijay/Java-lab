class vehicle
{
	void displayWheels(int a)
	{
		System.out.println("wheels= " +a);
	}
	
	void displaySeats(int a)
	{
		System.out.println("Seats= " +a);
	}
	
}

class car extends vehicle
{
}

class bike extends vehicle
{
}

class inheritance1
{
	public static void main(String args[])
	{
	car c=new car();
	bike b=new bike();
	
	System.out.println("car specification: ");
	c.displayWheels(4);
	c.displaySeats(6);
	
	System.out.println("bike specification: ");
	c.displayWheels(2);
	c.displaySeats(1);
	}
}

