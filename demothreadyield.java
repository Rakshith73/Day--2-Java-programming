class one extends Thread

  {

     public void run()

	{

	  for(var i=0;i<5;i++)

		{

	          System.out.println(Thread.currentThread().getName()+"-iteration"+i);
		  Thread.yield(); 

		 }

         }

   }
 
 
class demothreadyield

{

    public static void main(String asd[])

	{

	   one obj1=new one();

	   obj1.start();

	   //obj1.yield();

	  	}  

}
 