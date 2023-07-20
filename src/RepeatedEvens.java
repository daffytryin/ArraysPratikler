import java.util.Arrays;

public class RepeatedEvens {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 4, 12, 2, 14, 16, 8};

        int[] repeatedEvenNumbers = findRepeatedEvenNumbers(numbers);

        // Print the repeated even numbers
        System.out.println("Tekrar eden çift sayılar:");
        for (int number : repeatedEvenNumbers) {
            System.out.print(number + " ");
        }
    }

    public static int[] findRepeatedEvenNumbers(int[] arr) {
        int[] repeatedNumbers = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        boolean isDuplicate = false;
                        for (int k = 0; k < count; k++) {
                            if (arr[i] == repeatedNumbers[k]) {
                                isDuplicate = true;
                                break;
                            }
                        }
                        if (!isDuplicate) {
                            repeatedNumbers[count++] = arr[i];
                        }
                        break;
                    }
                }
            }
        }

        return Arrays.copyOf(repeatedNumbers, count);
    }
}
