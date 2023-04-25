package com.bl.generics;

public class Generics<T extends Comparable<T>> {

    T x, y, z;

    public Generics(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public T maximum() {

        return Generics.maximum(x, y, z);
    }


    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {

            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }

        printMax(x, y, z, max);

        return max; // returns the largest object


    }

    private static <T extends Comparable<T>> void printMax(T x, T y, T z, T max) {
        System.out.printf("Max of %s, %s and %s is %s\n", x, y, z, max);
    }


    public static void main(String[] args) {

        Integer xInt = 13, yInt = 24, zInt = 55;
        new Generics<>(xInt, yInt, zInt).maximum();
    }

}

