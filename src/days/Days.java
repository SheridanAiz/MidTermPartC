/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;


/**This class takes String input from user 
 * and calls method  to print the 
 * name of the day.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the week day names. 
 *
 * @author sivagamasrinivasan
 jn 22nd
 */

public class Days {

    public static void main(String[] args) {
        Weekdays weekdays = new Weekdays();
        
        // Print all the day names
        weekdays.nameOfDay(Day.ONE);
        weekdays.nameOfDay(Day.TWO);
        weekdays.nameOfDay(Day.THREE);
        weekdays.nameOfDay(Day.FOUR);
        weekdays.nameOfDay(Day.FIVE);
        weekdays.nameOfDay(Day.SIX);
        weekdays.nameOfDay(Day.SEVEN);
    }
}