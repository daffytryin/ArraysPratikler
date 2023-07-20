public class HarmonicOrtalama {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int n = numbers.length;
        double harmonicSeriesSum = 0;

        for (int i = 0; i < n; i++) {
            harmonicSeriesSum += 1.0 / numbers[i];
        }

        double harmonicMean = n / harmonicSeriesSum;

        System.out.println("Harmonik Ortalama: " + harmonicMean);
    }
}
