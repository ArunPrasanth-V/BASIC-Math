package AllMath;

public class Child_Parent {

	public static void main(String[] args) {
		B b=new B();
	}

}
class A
{
	public A(int x,int y)
	{
		System.out.println(x+y);
	}
}
class B extends A
{
	//B b=new B(500,500);
    B() {
		super(500, 500);
	}

	
	
}