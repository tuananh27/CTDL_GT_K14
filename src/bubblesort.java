public class bubblesort {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 8};
        bubblesort(arr);
    }
    static void bubblesort(int[]arr){
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < (n-i); i++){
            for(int j = 1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Mảng đã được sắp xếp");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
