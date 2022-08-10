package com.codedifferently.problems;

import java.util.ArrayList;

public class Problem02 {
    /*
       1) Assign the index of target name in cousin to a variable
       2) Get regular distance by finding absolute value of the difference between index of target name and start index
       3) Get circular comparing index by subtracting the size of cousins from startIndex
       4) Get circular distance by finding the absolute difference of target index and circular index found in previous step
       5) return the minimum of the regular distance and circular distance
     */
    public static Integer cousinTag(ArrayList<String> cousins, Integer startIndex, String targetName){
        int targetNameIndex = cousins.indexOf(targetName);
        int regularDistance = Math.abs(startIndex - targetNameIndex);
        int circularComparingIndex = startIndex - cousins.size();
        int circularDistance = Math.abs(circularComparingIndex - targetNameIndex);
        return Math.min(regularDistance, circularDistance);
    }
}
