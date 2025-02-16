package ru.vsu.cs.course1;

import java.util.*;

/**
 * Класс для реализации задач
 */
public class Exam {

    public static void task1(int n) {
    	return;
    }

    public static void task2(int n) {
        return;
    }

    public static void task3(int h) {
        return;
    }

    public static void task4(int h, int w) {

        return;
    }

    public static int task5(int[] arr) {
        return -1;
    }

    public static int task6(int[][] arr) {
        return -1;
    }

    public static void task7(int[][] arr) {
        return;
    }
    public static void task8(int[][] arr) {
        return;
    }
    public static List<Integer> task9(List<Integer> list) {
    	boolean previousElementIsPositive = true;
    	boolean currentElementIsPositive = true;
    	List<Integer> resultList = new ArrayList<Integer>();
    	for(int num : list) {
    		if(num < 0 && currentElementIsPositive) {
    			currentElementIsPositive = false;
    		} else if(num < 0 && previousElementIsPositive) {
    			previousElementIsPositive = false;
    		} else if(!currentElementIsPositive && !previousElementIsPositive) {
    			resultList.add(num);
    		}
    		if(num >= 0) {
    			previousElementIsPositive = true;
    	    	currentElementIsPositive = true;
    		}
    		resultList.add(num);
    	}
    	return resultList;
    }
}
