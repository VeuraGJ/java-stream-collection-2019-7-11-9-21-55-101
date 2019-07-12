package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        int min = Math.min(left, right);
        int max = Math.max(left, right);
            return IntStream.rangeClosed(min, max)
                    .map(number -> (min == left) ?  number : left - number +1 )
                    .boxed().collect(Collectors.toList());
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        int min = Math.min(left, right);
        int max = Math.max(left, right);
        if(min == left) {
            return IntStream.rangeClosed(min, max)
                    .filter(number -> number % 2 == 0)
                    .boxed()
                    .sorted()
                    .collect(Collectors.toList());
        }
        else{
            return IntStream.rangeClosed(min, max)
                    .filter(number -> number % 2 == 0)
                    .boxed()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
            }
    }

    public List<Integer> popEvenElments(int[] array) {
        return Arrays.stream(array)
                .filter(number -> number % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {

        return Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList())
                .get(array.length-1);
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
