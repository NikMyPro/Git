package com.array;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    
    public static void main(String[] args) {
        String[] cars = {"A", "B", "C", "D"};
        List<String> carList = Arrays.asList(cars);
 
        for (String car : carList) {
            System.out.println(car);
        }
    }
}