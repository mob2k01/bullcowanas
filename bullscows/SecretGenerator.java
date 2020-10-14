package bullscows;
import java.util.*;

public class SecretGenerator {
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
    public static long randomiser() {
        Random random = new Random();
        long value = random.nextInt(9);
        return value;
    }
    public static void secgene(int length) {
        if ( length>10 ){
            System.out.println("Error: can't generate a secret number with a length of "+length+" because there aren't enough unique digits.");
        } else {
            long[] ingen = new long[length];
            for (int i = 0 ; i < ingen.length ; i++ ) {
                ingen[i] = randomiser();
                while ( i==0 && ingen[i]==0 ){
                    ingen[i] = randomiser();
                }
            }
            System.out.print("The random secret number is ");
            for (int i = 0 ; i < ingen.length ; i++ ) {
                for (int j=0 ; j < ingen.length ; j++ ) {
                    while ( ingen[i] == ingen[j] && i!=j ) {
                        ingen[j] = randomiser();
                    }
                }
                System.out.print(ingen[i]);
            }
            System.out.print(" .");
        }
    }
}
