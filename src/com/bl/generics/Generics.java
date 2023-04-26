package com.bl.generics;

public class Generics<T extends Comparable<T>> {

    T xstr, ystr, zstr;

    public Generics(T xstr, T ystr, T zstr) {
        this.xstr = xstr;
        this.ystr = ystr;
        this.zstr = zstr;
    }

    public T maximum() {

        return Generics.maximum(xstr, ystr, zstr);
    }


    public static <T extends Comparable<T>> T maximum(T xstr, T ystr, T zstr) {
        T max = xstr;
        if (ystr.compareTo(max) > 0) {

            max = ystr;
        }
        if (zstr.compareTo(max) > 0) {
            max = zstr;
        }

        printMax(xstr, ystr, zstr, max);

        return max; // returns the largest object


    }

    private static <T extends Comparable<T>> void printMax(T xstr, T ystr, T zstr, T max) {
        System.out.printf("Max of %s, %s and %s is %s\n", xstr, ystr, zstr, max);
    }


    public static void main(String[] args) {

        String xStr = "pear", yStr = "apple", zStr = "orange";
         new Generics(xStr, yStr, zStr).maximum();

    }

}

