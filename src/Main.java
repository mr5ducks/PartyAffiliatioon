import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        //these kinda look like variables
        System.out.println("Choose your party!!!!");
        System.out.println("Democrat, Republican, Independent ");
        System.out.println("Enter your choice= R, I, D: ");
        //
        String party = in.next().toUpperCase();//upper case
        //the if statements and else if
        if (party.equals("D")){ //start of if statement
            System.out.println("You get a Democratic Donkey ");
        } else if (party.equals("R")) {
            System.out.println("You get a Republican Elephant ");
        } else if (party.equals("I")) {
            System.out.println("You get an Independent Person ");
        } else {
            System.out.println("you chose some one different ");
        }//code should end here
        in.close();// don't forget
    }
}