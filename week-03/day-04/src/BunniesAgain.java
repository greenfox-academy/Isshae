public class BunniesAgain {
  public static void main(String[] args) {
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

    int bunnies = 100;


    int result = 0;
    for (int i = 0; i < bunnies; i++) {
      if (i % 2 == 0) {
        result += 3;
      } else {
        result += 2;
      }
    }
    System.out.println(result);
    System.out.println(earsAgain(bunnies));
  }

  private static int earsAgain(int bunnies) {
    if (bunnies == 0) {
      return bunnies;
    } else {
      int ears = bunnies % 2 == 0 ? 3 : 2;
      return ears + earsAgain(bunnies - 1);
    }


  }
}


