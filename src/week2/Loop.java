package week2;
//repeats a block of code with a counter
//Common in counting task
//public class Loop {
//    public static void main(String [] args){
//        for (int i =0; i<5; i++){
//            System.out.println(i);
//        }
//    }
//}

public class Loop  {
    public static void main(String [] args){
        String [] months = new String[]{
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };
//        for (int i = 0; i <months.length; i++){
//            System.out.println(months[i]);
        //FOR REVERSE
        for (int i = months.length-1; i >=0;i++){
            System.out.println(months[i]);
        }
    }
}
