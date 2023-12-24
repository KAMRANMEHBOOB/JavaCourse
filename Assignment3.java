import java.util.Scanner;


class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Guesser kindly guess the number between 1 to 10.");
		guessNum=scan.nextInt();

        while(guessNum<1 || guessNum>10 ){
            System.out.println("Guess only in the range of 1-10");
            System.out.print("Guess Again ");
		    guessNum=scan.nextInt();
        }
		return guessNum;
	}	
}

class Player
{
	int guessNum;
    static int playerCount;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		guessNum=scan.nextInt();
        while(guessNum<1 || guessNum>10 ){
            System.out.println("Guess only in the range of 1-10");
            System.out.print("Guess Again ");
		    guessNum=scan.nextInt();
        }
		return guessNum;
	}
}



class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

    void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}

    void collectNumFromPlayers()
	{
        System.out.println("Player 1 Guess between 1-10");
		Player p1=new Player();
        numFromPlayer1=p1.guessNum();

        System.out.println("Player 2 Guess between 1-10");
		Player p2=new Player();
        numFromPlayer2=p2.guessNum();

        System.out.println("Player 3 Guess between 1-10");
		Player p3=new Player();
        numFromPlayer3=p3.guessNum();
			
	}

    int compare(){

        if(numFromPlayer1 == numFromGuesser && 
        numFromPlayer2!= numFromGuesser && numFromPlayer3 != numFromGuesser){
            System.out.println("Player 1 has Won!!");
            return 0;
        }
        else if(numFromPlayer2 == numFromGuesser && 
        numFromPlayer1!= numFromGuesser && numFromPlayer3 != numFromGuesser){
            System.out.println("Player 2 has Won!!");
            return 0;
        }
        else if(numFromPlayer3 == numFromGuesser && 
        numFromPlayer1!= numFromGuesser && numFromPlayer2 != numFromGuesser){
            System.out.println("Player 3 has Won!!");
            return 0;
        }

        else if(numFromPlayer1 == numFromGuesser && numFromPlayer2 == numFromGuesser && 
        numFromPlayer3 == numFromGuesser){
            
            System.out.println("All Players have Guessed correctly! Restarting Game");
            return -1;
        }
        else if(numFromPlayer1 == numFromGuesser && numFromPlayer2 == numFromGuesser){
            while(numFromPlayer1 == numFromGuesser && numFromPlayer2 == numFromPlayer2){

                System.out.println("Player 1 and Player 2 have correctly guessed. Game Tied !");
                System.out.println("Player 1 Guess between 1-10");
                Player p1=new Player();
                numFromPlayer1=p1.guessNum();
                System.out.println("Player 2 Guess between 1-10");
                Player p2=new Player();
                numFromPlayer2=p2.guessNum();
            }
            if(numFromPlayer1 == numFromGuesser){
                System.out.println("Player 1 has Won!!");
                return 0;
            } 
            else if( numFromPlayer2 == numFromGuesser){
                System.out.println("Player 2 has Won!!");
                return 0;
            }
            else{
                System.out.println("None of the Players Won!!");
            }
        }

        else if(numFromPlayer1 == numFromGuesser && numFromPlayer3 == numFromGuesser){
            while(numFromPlayer1 == numFromGuesser && numFromPlayer3 == numFromGuesser){

                System.out.println("Player 1 and Player 3 have correctly guessed. Game Tied !");
                System.out.println("Player 1 Guess between 1-10");
                Player p1=new Player();
                numFromPlayer1=p1.guessNum();
                System.out.println("Player 3 Guess between 1-10");
                Player p3=new Player();
                numFromPlayer3=p3.guessNum();
            }
            if(numFromPlayer1 == numFromGuesser){
                System.out.println("Player 1 has Won!!");
                return 0;
            } 
            else if( numFromPlayer3 == numFromGuesser){
                System.out.println("Player 3 has Won!!");
                return 0;
            }
            else{
                System.out.println("None of the Players Won!!");
            }
        }


        else if(numFromPlayer2 == numFromGuesser && numFromPlayer3 == numFromGuesser){
            while(numFromPlayer2 == numFromGuesser && numFromPlayer3 == numFromGuesser){

                System.out.println("Player 2 and Player 3 have correctly guessed. Game Tied !");
                System.out.println("Player 2 Guess between 1-10");
                Player p2=new Player();
                numFromPlayer2=p2.guessNum();
                System.out.println("Player 3 Guess between 1-10");
                Player p3=new Player();
                numFromPlayer3=p3.guessNum();
            }
            if(numFromPlayer2 == numFromGuesser){
                System.out.println("Player 2 has Won!!");
                return 0;
            } 
            else if( numFromPlayer3 == numFromGuesser){
                System.out.println("Player 3 has Won!!");
                return 0;
            }
            else{
                System.out.println("None of the Players Won!!");
                return 0;
            }
        }

        else{
            System.out.println("None of the Players Won!!");
            return 0;
        }
        return 0;
    }
}



public class Assignment3{
    public static void main(String args[]){
        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        int comparison = u.compare();
        while(comparison == -1){
            u.collectNumFromGuesser();
            u.collectNumFromPlayers();
            comparison = u.compare();
        }
    }
}

