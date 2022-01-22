package DEMO.BasicSyntaxMoreExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SortNumbers2_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = IntStream.range(0, 3).map(i -> Integer.parseInt(scanner.nextLine())).toArray();
        Arrays.sort(numbers);

        IntStream.iterate(2, i -> i >= 0, i -> i - 1).map(i -> numbers[i]).forEach(System.out::println);
    }
}
