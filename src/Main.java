import java.util.Arrays;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
          int[] numbers = { 1,2,3 };
        System.out.println(average(numbers).getAsDouble());
    }

    public static OptionalDouble average(int[] list) {
        return Arrays.stream(list).average();
    }
}