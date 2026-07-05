
class Sub {
    
       public int Maxsubarray(int arr[], int n) {
        
        int max = Integer.MIN_VALUE; 
        
        for (int i = 0; i < n; i++) {
            int sum = 0; 
            
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                
                               if (max < sum) {
                    max = sum;
                }
            }
        }
        return max;
    }

    public static void main(String args[]) {
        Sub obj = new Sub();
              int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        
        int result = obj.Maxsubarray(arr, n);
        System.out.println("Maximum Subarray Sum is: " + result);
    }
}