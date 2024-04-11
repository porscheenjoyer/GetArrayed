import java.util.*;

public class Arrays {
    public static void main(String[] args) {

        Random rnd = new Random();

        Scanner in = new Scanner(System.in);

        int [] dataPoint = new int [100];

        for (int i = 0; i < dataPoint.length; i ++) {

            dataPoint[i] = rnd.nextInt(100);

        }

        for (int i = 0; i < dataPoint.length; i ++) {

            System.out.print(dataPoint[i] + " | ");

        }

        System.out.println();

        int userInput = SafeInput.getRangedInt(in, "Enter a number 1 to 100.", 1, 100);

        System.out.println("Average of dataPoint is " + SafeInput.getAverage(dataPoint));

        int min = SafeInput.min(dataPoint);

        System.out.println("The min is " + min);

        int max = SafeInput.max(dataPoint);

        System.out.println("The max is " + max);

        int occuranceScan = SafeInput.occuranceScan(dataPoint, userInput);

        System.out.println("The number was found " + occuranceScan + " times");

        int sum = SafeInput.sum(dataPoint);

        System.out.println("The sum of the array is " + sum);

        boolean found = SafeInput.contains(dataPoint, userInput);

    }
}
