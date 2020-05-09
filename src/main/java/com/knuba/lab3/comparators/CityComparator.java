package com.knuba.lab3.comparators;

import com.knuba.lab3.Hotel;

import java.util.Comparator;

public class CityComparator implements Comparator<Hotel> {
    public int compare(Hotel o1, Hotel o2) {
        return o1.getCity().compareTo(o2.getCity());
    }
}
