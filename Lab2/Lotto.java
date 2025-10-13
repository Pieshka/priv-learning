import java.util.Random;
import java.util.ArrayList;

public class Lotto
{
    public static void main()
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random rand = new Random();
        while(numbers.size() < 6)
        {
            int nextRandom = rand.nextInt(1,49);
            if (!numbers.contains(nextRandom))
                numbers.add(nextRandom);
        }

        System.out.println(numbers);
    }
}