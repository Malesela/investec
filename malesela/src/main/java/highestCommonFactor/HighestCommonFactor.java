package highestCommonFactor;

public class HighestCommonFactor {
    public static void main(String[] args) {

        int[] numbers = {39, 65, 91, 117};

        HighestCommonFactor highestCommonFactor = new HighestCommonFactor();

        System.out.println("Highest Common Factor: " + highestCommonFactor.highestCommonFactor(numbers));
    }


    public int highestCommonFactor(int[] numbers) {

        int result = numbers[0];

        for (int i = 1; i < numbers.length; i++)
            result = gcd(numbers[i], result);

        return result;
    }

    private int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }
}
