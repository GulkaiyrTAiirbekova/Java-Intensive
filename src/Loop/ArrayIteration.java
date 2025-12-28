package Loop;

public class ArrayIteration {
    public static void main(String[] args){
        int [] array = new int[]{1,3,2,5,9,7,10,8};
        for (int i = 0; i < array.length; i++){
            if (array [i] % 2 == 0 ) {
                System.out.println(array[i]);
            }
        }
    }
}
