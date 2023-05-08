import java.util.Scanner;
public class VideoRental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price[] = {150,160,170,180,190};
        int total = 0;
        boolean transaction = true;
        
        System.out.print("Press enter to start : ");
        String pressEnter = input.nextLine();
        
        System.out.print("1.) Rent a movie\n");
        System.out.print("2.) Return what you`ve rented\n");
        System.out.print("3.) About\n");
        System.out.print("4.) Exit\n");
        
        System.out.print("Enter your choice here : ");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                while(transaction){
                    
                System.out.print("\tAVAILABLE MOVIES\n\n");
                System.out.print("MOVIES\t\t\tPRICE\n\n");
                System.out.print("1.) Inception\t\tP 150\n\n");
                System.out.print("2.) Gladiator\t\tP 160\n\n");
                System.out.print("3.) Goodfellas\t\tP 170\n\n");
                System.out.print("4.) Psycho   \t\tP 180\n\n");
                System.out.print("5.) Titanic  \t\tP 190\n\n");
                
                System.out.print("Enter your choice here : ");
                int userChoice = input.nextInt();
                
                System.out.print("Enter the quantity here : ");
                int quantity = input.nextInt();
                
                total += price[userChoice - 1] * quantity;
                
                System.out.print("Do you want to rent more movies? (y/n): ");
                input.nextLine();
                String buyMore = input.nextLine();
                
                if(buyMore.equalsIgnoreCase("n")){
                    transaction = false;
                    System.out.print("The total price is: P " + total + "\n");
                    
                    System.out.print("Enter your payment here : P ");
                    int payment = input.nextInt();
                    
                    int change = payment - total;
                    System.out.print("Change : P " + change + "\n");
                    System.out.print("\n\nTHANK YOU FOR RENTING OUR MOVIES ^_^\n");
                    
                }
                
                } 
                break;
            
            case 2:
                System.out.print("\tAVAILABLE MOVIES TO RETURNED\n\n");
                System.out.print("1.) Inception\n\n");
                System.out.print("2.) Gladiator\n\n");
                System.out.print("3.) Goodfellas\n\n");
                System.out.print("4.) Psycho\n\n");
                System.out.print("5.) Titanic\n\n");
                
                System.out.print("Enter the movie/s you want to return : ");
                int returnVideos = input.nextInt();
                
                System.out.print("\n\n---SUCCESSFULLY RETURNED---\n\n");
                break;
                
            case 3:
                System.out.print("\n\nWelcome to our video rental system! We are dedicated to providing an exceptional movie\nrental experience for all our customers. With our vast selection of movies, we offer\nsomething for everyone, from the latest blockbusters to timeless classics.\n");
                break;
                
            case 4:
                System.out.print("\n\n---EXITING---\n\n");
                break;
                
            default:
                System.out.print("\n\nINVALID CHOICE\n");    
        }
    }
}
