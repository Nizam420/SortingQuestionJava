package SortingQn;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
       int[] arr = {4,3,2,7,8,2,3,1};
       System.out.println(findAllDp(arr));
    }

    static List<Integer> findAllDp(int[] arr) {
        List<Integer> ans = new ArrayList<>();
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
                ans.add(arr[index]);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
