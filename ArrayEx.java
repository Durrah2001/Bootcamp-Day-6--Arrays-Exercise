package org.example;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayEx {

    public static void main(String[] args) {
//
//        1.Write a Java program to test if the first and the last element of an array of
//        integers are same. The length of the array must be greater than or equal to
//        2


        int [] numbers = {50, -20, 0, 30, 40, 60, 10};

           if(numbers[0] == numbers[numbers.length -1]){

               System.out.println("true");
           }else{
               System.out.println("false");
           }

        System.out.println("------------------------------------");

//        2.Write a Java program to find the numbers greater than the average of the
//        numbers of a given array.

        int[] arrNumbers1 = {1, 4, 17, 7, 25, 3, 100};

        int total = 0;

        for (int a : arrNumbers1) {
            total += a;
        }

        double arrAvg = total / arrNumbers1.length;
        System.out.println("The average of the array is: " + arrAvg);

        ArrayList<Integer> temArr = new ArrayList<>();

        for (int g : arrNumbers1) {

            if (g > arrAvg)
                temArr.add(g);
        }
        System.out.println("The numbers in the array that are greater than the average are: " + temArr);

        System.out.println("------------------------------------");

//        3.Write a Java program to get the larger value between first and last
//        element of an array of integers.


        int[] arrNumber2 = {20, 30, 40};
        int largerVal = 0;

        for (int l : arrNumber2) {
            if (arrNumber2[0] > arrNumber2[arrNumber2.length - 1])
                largerVal = arrNumber2[0];

            else {
               largerVal = arrNumber2[arrNumber2.length - 1];
            }
        }
        System.out.println("Larger value between first and last element: " + largerVal);

        System.out.println("------------------------------------");


//        4.Write a Java program to swap the first and last elements of an array and
//        create a new array.

        System.out.println("Original Array: ");
        int [] arrNumber3 = {20, 30, 40};
        System.out.println(Arrays.toString(arrNumber3));

        for(int i = 0; i < arrNumber3.length / 2; i++){

            int stroe = arrNumber3[i];
            arrNumber3[i] = arrNumber3[arrNumber3.length - 1];
            arrNumber3[arrNumber3.length - 1] = stroe;

        }
        System.out.println("New array after swapping the first and last elements: " + Arrays.toString(arrNumber3));

        System.out.println("------------------------------------");

//        5. Write a program that places the odd elements of an array before the
//        even elements.

     //   ArrayList <Integer> arrNumber4 = new ArrayList<>();

        int [] arrNumber4 = {2,3,40,1,5,9,4,10,7};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arrNumber4));

        ArrayList <Integer> evenArr = new ArrayList<>();
        ArrayList <Integer> oddArr = new ArrayList<>();


        for(int i : arrNumber4) {

            if (i % 2 == 1) {
                oddArr.add(i);
            }}
        for(int i : arrNumber4) {

            if (i % 2 == 0) {
                evenArr.add(i);
            }}
        oddArr.addAll(evenArr);

        System.out.println("Array after places the odd elements of it before the even elements: " + oddArr);


            System.out.println("------------------------------------");


//        6. Write a program that test the equality of two arrays.


        int [] firstArr = {2,3,6,6,4};
        System.out.println("First Array: ");
        System.out.println(Arrays.toString(firstArr));

        int [] secArr = {2,3,6,6,4};
        System.out.println("Second Array: ");
        System.out.println(Arrays.toString(secArr));

        if(Arrays.equals(firstArr, secArr)){
            System.out.println("First and second arrays are equal!");
        }else {
            System.out.println("First and second arrays are not equal!");
        }
        System.out.println("------------------------------------");






















//        arrNumber4.add(2);
//        arrNumber4.add(3);
//        arrNumber4.add(40);
//        arrNumber4.add(1);
//        arrNumber4.add(5);
//        arrNumber4.add(9);
//        arrNumber4.add(4);
//        arrNumber4.add(10);
//        arrNumber4.add(7);






}}
