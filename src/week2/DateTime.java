//package week2;
//
//import java.time.DayOfWeek;
//import java.time.LocalDate;
//import java.util.Scanner;
//
//public class DateTime {
//    private int year;
//    private int month;
//    private int day;
//
//    public void getDay(){
//        try{
//            Scanner.scanner = new Scanner(System.in);
//            System.out.print("Enter date(yyyy-mm-dd): ");
//            String inout = scanner.nextLine();
//            LocalDate date = LocalDate.parse(input);
//
//            year = date.getYear();
//            month = date.getMonth();
//            day = date.getDayOfMonth();


//            DayOfWeek dayOfWeek = date.getDayOfWeek();
//            System.out.println ("Year" + year);
//            System.out.println("Month"+ month);
//            System.out.println("Day" + day);
//            System.out.println("Day of the week:" + dayOfWeek);
//        } catch (Exception e) {
//            System.out.println("! Invalid format ! Use yyyy-mm-dd");
//        }
//    }
//}
