import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int arr[] = generateRandomArray();
        //task 1
        float sumArr = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArr = sumArr + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumArr + " рублей");
        //task 2
        int minArr = arr[0];
        int maxArr = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minArr){
                minArr = arr[i];
            }
            if(arr[i] > maxArr){
                maxArr = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minArr + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxArr + " рублей");
        //task 3
        float averageSpending = sumArr / arr.length;
        System.out.println("Средняя сумма трат за месяц составила "  + averageSpending + " рублей");
        //task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    int[] arr = generateRandomArray();
    public  static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}