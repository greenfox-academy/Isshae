package sum;


import java.util.Arrays;
import java.util.List;

public class Sum {
  /*Create a sum method in your class which has an
   ArrayList of Integers as parameter
It should return the sum of the elements in the list
Follow these steps:
Add a new test case
Instantiate your class
create a list of integers
use the assertEquals to test the result of the created sum method
Run them
Create different tests where you
test your method with an empyt list
with a list with one element in it
with multiple elements in it
with a null
Run them
Fix your code if needed*/

  public List<Integer> listOfNums;

  public Sum() {
    listOfNums = Arrays.asList(1, 2, 3, 4, 5);
  }

  public int sumAllEleements(List<Integer> list) {
    int sum = 0;
    for (int i = 0; i < list.size(); i++) {
      sum += list.get(i);
    }
return sum;
  }
}
