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
        generateSecret(length);
    }

    public static void generateSecret(int length) {
        if (length > 10) {
            System.out.println("Error: can't generate a secret number with a length of " + length
                + " because there aren't enough unique digits.");
            return;
        }

        List<Integer> secrets =  new ArrayList<>(length);

        for (int i = 0; i < secrets.size(); i++) {
            secrets.add(i, generateValue(secrets));
            while (i == 0 && secrets.get(i) == 0) {
                secrets.add(i, generateValue(secrets));
            }
        }
        System.out.print("The random secret number is ");
//        for (int i = 0; i < secrets.length; i++) {
//            for (int j = 0; j < secrets.length; j++) {
//                while (secrets[i] == secrets[j] && i != j) {
//                    secrets[j] = generateRandom();
//                }
//            }
//            System.out.print(secrets[i]);
//        }
        System.out.print(" .");
    }

    private static Integer generateValue(List secrets) {
        Integer value = generateRandom();
        if (secrets.contains(value)) {

        }
//        return ;
    }

    private static Integer generateRandom() {
        Random random = new Random();
        return random.nextInt(9);
    }

}
