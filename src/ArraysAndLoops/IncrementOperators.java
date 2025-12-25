package ArraysAndLoops;

public class IncrementOperators {
    public static void main(String[] args){
        int i = 300;
        //These all perform the same basic increment (+1)
        //i = i+1;
        //i +=1;

        //Post-increment -> Uses current value, then adds 1 =101
        //i++;

        //Pre-increment -> Adds 1, then uses new value =101
        //++i;


        // Adding a larger value
        //Compound Assignment -> Adds 100 to the current value =200

        i += 100;

        System.out.println(i);

    }
}
