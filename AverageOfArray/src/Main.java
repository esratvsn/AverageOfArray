public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int n = numbers.length;
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum += 1.0 / numbers[i];
        }

        double harmonicMean = n / sum;
        System.out.println("Harmonik Ortalama: " + harmonicMean);
    }
}