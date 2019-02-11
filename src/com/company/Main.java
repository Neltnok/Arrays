
// Create an array that lists type of supplies for a simple hot dog stand,
// ice cream shop, coffee shop or something similar.
// Use a for loop to print the contents of the array on the screen.
// You will use this as the start of the next program.
// You need at least 5 items in your array.


// pseudo code in source
// declare an array of string variables of size 5
// populate the array with the supplies
// print the contents to the screen

package com.company;

public class Main {



    public static void main(String[] args) {

        // declare the array of type String with a size of 5
        String []   supplies = new String[5];


        // populate the supplies array

        supplies[0] = "Hot Dogs";
        supplies[1] = "Hamburger";
        supplies[2] = "French Fries";
        supplies[3] = "Ketchup";
        supplies[4] = "Mustard";


        // loop to print the contents of the supplies array to the screen

        for(int i = 0; i < 5; i++){
            // print out the items from the supplies array
            System.out.println("supplies [" + i + "] = "+ supplies[i]);
        }
	// write your code here
    }
}
