// ***************************************************************
// ListTest.java
//
// A simple test program that creates an IntList, puts some
// ints in it, and prints the list.
//
// ***************************************************************
public class ListTest {

    public static void main(String[] args) {
        IntList myList = new IntList(10);
        myList.add(100);
        myList.add(50);
        myList.add(200);
        myList.add(25);
        System.out.println(myList);

        System.out.println("-----------------------");

        SortedIntList yourlist = new SortedIntList(10);
        yourlist.add(100);
        yourlist.add(50);
        yourlist.add(200);
        yourlist.add(25);
        System.out.println("Sorted list:");
        System.out.println(yourlist);
    }
}
