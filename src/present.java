public class present {
    public static void main(String[] args) {
        float[] mark = {45.7f,67.8f,58.3f,95.7f,84.1f};
        float num = 45.7f;
        boolean isInArray = false;
        for(float element : mark){
            if (num == element){
                isInArray = true;
                break;
        }
        }if (isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }
    }
}
