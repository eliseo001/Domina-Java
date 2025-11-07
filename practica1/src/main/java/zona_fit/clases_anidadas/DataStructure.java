package zona_fit.clases_anidadas;

public class DataStructure {

    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEvent(){

        //print out values of event indices of the array
        DataStructureIterator iterator = this.new EventIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }
    interface DataStructureIterator extends java.util.Iterator<Integer> { }

    private class EventIterator implements DataStructureIterator {

        //start steppin trhough the array from the beginning
        private int nextIndex = 0;

        public boolean hasNext() {

            //check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {

            //record a values of an event index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

            //Get the next even element
            nextIndex +=2;
            return retValue;
        }
    }

    public static void main(String[] args) {
        DataStructure ds = new DataStructure();
        ds.printEvent();
    }
}
