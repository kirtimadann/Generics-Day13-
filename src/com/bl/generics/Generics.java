package com.bl.generics;

public class Generics<T extends Comparable<T>> {

    T xf, yf, zf;

    public Generics(T xf, T yf, T zf) {
        this.xf = xf;
        this.yf = yf;
        this.zf = zf;

    }

    public T maximum() {

        return Generics.maximum(xf, yf, zf);
    }


    public static <T extends Comparable<T>> T maximum(T xf, T yf, T zf) {
        T max = xf;
        if (yf.compareTo(max) > 0) {

            max = yf;
        }
        if (zf.compareTo(max) > 0) {
            max = zf;
        }

        printMax(xf, yf, zf, max);

        return max; // returns the largest object


    }

    private static <T extends Comparable<T>> void printMax(T xf, T yf, T zf, T max) {
        System.out.printf("Max of %s, %s and %s is %s\n", xf, yf, zf, max);
    }


    public static void main(String[] args) {

        Float xfFloat = 6.6f, yfFloat = 8.8f, zfFloat = 7.7f;
        new Generics<>(xfFloat, yfFloat, zfFloat).maximum();

    }

}

