package ru.samsung.itschool.mdev;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    int[] x = new int[10];
        String str = "word1 word2";
        // Regular expression
        String[] strs = str.split(" ");

        // Collections
        // Lists - списки
        // Сlasses: ArrayList, LinkedList, Queue, Stack
        // Sets - множества
        // Classes: TreeSet, HashSet
        // Maps - словари (ключ => значения)
        // Classes: TreeMap, HashMap, Hashtable


        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for(Integer i: arrayList) {

        }

        // Wrapper classes
        Integer a = 100;  // Integer a = new Integer(100); auto-boxing;
        int b = a;

        long startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Arraylist add to the end:  " + (endTime-startTime));

        startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList add to the end: " + (endTime-startTime));


        startTime = System.nanoTime();
        for(int i=30000;i<70000;i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Arraylist get():  " + (endTime-startTime));

        startTime = System.nanoTime();
        for(int i=30000;i<70000;i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList get(): " + (endTime-startTime));

        startTime = System.nanoTime();
        for(int i=0;i<50000;i++) {
            arrayList.add(0,i);
        }
        endTime = System.nanoTime();
        System.out.println("Arraylist add(0):  " + (endTime-startTime));

        startTime = System.nanoTime();
        for(int i=0;i<50000;i++) {
            linkedList.add(0,i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList add(0): " + (endTime-startTime));

        Stack stack = new Stack();
        // Last In First Out (LIFO)

        Queue queue = new ArrayDeque();
        // First In First Out (FIFO)
        String[] f = {"1","2","3","4","5"};
        for(int i=0;i<f.length;i++) {
            stack.push(f[i]);
            queue.offer(f[i]);
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); // removes from the top & return value
        }
        System.out.println();
        while(!queue.isEmpty()) {
            System.out.print(queue.poll() + " "); // remove from the begining & return value
        }

        String[] arrays_names = {"Ivan","Ivap","Alex","Olga","Maria","Dmitry"};

        if(!"dfgasdfg".equals("asdasd")) {

        }

        System.out.println(arrays_names[0].compareTo(arrays_names[1]));
        // 0 - ничего не меняем
        // Ivan - Ivap < 0 - ничего не меняем
        // Ivan - Ivak > 0 - меняем местами
        selectionSort(arrays_names);


    }



    static void selectionSort(String[] arr) {
        int i, j;
        int min;
        String temp, minStr;

        for (i = 0; i < arr.length-1; i++) {
            min = i;
            minStr = arr[i];
            for (j = i+1; j < arr.length; j++) {
                if (arr[j].compareTo(minStr)<0) {
                    min = j;
                    minStr = arr[j];
                }
            }
            // swap
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
