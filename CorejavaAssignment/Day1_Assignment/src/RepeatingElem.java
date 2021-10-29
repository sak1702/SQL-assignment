
public class RepeatingElem{
	static int maxRepeating(int arr[], int n, int k)
    {
        // Iterate though input array, for every element
        
        for (int i = 0; i< n; i++)
            arr[(arr[i]%k)] += k;
 
        // Find index of the maximum repeating element
        int max = arr[0], result = 0;
        for (int i = 1; i < n; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                result = i;
            }
        }
 
   
 
        // Return index of the maximum element
        return result;
    }
 
    /*Main function to check for above function*/
    public static void main (String[] args)
    {
 
        int arr[] = {2, 3, 3, 5, 3, 4, 1, 7};
        int n = arr.length;
        int k=8;
        System.out.println("Maximum repeating element is: " +
                           maxRepeating(arr,n,k));
    }


}
