package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetIntersectionChecker {
    public boolean isIntersecting(Set<Integer> set1, Set<Integer> set2) {
        boolean bo = false;
        for (Integer element : set1) {
            if (set2.contains(element)) {
                bo = true;
            }
        }
        return bo;
    }
}
