package org.example;

import java.util.Set;

import java.util.*;

public class SetMerger {
    public static Set<Integer> mergeSets(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> mergedSet = new HashSet<>();
        mergedSet.addAll(set1);
        mergedSet.addAll(set2);
        return mergedSet;
    }
}

