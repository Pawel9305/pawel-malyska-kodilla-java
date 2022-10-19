package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer>numbers) {
        List<Integer> oddList = new ArrayList<>();

        for(Integer check : numbers) {
            if (check % 2 == 0) {
                oddList.add(check);
            }
        }
        return oddList;
    }
}
