package bullscows;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println("The secret code is prepared: ****.");
        Scanner scanner = new Scanner(System.in);
        //String answer = scanner.nextLine();
        //grader(answer);
        //String secret = scanner.nextLine();
        //gamelog(secret);
        int length = scanner.nextInt();
        secgene(length);
    }
    public static void grader(String answer){
        check("9305",answer);

    }
    public static void secgene(int length){
        if ( length>10 ){
            System.out.println("Error: can't generate a secret number with a length of "+length+" because there aren't enough unique digits.");
        } else {
            long[] ingen = new long[length];
            //Random random = new Random();
            for (int i = 0;i < ingen.length-1;i++){
                //do {
                    ingen[i] = (long) Math.random(); // ingen [i] = random.nextInt(9) walo

                //} while ( ingen[i]!=0 && i==0);

            }
            //String secret = new String(ingen.toString());
            System.out.println("The random secret number is "+ingen+".");
        }

    }
}
