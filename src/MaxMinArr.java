import java.util.Arrays;
public class MaxMinArr {
    public static void main(String[] args) {


        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int targetNumber = 5;

        // Diziyi küçükten büyüğe sıralar
        Arrays.sort(list);

        int smallerClosest = 0;
        int largerClosest = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] < targetNumber) {
                smallerClosest = list[i];
            } else if (list[i] > targetNumber) {
                largerClosest = list[i];
                break; // En yakın büyük sayı bulundu, döngüyü sonlandırır
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + smallerClosest);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + largerClosest);
    }
}