class VarEx
{
	int a=10;              //instance variable
	static int b=30;      //static or class variable

	public static void main(String[] args)
	{
		int c=100;              //local variable
		VarEx obj=new VarEx();

		System.out.println("Value of Instance Variable:" +obj.a);
		System.out.println("Value of Static Variable:" +VarEx.b);
		System.out.println("Value of Local Variable:" +c);
	}
}