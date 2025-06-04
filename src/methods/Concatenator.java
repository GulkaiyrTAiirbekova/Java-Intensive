package methods;

public class Concatenator {
    public static  String concatenateStringAndInt(String text, int number){
        return text + number;
    }
    public static void main (String [] args){
        String result = concatenateStringAndInt("Age ", 44);
        System.out.println(result);
    }
}
