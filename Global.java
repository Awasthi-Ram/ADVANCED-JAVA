class Global{
  Global(){

System.out.println("hi i am java");

}
 Global(int a){

System.out.println("hi i am java" + a);

}
void btech()
	{
		System.out.println("btech");
	}
void bca()
	{
		System.out.println("bca");
	}
void bba()
	{
		System.out.println("bba");
	}
void MBA()
	{
		System.out.println("mba");
	}
public static void main(String args[])
{

Global obj = new Global();
obj.btech();
obj.bca();
obj.bba();
Global obj2 = new Global(7);

}


}