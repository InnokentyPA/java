public class task3 {
    public static void main(String[] args) {
        int[] nums = new int[] {3, 2, 2, 3, 5, 4, 6, 3, 1};
        int val = 3;
        int[] result = new int[nums.length];
        int counter = 0;
        int iter = 0;
        for (int elem : nums) {
            if (elem == val) {
                counter++;
            } else {
                result[iter] = elem;
                iter++;
            }
        }
        for (int i = iter; i < iter + counter; i++) {
            result[i] = val;
        }
        for (int i : result) {
            System.out.println(i);
        }
    }
}


// public class Program {
    // public static void main(String[] args) {
    // int[] array = new int[] { 3, 2, 1, 2, 3 };
    // int last = array.length - 1;
    // int value = 3;
    // while (last > 0 && array[last] == value)
    // last--;
    // for (int i = 0; i < last; i++)
    // if (array[i] == value) {
    // for (int j = 0; j < last; j++)
    // array[j] = array[j + 1];
    // array[last] = value;
    // last--;
    // }
    // for (int element : array)
    // System.out.print(String.format("%d ", element));
    // }