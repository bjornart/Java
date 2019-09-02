package com.javanano.exercises;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.junit.Assert;
import java.util.Arrays;


public class TopKLargest {

    public int[] topKLarger(int[] arr, int k){
        public static List<Integer> topKLarger(int[] arr, int k) {

            TreeSet<Integer> treeSet = new TreeSet<>();

            for (int num :  arr) {

                treeSet.add(num);

                if (treeSet.size() > k) {

                    treeSet.pollFirst();

                }

            }

            return treeSet.stream().collect(Collectors.toList());

        }

    }

    public static void main(String[] args) {
        @org.junit.Test

        public void topKLargerTest1() {

            Assert.assertEquals(TopKLargest.

                            topKLarger(new int[] {-1, 15, 59, 22, 6, 42, 45, 0}, 4),

                    Arrays.asList(22, 42, 45, 59));

    }

}
