import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String names[] = new String[10];
		int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0; 
        int n=1;
        int y=0;
        lb2:
		for(int i=0;i<n;i++){
		    System.out.println("---------------------------------");
		    System.out.println("Welcome to Voting session!");
		    System.out.println("Enter 1 0r 0 \n1 --> continue voting!!! \n0 --> Exit!!!");
		    System.out.println("---------------------------------");
		    int v = s.nextInt();
		    lb1:
		    while(v!=0){
		        n++;
		    System.out.println("---------------------------------");
		    System.out.print("Enter your Name:");
		    String name=s.next();
		    System.out.println("---------------------------------");
		    for(int j=0;j<n;j++){
		       if(name.equals(names[j])) {
		       System.out.println("You have already voted...!!!!!");
		       break lb1; }
		    }
		    
		    names[i]=name;
		    System.out.println("Hello "+name);
            System.out.println("Please select a candidate to vote:");
            System.out.println("1. Candidate 1");
            System.out.println("2. Candidate 2");
            System.out.println("3. Candidate 3");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();
            System.out.println("Your voting has been registered... ThankYou!!!");
            if (choice == 4) {
                System.out.println("Voting session ended. Thank you!");
                break lb2;
            }

            switch (choice) {
                case 1:
                    candidate1Votes++;
                    break lb1;
                case 2:
                    candidate2Votes++;
                    break lb1;
                case 3:
                    candidate3Votes++;
                    break lb1;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break lb1;
            }
		    }
		}
		
		if(y==0){
		    System.out.println("********************************************");
		    if(candidate1Votes>candidate2Votes && candidate1Votes>candidate3Votes){
		        System.out.println("Winner is Candidate1");
		    }
		    else if(candidate2Votes>candidate1Votes && candidate2Votes>candidate3Votes){
		        System.out.println("Winner is Candidate2");
		    }
		    else if(candidate3Votes>candidate1Votes && candidate3Votes>candidate2Votes){
		        System.out.println("Winner is Candidate3");
		    }
		    else if(candidate1Votes==candidate2Votes && candidate1Votes!=candidate3Votes && candidate3Votes!=candidate2Votes){
		        System.out.println("Candidate1 and Candidate2 has been tied up!");
		    }
		    else if(candidate1Votes==candidate3Votes && candidate1Votes!=candidate2Votes && candidate3Votes!=candidate2Votes){
		        System.out.println("Candidate1 and Candidate3 has been tied up!");
		    }
		    else if(candidate3Votes==candidate2Votes && candidate1Votes!=candidate3Votes && candidate2Votes!=candidate1Votes){
		        System.out.println("Candidate3 and Candidate2 has been tied up!");
		    }
		    else{
		        System.out.println("All 3 Caandidates has been tied up!");
		    }
		    System.out.println("********************************************");
		}
	}
}
