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
