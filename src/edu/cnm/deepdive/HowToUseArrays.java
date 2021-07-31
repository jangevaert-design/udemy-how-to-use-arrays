package edu.cnm.deepdive;

import java.util.Arrays;

public class HowToUseArrays {

  public static void main(String[] args) {

    String[] pets = {"parrot", "cat", "dog"};
    System.out.println(pets[0]);
    System.out.println(pets[1]);
    System.out.println(pets[2]);
    //System.out.println(pets[3]);ArrayIndexOutOfBoundsException

    pets[0] = "bird";
    System.out.println();

    for (int i = 0; i < pets.length; i++) {
      System.out.println(pets[i]);

    }

    System.out.println();
    System.out.println(pets);//prints [Ljava.lang.String;@d93b30
    System.out.println(Arrays.toString(pets));//prints [bird, cat, dog]


  int[] numbers = new int[5];
    System.out.println();
    System.out.println(Arrays.toString(numbers));//prints [0, 0, 0, 0, 0]

    String[] newPets = new String[5];
    System.out.println();
    System.out.println(Arrays.toString(newPets));//prints [null, null, null, null, null]

    for (int i = 0; i < numbers.length; i++) {

          numbers[i] = i;

    }
    System.out.println();
    System.out.println(Arrays.toString(numbers));//prints [0, 1, 2, 3, 4]

    Integer[] nums = new Integer[4];
    System.out.println();
    System.out.println(Arrays.toString(nums));

    for (int i = 0; i < nums.length; i++) {
      nums[i] = i;
    }
    System.out.println(Arrays.toString(nums));

  }
}
