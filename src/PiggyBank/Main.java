package piggybank;

import java.util.*;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[], args) {
    // copy pasted from ReadMe:
    DecimalFormat fp = new DecimalFormat("$###,###.00");
    double sum = 0;

    ArrayList<AbstractMoney> myPiggy = new ArrayList<>();

    //quantities pulled from ReadMe:
    myPiggy.add(new Quarter());
    myPiggy.add(new Dime());
    myPiggy.add(new DollarBill(5));
    myPiggy.add(new Nickel(3));
    myPiggy.add(new Dime(7));
    myPiggy.add(new DollarBill());
    myPiggy.add(new Pennies(10));

    // counts the elements in the container
    for (int i = 0; i < myPiggy.size(); i++)
    System.out.println(myPiggy.get(i).toString());

    //adds up the sum of the elements
    for (int i = 0; i < myPiggy.size(); i++)
    sum += myPiggy.get(i).getSum();

    //print a blank line
    System.out.println();

    System.out.println("The piggy bank holds " + fp.format(sum));
}
}