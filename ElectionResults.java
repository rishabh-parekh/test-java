
import java.io.*;
import java.util.*;

public class ElectionResults {

   public static void main (String [] args) {

     System.out.println(" Polly Tichen");
     System.out.println(" Ernest Orator");

     List <Integer> vote_pt = new ArrayList <Integer> ();
     List <Integer> vote_eo = new ArrayList <Integer> ();

     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter number of precincts:");
     int precincts = scanner.nextInt();

     int precinct_vote_p = 0;
     int precinct_vote_e = 0;
     int precinct_count_p = 0;
     int precinct_count_e = 0;
     int precinct_count_tie = 0;

     int total_votes_p = 0;
     int total_votes_e = 0;

     for (int i = 0; i < precincts; i++) {
       System.out.println("Enter the number of Votes for Polly Tichen for Precinct " + i + ":");
       precinct_vote_p  = scanner.nextInt();
       vote_pt.add(i,precinct_vote_p);
       total_votes_p += precinct_vote_p;


       System.out.println("Enter the number of Votes for Ernest Orator for Precinct " + i + ":");
       precinct_vote_e  = scanner.nextInt();
       vote_eo.add(i,precinct_vote_p);
       total_votes_e += precinct_vote_e;

       if (precinct_vote_p > precinct_vote_e) {
         precinct_count_p ++;
       }
       else if (precinct_vote_p < precinct_vote_e) {
         precinct_count_e++;
       }
       else  {
         precinct_count_tie++;
       }
     }

    String winner = "";
    if (total_votes_p > total_votes_e) {
      winner = "Polly Tichen is the Winner";
    } else if (total_votes_e > total_votes_p) {
      winner = "Ernest Orator is the Winner";
    } else
      winner = "Its a Tie";

    System.out.println("Precincts won by Polly Tichen: " + precinct_count_p);
    System.out.println("Precincts won by Ernest Orator: " + precinct_count_e);
    System.out.println("Precincts tied between Polly Tichen and Ernest Orator: " + precinct_count_tie);

    System.out.println("Total votes for Polly Tichen: " + total_votes_p);
    System.out.println("Total votes for Ernest Orator: " + total_votes_e);

    long p_votes_p = Math.round((total_votes_p)*100.0/(total_votes_p + total_votes_e));
    long p_votes_e = Math.round((total_votes_e)*100.0/(total_votes_p + total_votes_e));
    System.out.println("Percentage of votes by Polly Tichen: " + p_votes_p + " %");
    System.out.println("Percentage of votes by Ernest Orator: " + p_votes_e + " %");

    long p_precinct_p = Math.round((precinct_count_p)*100.0/(precinct_count_p + precinct_count_e));
    long p_precinct_e = Math.round((precinct_count_e)*100.0/(precinct_count_p + precinct_count_e));

    System.out.println("Percentage of Precincts by Polly Tichen: " + p_precinct_p + " %");
    System.out.println("Percentage of Precincts by Ernest Orator: " +  p_precinct_e + " %");


    System.out.println("The results of the vote are : " + winner);
    System.out.println("The Percentage (precincts) difference is: " + Math.abs(p_precinct_p - p_precinct_e));
    System.out.println("The Percentage (Vote) difference is: " + Math.abs(p_votes_p - p_votes_e));


   }


}
