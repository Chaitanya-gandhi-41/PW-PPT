class movezeroes{
 

    public static void main(String[] args){
        int arr[] = {0,1,0,3,12,0,3,8,9,10,11,0};
        int j=0;
        int count=0;
        for( int i=0;i<arr.length;i++){
            
             if(arr[i]!=0){
                arr[j]= arr[i];
                j++;
             }
             else{
                count++;
             }
            //  System.out.println("This is count"+ count);
                
        }
        for(int k=1;k<=count;k++){
            arr[arr.length-k]=0;
          
        }
        for(int m=0;m<arr.length;m++){
            System.out.println(arr[m]);
        }
     
        

        }

    
    }






// question ->
// Move Zeroes
// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

// Example 1:
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

// Example 2:
// Input: nums = [0]
// Output: [0]

// Constraints:
// a. 1 <= nums.length <= 10^4
// b. -2^31 <= nums[i] <= 2^31 - 1
