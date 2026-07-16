public class LargestSmallest
{
    public static void main(String[] args) {
        int[] numbers = {1001, 1002, 1003, 1004, 1909, 230};
        int largest = findLargest(numbers);
        int smallest = findSmallest(numbers);

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }

    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findSmallest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}