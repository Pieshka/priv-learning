import java.util.Random;
import java.util.ArrayList;

public class Lotto
{
    public static void main(String[] args)
    {
        if(args.length < 6)
        {
            System.out.println("Usage: java Lotto <number> <number> <number> <number> <number> <number>");
            System.exit(1);
        }

        ArrayList<Integer> userNumbers = new ArrayList<>();
        for (String arg : args) userNumbers.add(Integer.parseInt(arg));
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        while(numbers.size() < 6)
        {
            int nextRandom = rand.nextInt(1,49);
            if (!numbers.contains(nextRandom))
                numbers.add(nextRandom);
        }

        int countUserHits = 0;
        for(int i = 0; i < userNumbers.size(); i++)
            if(numbers.contains(userNumbers.get(i)))
                countUserHits++;

        System.out.println("Twoje typy: " + userNumbers);
        System.out.println("Wylosowane liczby: " + numbers);
        System.out.println("Liczba trafień: " + countUserHits);
    }
}