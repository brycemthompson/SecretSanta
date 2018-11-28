import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SecretSanta
{
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList(Arrays.asList("bryce", "jason", "kenny", "connor", "sam", "grace"));
        ArrayList<String> alreadyPlayed = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String input;
        Random rand = new Random();
        int n = 0;

        do {
            System.out.println("Enter your name to receive the person you will give a gift to:");
            System.out.println("List of valid names:");
            System.out.println("Connor, Jason, Bryce, Sam, Grace, Kenny");

            input = in.next();
            while (alreadyPlayed.contains(input.toLowerCase())) //Nobody can play twice
            {
                System.out.println("You have already played. Please let someone else play.");
                System.out.println("Enter your name to receive the person you will give a gift to:");
                System.out.println("List of valid names:");
                System.out.println("Connor, Jason, Bryce, Sam, Grace, Kenny");
                input = in.next();
            }

            //A new person is playing, give them a name.
            if (!input.isEmpty() && !people.isEmpty())
                n = rand.nextInt(people.size()) + 0;
                //Can't receive yourself
                while (people.get(n).toLowerCase().equals(input.toLowerCase()))
                    n = rand.nextInt(people.size()) + 0;

                alreadyPlayed.add(input.toLowerCase());

                System.out.println(input + ", you will give a gift to " + people.get(n));
                people.remove(n);

                System.out.println("Type -1 for the next person"); //will clear the screen for the next person
                input = in.next();

                while (!input.equals("-1")) {
                    System.out.println("Bitch, I told you to enter -1");
                    input = in.next();
                }

                for (int i = 0; i < 8; i++)
                    System.out.println();

            } while (input.equals("-1") && !people.isEmpty()) ;

    }
}
