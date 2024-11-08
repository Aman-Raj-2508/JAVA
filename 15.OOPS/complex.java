public class complex {

    private int a, b; // private variables

    // constructor 1
    private complex(int i, int j) {
        this.a = i;
        this.b = j;
    }

    // constructor 2
    private complex(int i) {

        this(i, i);
        // int j = i;
        // System.out.println(j);
    }

    // Constructor 3
    private complex() {
        this(0);
    }

    @Override
    public String toString() {
        return this.a + " + " + this.b;
    }

    public static void main(String[] args) {
        complex c1 = new complex(2, 4);
        System.out.println(c1);

        complex c2 = new complex(3); // When this is called then contructor 2 is called and 3 is passed to the
                                     // constructor and
        // inside constructor 2 this(3,3) is called which basically calls the another
        // constructor.Try to constructor 2 without this keyword by using variable j
        System.out.println(c2);

        complex c3 = new complex(); // Here constructor 3 calls constructor 2 and it calls constructor 1
        System.out.println(c3);
    }
}
