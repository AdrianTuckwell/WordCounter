package com.codeclan.example.wordcounter;

/**
 * Created by user on 08/11/2016.
 */

public class Counter implements Countable {

    public Integer getCount(String phrase) {
        return phrase.split("\\s+").length;
    }

}
