import javax.imageio.stream.ImageInputStream;

class BubleSort {
    void bubleSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++)
            for( int j=0;j<n-i-1;j++)
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            for (int i=0;i<n;i++){
                System.out.println(arr[i]+" ");
                System.out.println();
        }
             class bs{
                 public static void main(String[] args) {
                     BubleSort ob = new BubleSort();
                     int arr[] = {64,34,25,12,22,11,90};
                     ob.bubleSort(arr);
                     System.out.println("Sorted array");

                 }
            }


        }

    }

