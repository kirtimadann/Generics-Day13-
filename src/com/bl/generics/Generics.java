package com.bl.generics;

public class Generics<T> {

    T x;

    T y;

    T z;

    public static void main(String[] args) {

        Generics<Integer> obj1 = new Generics();
        obj1.x = 30;
        obj1.y = 12;
        obj1.z = 6;

        System.out.println(obj1.x.compareTo(obj1.y));
        System.out.println(obj1.x.compareTo(obj1.z));
        System.out.println(obj1.y.compareTo(obj1.z));


      int max1 =  Math.max(obj1.x, obj1.y);
        System.out.println(max1);

        int max2 =  Math.max(obj1.x, obj1.z);
        System.out.println(max2);

        int max3 =  Math.max(obj1.y, obj1.z);
        System.out.println(max3);




    }

}