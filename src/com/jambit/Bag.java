package com.jambit;

import java.util.HashMap;

public class Bag {

    public static HashMap<String, Integer> tasche = new HashMap<String, Integer>();


    void invAdd(String gegenstand, Integer menge) {
        tasche.put(gegenstand, menge);

    }
}
