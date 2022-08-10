package com.codedifferently.problems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem03 {
    /*
        1) Use Arrays.sort(<array>) to sort possibleFamilyMembers
        2) create a variable called startIndex that holds the index of the number argument in possibleFamilyMembers
        3) create ArrayList of type Integer to be our output array
        4) add number argument to the output arrayList just created
        5) create a variable equal to startIndex called rightCompareIndex
        6) create a variable equal to startIndex called leftCompare Index
        7) create variable called rightIndex
            if startIndex is >= the length of possibleFamilyMembers - 1, assign rightIndex to
                length of possibleFamilyMembers - 1
            otherwise, assign rightIndex to rightCompareIndex + 1
        8) create variable called leftIndex
            if startIndex <= 0, assign leftIndex to 0
            otherwise, assign leftIndex to leftCompareIndex - 1
        9) create while loop with condition: leftIndex >= 0 and rightIndex is < length of possibleFamilyMembers

            10) Create 4 variables that represent values at 4 found indexes:
                    1) valueRight that equals the value at index rightIndex in possibleFamilyMembers
                    2) valueRightCompare that equals the value at index rightCompareIndex in possibleFamilyMembers
                    3) valueLeft that equals the value at index leftIndex in possibleFamilyMembers
                    4) valueLeftCompare that equals the value at index leftCompareIndex in possibleFamilyMembers
            11) Assign absolute difference between valueRight and valueRightCompare to a variable called rightDifference
            12) Assign absolute difference between valueLeft and valueLeftCompare to a variable called leftDifference
            13) if rightDifference from step 11 is equal to 1
                    a) add valueRight to output arrayList from step 3
                    b) Update rightCompareIndex by assigning rightIndex to it
                    c) Increment rightIndex by 1
            14) if leftDifference from step 12 is equal to 1
                    a) add valueLeft to output arrayList from step 3
                    b) Update leftCompareIndex by assigning leftIndex to it
                    c) Decrement leftIndex by 1

         15) Convert output arrayList to integer array and then sort the array
         16) return the converted and sorted integer array

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
        int rightCompareIndex = startIndex;
        int leftCompareIndex = startIndex;
        int rightIndex = startIndex >= possibleFamilyMembers.length - 1 ? possibleFamilyMembers.length - 1 : rightCompareIndex + 1;
        int leftIndex = startIndex <= 0 ? 0 : leftCompareIndex - 1;
        while (leftIndex >= 0 && rightIndex < possibleFamilyMembers.length) {
            int valueRight = family.get(rightIndex);
            int valueRightCompare = family.get(rightCompareIndex);
            int valueLeft = family.get(leftIndex);
            int valueLeftCompare = family.get(leftCompareIndex);
            int rightDifference = Math.abs(valueRight - valueRightCompare);
            int leftDifference = Math.abs(valueLeft - valueLeftCompare);
            if (rightDifference == 1) {
                output.add(valueRight);
                rightCompareIndex = rightIndex;
                rightIndex++;
            }
            if (leftDifference == 1) {
                output.add(valueLeft);
                leftCompareIndex = leftIndex;
                leftIndex--;
            }
        }
        Integer[] outputArray = output.toArray(new Integer[0]);
        Arrays.sort(outputArray);
        return outputArray;
    }
}
