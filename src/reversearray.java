public class reversearray {
    public static void main(String[] args) {
        int[] arr = {1,21,45,67,84,9,37};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for (int i=0;i<n;i++){
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for (int element : arr){
            System.out.println(element+" ");
        }
    }
}
