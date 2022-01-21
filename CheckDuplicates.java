package SortingQn;

public class CheckDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
       System.out.println(containsDuplicate(arr));
    }
   static boolean containsDuplicate(int[] arr) {
    if (arr.length == 1){
        return false;
    }
        int i = 0;
        
        while (i < arr.length) {
            int correctIn = arr[i] - 1;
            if (arr[i] != arr[correctIn]) {
                swap (arr, i, correctIn);
            }
            
            else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            
            if (arr[index] != index + 1) {
                return true;
                
            }
        }
        return false;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
