package LAB_5;

public class HelperUtils {
    public int getMin(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        System.out.println("Найменше серед (" + a + ", " + b + ", " + c + "): " + min);
        return min;
    }

    public void displayArray(int[] arr) {
        System.out.print("Елементи масиву: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
}