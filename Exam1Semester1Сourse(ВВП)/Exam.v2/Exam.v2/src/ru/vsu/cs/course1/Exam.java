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

    private static boolean indexOf(int indexString, int num, int[][] arrs){
        for(int i = 0; i < arrs.length; i++){
            if(i == indexString) continue;
            for (int j = 0; j < arrs[i].length; j++){
                if(arrs[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean isUnique(int indexString, int[][] arrs){
        for(int i = 0; i < arrs[indexString].length; i++) {
            if(!indexOf(indexString, arrs[indexString][i], arrs)){
                return false;
            }
        }
        return true;
    }
    public static int task6(int[][] arr) {
        for(int i = 0; i < arr.length; i++){
            if(isUnique(i, arr)){
                return i;
            }
        }
        return -1;
    }

    public static void task7(int[][] arr) {
        return;
    }
    public static void task8(int[][] arr) {
        int counter = 0;
        int counterCount = 0;
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if((arr.length - 1 -i)%2 != 0) {
                    arr[arr.length - 1 - i][j] = counter;
                    counterCount++;
                    if (counterCount >= 2) {
                        counterCount = 0;
                        counter++;
                    }
                }
                else {
                    arr[arr.length - 1 - i][arr[i].length-1-j] = counter;
                    counterCount++;
                    if (counterCount >= 2) {
                        counterCount = 0;
                        counter++;
                    }
                }
            }
        }
        return;
    }
    public static List<Integer> task9(List<Integer> list) {
        List<Integer> resultList = new ArrayList<>();
        int dataValue = 0;
        boolean isStart = false;
        for(int value : list){
            if(isStart){
                if(value > 0 && dataValue > 0){
                    resultList.add(value+dataValue);
                }
            }
            else{
                isStart = true;
            }
            dataValue = value;
        }
        return resultList;
    }
}
