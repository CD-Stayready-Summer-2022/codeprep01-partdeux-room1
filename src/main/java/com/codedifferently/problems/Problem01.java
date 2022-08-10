package com.codedifferently.problems;

import java.util.HashMap;
import java.util.Map;

public class Problem01 {
    /**
     *
     * @param input the string to be searched
     * @param letter the letter that you will search for
     * @return
     */
    /*
        1) Create HashMap with key/value pairs key: Character, value: Integer
        2) Call toLowerCase both arguments
        3) Create for loop from 0 to input length - 1
        4)  create variable of type Character for each loop equal to current character of string using charAt(i)
        5)  get current count of current char in hashmap by calling getOrDefault on map and passing the current char
                and 0 as the default value
        6)  increment value of current char by calling 'put' on the map and passing the current char and ++count
        7) return the value returned by calling 'get' on the map and passing the first character of letter by calling charAt(0)

     */
    public Integer countDuplicateLetters(String input, String letter){
        Map<Character, Integer> map = new HashMap<>();
        input = input.toLowerCase();
        letter = letter.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            Character current = input.charAt(i);
            int currentCount = map.getOrDefault(current, 0);
            map.put(current, ++currentCount);
        }
        return map.get(letter.charAt(0));
    }
}
