import java.util.Scanner;

public class Bob {

    public static void main(String[] args){

        boolean talkToBob = true;

        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to talk to Bob? (Y/N)");
            String yesOrNo = sc.next();
            if(yesOrNo.equalsIgnoreCase("y")){
                System.out.println("Ok, what do you have to say?");
                sc.nextLine();
                String userInput = sc.nextLine();
                System.out.println();
                if(userInput.endsWith("?")){
                    System.out.println("sure");
                    continue;
                }   if(userInput.endsWith("!")){
                    System.out.println("whoa, chill out dude");
                    continue;
                }   if(userInput.equals("")){
                    System.out.println("fine, be that way i guess");
                    continue;
                }   else{
                    System.out.println("whatever");
                }

            }   else if(yesOrNo.equalsIgnoreCase("n")){
                talkToBob = false;
            }
        }   while(talkToBob);

        System.out.println("You are no longer talking to Bob");

    }

}
