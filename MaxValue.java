public class MaxValue {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 30, 5, 4 };
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(" tha maximum value is " + max);
    }
}