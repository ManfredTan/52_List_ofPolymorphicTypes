/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings.
 */

public class List_inArraySlots {

    private int filledElements; // the number of elements in this list

    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
                                     1 means element i is a double;
                                     2 means element i is a String.
        Optional extra education in programming (not comp sci):
            replace these "magic numbers" with an "enumerated type".
     */
    private Object[] typeOfElements;

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        typeOfElements = new Object[INITIAL_CAPACITY];
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
        return filledElements;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
        String polymorphicList = "[";
        for (int index = 0; index < typeOfElements.length; index++)
            polymorphicList += typeOfElements[index] + ",";
        return (polymorphicList + "]");
    }


    /**
      Appends @value to the end of this list.
      @return true, in keeping with conventions yet to be discussed
      type identifier for each element
         That is, typeOfElements[i] == 0 means element i is an integer;
                                       1 means element i is a double;
                                       2 means element i is a String.
     */
     public boolean add( int type   // same meaning as in typeOfElements
                       , int    intValue
                       , double doubleValue
                       , String stringValue
                       , Boolean booleanValue
                       ) {
        if (filledElements == typeOfElements.length ) expand();
        // add integer
        if (type == 0) typeOfElements[filledElements] = new Integer(intValue);
        // add double
        if (type == 1) typeOfElements[filledElements] = new Double(doubleValue);
        //add String
        if (type == 2) typeOfElements[filledElements] = new String(stringValue);
        //add boolean
        if (type == 3) typeOfElements[filledElements] = new Boolean(booleanValue);

        filledElements++;
        return true;
     }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
     private void expand() {

           /* S.O.P. rules for debugging:
              Working methods should be silent. But during
              development, the programmer must verify that
              this method is called when that is appropriate.
              So test using the println(), then comment it out.
              */
    }

    // public Object get(int index) {
    // }

}
