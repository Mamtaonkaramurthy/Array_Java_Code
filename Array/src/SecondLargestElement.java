public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15}; // Example array
        
        int secondLargest = findSecondLargest(arr);
        
        System.out.println("Second largest element in the array: " + secondLargest);
    }
    
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        
        return secondLargest;
    }
}
