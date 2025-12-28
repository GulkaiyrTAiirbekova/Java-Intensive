package Loop;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;


public class IterateMonths {
    public static void main(String [] args){
        Month [] months = Month.values();

        for (Month month : months){

           //To get the full name of the month("January"), abbreviated ("Jan"), etc.
           String fullName = month.getDisplayName(TextStyle.FULL,Locale.ENGLISH);
           int monthValue = month.getValue();//1 for January and etc
            int dayInMonth = month.maxLength();//Max possible days(29 for Feb)


            System.out.println(fullName + " is month " + monthValue +
                    " and has up to " + dayInMonth + " days");
        }
        for (int i = 0; i < months.length; i+=2 ){
            System.out.println("Index" + i + " , Month: " + months[i]);
        }
    }
}
