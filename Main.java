import java.util.Random;
import java.util.Scanner;

class Luck_Function
{
    Random random=new Random();
    Scanner scanner=new Scanner(System.in);

    void luck_finder()
    {
        int guess_till_included=100;
        int comp_num,user_num,process;

        System.out.println("Welcome to luck-find-er");

        comp_num=random.nextInt(guess_till_included+1);

        System.out.print("Enter a random integral between 0 and "+guess_till_included+": ");
        user_num=scanner.nextInt();
            
        if(comp_num==user_num)
        {
            System.out.println("Great! You have a luck of 100%");
        }
        else
        {
            if(user_num>comp_num)
            {
                process=100-(((user_num-comp_num)*100)/guess_till_included+1);
                System.out.println("You have a luck of "+process+"%");
            }
            else if(user_num<comp_num)
            {
                process=100-(((comp_num-user_num)*100)/guess_till_included+1);
                System.out.println("You have a luck of "+process+"%");
            }
        }
    }
}

class Main
{
    public static void main(String args[])
    {
        Luck_Function obj=new Luck_Function();
        obj.luck_finder();
    }
}