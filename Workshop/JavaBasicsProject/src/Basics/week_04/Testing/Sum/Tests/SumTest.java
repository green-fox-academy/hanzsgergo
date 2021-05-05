package Basics.week_04.Testing.Sum.Tests;

import static org.junit.jupiter.api.Assertions.*;

import Basics.week_04.Testing.Sum.Task.Sum;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
//Sum
//    Create a sum method in your class which has an ArrayList of Integers as parameter
//    It should return the sum of the elements in the list
//    Follow these steps:

//    Add a new test case
//      Instantiate your class
//      create a list of integers
//      use the assertEquals to test the result of the created sum method
//      Run them

//    Create different tests where you test your method with:
//      an empty list
//      a list that has one element in it
//      a list that has multiple elements in it
//      a null
//      Run them
//    Fix your code if needed
class SumTest {


  @Test
  void testSumElements() {
    List<Integer> numbers = new ArrayList<>();
    Sum sum = new Sum();
    numbers.add(4);
    numbers.add(2);
    numbers.add(123);
    int expected = 129;
    int actual = sum.sumElements(numbers);
    assertEquals(expected,actual);
  }
}