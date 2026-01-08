package Loop;

public class TheDifferenceBetweenIPluses {
    public static void main(String[] args){
        int i = 10;
        int j = i++;
        System.out.println(i++);//return previous value 10
        System.out.println(j);

        i =10;
        System.out.println(++i); //return value after the change 11
    }
}
