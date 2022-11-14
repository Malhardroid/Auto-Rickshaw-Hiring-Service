import java.io.*;
public class Malhar_Travels_Auto_Rickshaw
{
    public static void main() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        
        int choice;// To ask user which taxi he/she would like
        int dist1;// To ask user the distance he/she would like to travel 
        int money;// To take payement method
        int cash;// To take debit card, credit card no. if chosen method of payment is so
        System.out.println("Enter 1 or 2 for taxi number");
        choice=Integer.parseInt(in.readLine());
        System.out.println("How much distance do you want to travel-answer only in nubers else error might occur");
        dist1=Integer.parseInt(in.readLine());
        
        if (choice==1)
        {   
            if(dist1<5)
            {
                System.out.println("Taxi number:2107");
                System.out.println("Distance travelled:"+dist1);
                System.out.println("Amount:Rs "+dist1*20);
                System.out.println("**********************************");
                System.out.println("Thanks for chosing Malhar_Travels");
            }
            if(dist1<15 && dist1>5)
            {
                System.out.println("Taxi number:2107");
                System.out.println("Distance travelled:"+dist1);
                System.out.println("Amount:Rs "+dist1*10);
                System.out.println("**********************************");
                System.out.println("Thanks for chosing Malhar_Travels");
            }
            if(dist1<25 && dist1>15)
            {
                System.out.println("Taxi number:2107");
                System.out.println("Distance travelled:"+dist1);
                System.out.println("Amount:Rs "+dist1*8);
                System.out.println("**********************************");
                System.out.println("Thanks for chosing Malhar_Travels");
            }
            if(dist1>25)
            {
                System.out.println("Taxi number:2107");
                System.out.println("Distance travelled:"+dist1);
                System.out.println("Amount:Rs "+dist1*5);
                System.out.println("**********************************");
                System.out.println("Thanks for chosing Malhar_Travels");
            }
        }
        else
        {
            if(dist1<5)
            {
                System.out.println("Taxi number:1739");
                System.out.println("Distance travelled:"+dist1);
                System.out.println("Amount:Rs "+dist1*20);
                System.out.println("**********************************");
                System.out.println("Thanks for chosing Malhar_Travels");
            }
            if(dist1<15 && dist1>5)
            {
                System.out.println("Taxi number:1739");
                System.out.println("Distance travelled:"+dist1);
                System.out.println("Amount:Rs "+dist1*10);
                System.out.println("**********************************");
                System.out.println("Thanks for chosing Malhar_Travels");
            }
            if(dist1<25 && dist1>15)
            {
                System.out.println("Taxi number:1739");
                System.out.println("Distance travelled:"+dist1);
                System.out.println("Amount:Rs "+dist1*8);
                System.out.println("**********************************");
                System.out.println("Thanks for chosing Malhar_Travels");
            }
            if(dist1>25)
            {
                System.out.println("Taxi number:1739");
                System.out.println("Distance travelled:"+dist1);
                System.out.println("Amount:Rs "+dist1*5);
                System.out.println("**********************************");
                System.out.println("Thanks for chosing Malhar_Travels");
            }
        }
        System.out.println("**********************************");
        System.out.println("What would you like to pay with:");
        System.out.println("1.Debit Card  2.Credit Card  3.Net Banking  4.Paytm  5.Cash");
        money=Integer.parseInt(in.readLine());
        if(money==1)
        {
            System.out.println("Enter Debit Card No.");
            cash=Integer.parseInt(in.readLine());
            System.out.println("Amount Transferred");
        }
        if(money==2)
        {
            System.out.println("Enter Credit Card No.");
            cash=Integer.parseInt(in.readLine());
            System.out.println("Amount Transferred");
        }
        if(money==3)
        {
            System.out.println("Plz. visit our website www.malhartravels.com and transfer money.");
            System.out.println("Amount Transferred");
        }
        if(money==4)
        {
            System.out.println("Plz. pay on our paytm account-Malhar_Travels");
            System.out.println("Our paytm accout no. is- 12345");
            System.out.println("Amount Transferred");
        }
        System.out.println("Thank You");
        System.out.println("Good Bye");
    }
}
