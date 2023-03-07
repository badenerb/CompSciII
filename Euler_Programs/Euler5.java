public class Euler5 {
   public static void main ( String []args)
   {
      int a = 2520;
      int b = 1;
      while (true)
      {
         if (a%b==0)
         {
            b++;
            if (b==20)
            {
               System.out.println(a);
               break;
            }
         }
         else
         {
            a++;
            b=1;
         }
      }  
   }
}