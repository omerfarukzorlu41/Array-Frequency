import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("number of repetitions:");
        Arrays.sort(array);

        int counter = 1;

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                for (int j = 0; j < array.length; j++) {
                    if ((i != j) && (array[i] == array[j])) {
                        counter++;
                    }
                }
                System.out.println(array[i] + " number " + counter + " repeated times.");
            } else if (array[i] != array[i - 1]) {
                for (int j = 0; j < array.length; j++) {
                    if ((i != j) && (array[i] == array[j])) {
                        counter++;
                    }
                }
                System.out.println(array[i] + " number " + counter + " repeated times.");
            }
            counter = 1;
        }
    }
}
