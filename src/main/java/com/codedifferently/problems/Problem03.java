package com.codedifferently.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem03 {
    /*
        1) use java's sort to sort possibleFamilyMembers
        2) find the index of the number argument in possibleFamilyMembers
        3) create ArrayList of type Integer to be our output array
        4) add number argument to the output arrayList just created
        5) create 2 variables equal to startIndex that will be used as the indexes of the
              comparators for the left and right side of the target number
        6) create variable for the index to the right of the right comparator index
            if start index is >= the length of possibleFamilyMembers - 1, assign rightIndex to
                length of possibleFamilyMembers - 1
        7) create variable for the index to the left of the left comparator index
            if startIndex <= 0, assign leftIndex to 0
        8) create while loop with condition:
                left index >= 0 and right index is < length of possibleFamily members
            9) create 4 variables to keep track of the values in possibleFamilyMembers
                    at the indexes found in step 5, 6, and 7
            10) get current difference between the value of the right comparator found from index in step 5
                    and the value of the index to the right
            11) get current difference between the value of the left comparator found from index in step 5
                    and the value of the index to the left
            12) if right difference from step 10 is equal to 1
                    a) add value to the right of right comparator to output arrayList from step 3
                    b) update right comparator index to be the right index
                    c) increment the right index by 1
            13) if left difference from step 10 is equal to 1
                    a) add value to the left of left comparator to output arrayList from step 3
                    b) update left comparator index to be the left index
                    c) decrement the left index by 1
         14) convert output an arrayList to integer array and then sort the array
         15) return the converted and sorted integer array

    */

    /**
     * You will be given an integer called number and an array called possibleFamilyMembers
     * your jobs is to find the number's family members. A family member is any value that's with in
     * 1 of any other number in the family.
     *
     * So for example if the number = 4, and the possibleFamilyMembers is [1,4,3,5]
     * The actualFamilyMembers would be [3,4,5]
     * 3 is 1 away from 4
     * 4 is equal to 4
     * 4 is 1 away from 5
     * while
     * 1 is not included because the closest releation to 1 is 3 and that's 2 away.
     * @param number
     * @param possibleFamilyMembers
     * @return
     */
    public Integer[] numberFamily(Integer number, Integer[] possibleFamilyMembers){

        Arrays.sort(possibleFamilyMembers);
        List<Integer> family = Arrays.asList(possibleFamilyMembers);
        int startIndex = family.indexOf(number);
        ArrayList<Integer> output = new ArrayList<>();
        output.add(number);
        int leftComparatorIndex = startIndex;
        int rightComparatorIndex = startIndex;
        int leftIndex = startIndex <= 0 ? 0 : leftComparatorIndex - 1;
        int rightIndex = startIndex >= possibleFamilyMembers.length - 1 ?
        return null;
    }
}
