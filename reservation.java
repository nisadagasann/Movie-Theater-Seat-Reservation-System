package firstProjectt;
import java.util.Scanner;
import java.util.Arrays;

public class Booking {
  
   public static String[] seatName = new String[20];
   public static boolean[] seatUsed = new boolean[20];

    public static void Book(float n){ // Takes the tickets for empty seats.
   
    Scanner sc = new Scanner(System.in);
        seatUsed[(int) n] = true;
        System.out.println(Msg("success")); 
        
        System.out.println("Would you like to buy some popcorn?");
        
        while (true)
        {
            String answer = sc.nextLine();
            if (answer.equals("yes")) 
            {
            System.out.println("How much grams do you want to buy?");
            double gram = sc.nextDouble();
            System.out.println( gram + " grams popcorn is getting ready. Enjoy the movie!\n");
            break;
            }
            else if (answer.equals("no")){
                System.out.println("Ok then, enjoy the movie!\n");
            break;
            }
            else {
                System.out.println("Sorry I couldn't understand. May you answer with yes-no answers?");
            }
        } 
    }
    
//We used “while” for waiting until getting yes- no answers from the user. Also, we used break for finishing the loop.
   
  public static boolean Check(String s){    // To find the seat which has written on console. 
        Scanner sc = new Scanner(System.in);
       int n;
       if(Arrays.asList(seatName).contains(s)) 
       {
           n= Arrays.asList(seatName).indexOf(s);
           if(IsUsed(n)) 
           {  
              System.out.println(Msg("fail"));
              return false; 
           }
           else
           {
            Book(n);
            return true; 
           } 
        }
       else System.out.println(Msg("error"));
       return false; 
    }

    public static boolean IsUsed(int n){ //Checks if the chosen seat has booked before.
        return seatUsed[n];
    }       
    public static String Msg(String msg)  
    {
        if (msg == "error") return "Sorry, there's a mistake with input. Please try again...";
        if (msg == "fail") return "Sorry, the seat you have chosen is booked. May you choose another seat?";
        if (msg == "success") return "The seat has booked successfully.";
      return msg;
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String input;
        
        for (int i = 0; i < 20; ++i)
        {
            seatName[i] = Integer.toString(i+1);
        }
        Arrays.fill(seatUsed, false); 

        while(true)
        {
            System.out.println("Welcome!Please choose a number between 0-20 for your seat.");
            while (true)
            {
                input = sc.nextLine();
                if (Check(input))
                {
                    break;
                }
            }
        }
    }
}
