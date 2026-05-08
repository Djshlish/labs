package LAB_4;

public class Task4 {
    public void invertOddElementsSign(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = -array[i];
            }
        }
    }
}