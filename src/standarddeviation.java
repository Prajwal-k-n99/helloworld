 class calculateSD2 {
    double sum = 0;
    double sd = 0;
    double mean = 0;
    double res = 0;
    double sq = 0;

    double SD()
    {
        int [] arr = {12,32,54,68,10};
        int n = arr.length;
        System.out.println("Elements are:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        for(int i =0;i<n;i++){
            sum = sum + arr[i];
        }
        mean = sum/(n);
        for (int i=0;i<n;i++){
            sd = sd + Math.pow((arr[i]-mean),2);
        }
        sq = sd/n;
        res = Math.sqrt(sq);
        return res;
    }
}
  class Standard {
    public static void main(String[] args) {
        calculateSD2 calsd = new calculateSD2();
        double res = calsd.SD();
        System.out.format("standard Deviation = %.6f", res);
     }
 }
