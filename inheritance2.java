class setData
{
	int b,h,w;
	void setBase(int a)
	{
		b=a;
	}
	
	void setHeight(int a)
	{
		h=a;
	}
	
	void setWidth(int a)
	{
		w=a;
	}
}

class areaOfTriange extends setData
{
	void calculateArea()
	{
		System.out.println("area of triangle= " +(0.5*b*h));

	}
}
class areaOfRectangle extends setData
{
	void calculateArea()
		System.out.println("area of rectangle= " +(w*h));
	{
	}
}

class inheritance2
{
	public static void main(String args[])
	{
		areaOfTriange at=new areaOfTriange();
		areaOfRectangle rt=new areaOfRectangle();
		
		at.setBase(2);
		at.setHeight(3);
		
		rt.setWidth(4);
		rt.setHeight(5);
		
		at.calculateArea();
		rt.calculateArea();
		
	}
}