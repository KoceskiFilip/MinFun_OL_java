

class Min {
    int min;

    void minFun(int n1, int n2) { // method - min of two numbers
        min = n1; // assumed minimum
        if (min > n2)
            min = n2;
        System.out.println("Of the numbers " + n1 + " and " + n2 + ", the smaller one is " + min);
    }

    void minFun(int n1, int n2, int n3) { // method - min of three numbers
        min = n1; // assumed minimum
        if (min > n2)
            min = n2;
        if (min > n3)
            min = n3;
        System.out.println("Of the numbers " + n1 + ", " + n2 + ", " + n3 + ", the smallest one is " + min);
    }

    public static void main(String[] args) {
        Min smallest = new Min(); // create object
        smallest.minFun(11, 6); // calling the method - min of two numbers
        smallest.minFun(6, 3, 4); // calling the method - min of three numbers
    }
}
