

public class test {
    public static void main(String[] args) {
        int arr[] = {5, 10, 15, 20, 25, 30};
        SS(arr);
    }
        public static void SS(int[] arr){
            for(int i = 0; i < arr.length -1; i++){
                int index = i;
                for(int j = i+1; j < arr.length; j++){
                    if(arr[j] < arr[index]){
                        index = j; 
                    }
                }
                int smallerNumber = arr[index];
                arr[index] = arr[i];
                arr[i] = smallerNumber;
            }
            System.out.println("Mảng sắp xếp tăng dần");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    
    
}
