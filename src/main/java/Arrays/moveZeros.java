public class moveZeros {

    public static void main(String[] args) {

        int[] arr = { 1, 0, 3, 12, 0, 8, 0, 7};
        System.out.println("Original Array:");
        displayArray(arr);

        moveZerosToLast(arr);

        System.out.println("\nArray after moving zeros to the end:");
        displayArray(arr);
    }
    private static void moveZerosToLast(int[] nums) {
        int nonZeroIndex = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[nonZeroIndex] = num;
                nonZeroIndex++;
            }
        }

        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
    private static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}