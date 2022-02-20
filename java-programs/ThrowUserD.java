class ThrowUserD
{
   public static void main(String args[])
   {
      int a=100;
      try{
         if(a<200)
         {
            throw new MyException("Minimum value error");
         }
      }
         catch(Exception e)
         {
            System.out.println(e);
         }
      }
      
   }
   class MyException extends Exception
   {
      public MyException(String alert)
      {
         super(alert);
      }
   }