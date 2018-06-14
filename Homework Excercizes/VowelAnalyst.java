import java.util.Scanner;

public class VowelAnalyst
{
	
	public static void main(String[] args)
	{
		String message;
		Scanner scan = new Scanner(System.in);
		System.out.print("enter string:");
		message = scan.next();
		
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		
		for(int i = 0; i < message.length(); i++)
		{
			char current = message.charAt(i);
         
         if(current == 'a')
         {
            count1++;
         }
                else
                    if(current == 'e')
                      {
                        count2++;
                      }
                         else
                             if(current == 'i')
                             {
                               count3++;
                             }
                             else
                                 if(current == 'o')
                                     {
                                       count4++;
                                     }
                                      else
                                         if(current == 'u')
                                          {
                                            count5++;
                                          }
                                          else
                                             if(current == ' ')
                                             {
                                               count6++;
                                             }
                                             else
                                             {
                                               count6++;
                                             }
                                             
                                           

      }
      
      System.out.println("a: " + count1);
      System.out.println("e: " + count2);
      System.out.println("i: " + count3);
      System.out.println("o: " + count4);
      System.out.println("u: " + count5);
      System.out.println("other: " + count6);
	}
}