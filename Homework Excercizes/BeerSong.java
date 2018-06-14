import java.util.Scanner;

public class BeerSong
{

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in); 
      System.out.print("Enter number of verses to sing:");
      int attempts = scan.nextInt();
      int count = 100;   
         
      for(int i = 0; i < attempts; i++) 
      {
         System.out.println(count + " bottles of beer on the wall");
         System.out.println(count + " bottles of beer");
         System.out.println("If one of those bottles should happen to fall");
         count = count - 1;
         System.out.println(count + " bottles of beer on the wall");
         System.out.println();
      }
   }   
}

