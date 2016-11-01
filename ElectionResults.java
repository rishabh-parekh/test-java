
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

     int precint_vote_p = 0;
     int precint_vote_e = 0;
     int precint_count_p = 0;
     int precint_count_e = 0;
     int total_votes_p = 0;
     int total_votes_e = 0;

     for (int i = 0; i < precincts; i++) {
       System.out.println("Enter the number of Votes for Polly Tichen for Precinct " + i + ":");
       precint_vote_p  = scanner.nextInt();
       vote_pt.add(i,precint_vote_p);
       total_votes_p += precint_vote_p;


       System.out.println("Enter the number of Votes for Ernest Orator for Precinct " + i + ":");
       precint_vote_e  = scanner.nextInt();
       vote_eo.add(i,precint_vote_p);
       total_votes_e += precint_vote_e;

       if (precint_vote_p > precint_vote_e) {
         precint_count_p ++;
       }
       else if (precint_vote_p < precint_vote_e) {
         precint_count_e++;
       }

     }

    System.out.println("Precincts won by Polly Tichen: " + precint_count_p);
    System.out.println("Precincts won by Ernest Orator: " + precint_count_e);

    System.out.println("Total votes for Polly Tichen: " + total_votes_p);
    System.out.println("Total votes for Ernest Orator: " + total_votes_e);

    System.out.println("Percentage of votes by Polly Tichen: " + Math.round((total_votes_p)*100.0/(total_votes_p + total_votes_e)) + " %");
    System.out.println("Percentage of votes by Ernest Orator: " + Math.round((total_votes_e)*100.0/(total_votes_p + total_votes_e)) + " %");


    System.out.println("Percentage of Precincts by Polly Tichen: " + Math.round((precint_count_p)*100.0/(precint_count_p + precint_count_e)) + " %");
    System.out.println("Percentage of Precincts by Ernest Orator: " + Math.round((precint_count_e)*100.0/(precint_count_p + precint_count_e)) + " %");



   }


}
