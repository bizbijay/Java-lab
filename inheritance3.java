class setValue
{
	static int x,y;
	void setData(int a,int b)
	{
		x=a;
		y=b;
	}
}

class inheritance3 extends setValue
{
	public static void main(String args[])
	{
		setValue s=new setValue();
		
		s.setData(4,2);
		
		System.out.println("All arithematic operation of " +2 +"and " +3 +"are: ");
		System.out.println("a+b = " +(x+y));
		System.out.println("a-b = " +(x-y));
		System.out.println("a*b = " +(x*y));
		System.out.println("a/b = " +(x/y));		
	}
}
