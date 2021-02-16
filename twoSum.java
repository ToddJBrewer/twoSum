import java.util.Arrays;

public class twoSum {

    //original brute force solution to match sum of two elements to target
    public int [] twoSumBruteForce(int []sum, int target) {
        sort(sum);
        for (int i = 0; i<sum.length; i++) {
            int numOne = sum[i];
            for (int j = i + 1; j < sum.length; j++) {
                int numTwo = sum[j];
                if (numOne + numTwo == target) {
                    int targetMatch[] = {i, j};
                    return targetMatch;
                }

            }
        }
        return new int[]{-1};
    }

    //better solution in regards to run time I worked out to match sum of two elements to target
    //note that it returns the positions of the two sums from the sorted array, not the original
    public int [] twoSum(int []sum, int target) {
        sort(sum);
        int head = 0;
        int tail = sum.length-1;
        while (head < tail) {
            int total = sum[head] + sum[tail];
            int targetMatch[] = {head, tail};
            if (total == target) {
                return targetMatch;
            }
            else if (total < target) {
                head++;
            }
            else {
                tail--;
            }
        }
        return new int[]{-1};
    }


    //function to sort the array numerically from smallest to largest number
    public int[] sort(int [] sum) {
        for (int i = 0; i <sum.length-1; i++) {
            for (int j = 0; j<sum.length-1; j++) {
                if (sum[j] > sum[j+1])
                swap(sum, j, j+1);
            }
        }
    return sum;
    }

    //bubble sort swap function
    public void swap(int[] sum, int i, int j) {
        int temp = sum[i];
        sum[i] = sum[j];
        sum[j] = temp;
    }
    //testing functions
    public static void main(String[] args) {
        twoSum sum = new twoSum();
        int[] sum1 = {2, 12, 8, 7};
        int target1 = 9;
        int[] sum2 = {1, 13, 18, 20, 30};
        int target2 = 40;
        System.out.println(Arrays.toString(sum.twoSum(sum1, target1)));
        System.out.println(Arrays.toString(sum1));
        System.out.println(Arrays.toString(sum.twoSum(sum2, target2)));
        System.out.println(Arrays.toString(sum2));
        }

    }

