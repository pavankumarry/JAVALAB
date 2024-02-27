// c.	To sort the elements in ascending and descending order using bubble sort algorithm.

public class lab1c {
    public static void main(String[] args) {
        int[] array = { 5, 3, 1, 4, 2 };
        int n = array.length;
        System.out.println("the array is ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        // ascending order
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }

        System.out.println("\nAscending order ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        // descending order
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }

        System.out.println("\nDescending order");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}