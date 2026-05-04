public class SortedIntList extends IntList {

    public SortedIntList(int size) {
        super(size);
    }

    public void add(int value) {
        if (numElements == list.length) {
            System.out.println("Can't add, list is full");
            return;
        }

        int i = numElements - 1;

        while (i >= 0 && list[i] > value) {
            list[i + 1] = list[i];
            i--;
        }

        list[i + 1] = value;
        numElements++;
    }
}
