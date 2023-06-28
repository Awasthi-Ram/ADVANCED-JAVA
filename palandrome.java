
class palandrome
{
	public static void main(String args[])
	{
         	String exp = "rar";
			
               String exp2 = " ";
			 
		
                for (int i = exp.length() -1;i >=0;i--)
		{
			exp2 = exp2 + exp.charAt(i);	
			
		}
		System.out.println(exp2);
		
		if (exp.compareTo(exp2) == true)
		{
			System.out.println("it is a palandrome");
		}
		else{
			System.out.println("it is not a palandrome");
              }
	}


}