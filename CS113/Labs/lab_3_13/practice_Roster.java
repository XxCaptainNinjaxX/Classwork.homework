package CS113.Labs.lab_3_13;

// ***************************************************************
// practice_Roster.java
//
// Define an practice_Roster class with methods to create & fill
// a list of integers.
//
// ***************************************************************
public class practice_Roster {

    int[] list; //values in the list

    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public practice_Roster(int size) {
        list = new int[size];
    }

    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize() {
        for (int i = 0; i < list.length; i++) list[i] = (int) (Math.random() * 100) + 1;
    }

    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print() {
        for (int i = 0; i < list.length; i++) System.out.println(i + ":\t" + list[i]);
    }

    public int findNomOfAs() {
        int numOfAs = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] >= 90) {
                numOfAs++;
            }
        }
        return numOfAs;
    }
}
