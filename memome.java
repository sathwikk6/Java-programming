import java.util.*;
public class memome
{
    public static void main(String[] args) 
    {
        int[] arr = {16, 18, 27, 16, 23, 21, 19};
        printStats(arr);
        int[] arr2 = {26, 28, 37, 26, 33, 31, 29};
        printStats(arr2);
    }
    public static void printStats(int[] arr) 
    {
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Mean = " + calculateMean(arr));
        System.out.println("Median = " + calculateMedian(arr));
        System.out.println("Mode = " + calculateMode(arr));
        System.out.println();
    }
    public static double calculateMean(int[] arr) 
    {
        int sum = 0;
        for (int num : arr) 
        {
            sum += num;
        }
        return (double) sum / arr.length;
    }
    public static double calculateMedian(int[] arr) 
    {
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 0) 
        {
            return (double) (arr[n / 2 - 1] + arr[n / 2]) / 2;
        } else 
        {
            return arr[n / 2];
        }
    }
    public static int calculateMode(int[] arr) 
    {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int mode = Integer.MIN_VALUE;
        for (int num : arr) 
        {
            int frequency = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, frequency);
            if (frequency > maxFrequency) 
            {
                maxFrequency = frequency;
                mode = num;
            }
        }
        return mode;
    }
}