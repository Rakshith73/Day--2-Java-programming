interface one
{
    public void show();
  }
 
 
class functionalinterface
{
    public static void main(String asd[])
	{
	   one obj=new one(){
			@Override
    				 public void show()
				{	
				  System.out.println("Functional interface");
				}
	};
	   obj.show();
	}
 
}