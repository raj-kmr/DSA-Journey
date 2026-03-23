// # Problem: https://namastedev.com/practice/count-negative

public class CountNegative {
    public static void main(String[] args){
        int[] arr = {1, 4, 5, -1, -5, 0};

        if(!arr.getClass().isArray()){
            System.out.println(false);
        }

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(Double.isNaN(arr[i]) || Double.isFinite((arr[i])) ){
                System.out.println(false);
            }
            if(arr[i] < 0){
                count++;
            }
        }

        System.out.println(count);
    }
}

// Time complexity: O(n)
// Space complexity O(1)