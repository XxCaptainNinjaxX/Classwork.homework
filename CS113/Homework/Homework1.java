package CS113.Homework;

import java.util.Scanner;

// next() -  until whitespace (tab, space, etc)
// nextLine - string 
// nextInt - int
// next Double 

public class Homework1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//---------------------------------------------------------------------------------------------------
        // part uno
        System.out.println();
        System.out.println("Part one");
//---------------------------------------------------------------------------------------------------
  
        double fahrenheit = 36.5;
        double celsius = 0;

        celsius = (fahrenheit-32)*5/9;

        System.out.println("The tempeture in fahrenheit is: "
        +fahrenheit+", and the tempeture in Celsius is: "+celsius);

//---------------------------------------------------------------------------------------------------
        // part 2
        System.out.println();
        System.out.println("Part dos");
//---------------------------------------------------------------------------------------------------
        
        System.out.println("Enter total amount of seconds: ");
        int secs= scan.nextInt();

        int aws=secs;
        short hours = 0;
        short mins = 0 ;

        while (secs >= 60) {
            mins++;
            secs -= 60; 

            if (mins >= 60) {
                hours++;
                mins -= 60;

        }}
        
        String hourAws = "Hour"; String minAws = "Minute"; String secAws = "Second";
        
        // correct grammer / plural shtuff
        if(hours>1) hourAws="Hours";
        if(mins>1) minAws="Minutes";
        if(secs>1) secAws="Seconds";

        System.out.println(
            "There are " 
            + hours + " " + hourAws + ", " 
            + mins + " " + minAws + ", and " 
            + secs + " " + secAws + " in " + aws + " seconds.");

        scan.close();

    }}
