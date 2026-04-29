public class bubbleSorting {

    public static void PrintArray(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        int arr[]={4,6,9,8,3,2,1};

        // outer loop
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        PrintArray(arr);



    }

}
