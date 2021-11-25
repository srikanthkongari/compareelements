package com.edyoda.classroom;
import java.util.*;
public class CompareElements {
    public static void main(String[] args)
{
    List<Integer> l = new ArrayList<>();

    // Add elements in the list
    l.add(4);
    l.add(1);
    l.add(8);
    l.add(7);
    l.add(10);

    // Minimum in the list
    int minimum = Collections.min(l);

    // Maximum in the list
    int maximum = Collections.max(l);

    if (minimum == maximum) {
        System.out.println("All elements are equal");
    }
    else {
        System.out.println("Min value of our list : "
                + minimum);
        System.out.println("Max value of our list : "
                + maximum);
    }
}
}
