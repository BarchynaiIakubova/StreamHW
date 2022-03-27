package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Integer[] array = new Integer[10];
    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(10);
        System.out.println(array[i]);
    }
    Optional maxVal = Arrays.stream(array).filter(x -> x % 2 == 0).map(x -> x * x).max(Integer::compare);
        System.out.println("Max value square of max even number is = " + maxVal.get());
    }
}
