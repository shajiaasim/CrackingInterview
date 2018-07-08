package Chapter1;

public class IsUnique_1_1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // System.out.println(GCD(12, 6));
    // int[] array = {6, 7, 8, 9, 10};
    //
    // for (int a : sortArray(array)) {
    // System.out.println(a);
    // }
    //
    //
    // System.out.println(isPermutation("malayalam"));

    // System.out.println(compressString("aabcccccaaa"));

    System.out.println("isUnique: " + isUnique("hello"));

   

  }


//  static int GCD(int a, int b) {
//    if (b == 0)
//      return a;
//    return GCD(b, a % b);
//  }
//
//
//  static int[] sortArray(int[] array) {
//    int temp = 0;
//    for (int i = 0; i < array.length - 1; i++) {
//      if (array[i] > array[i + 1]) {
//        temp = array[i + 1];
//        array[i + 1] = array[i];
//        array[i] = temp;
//        return sortArray(array);
//      }
//    }
//    return array;
//  }
//
//
//
//  static boolean isPermutation(String phrase) {
//
//    char[] charArray = phrase.toCharArray();
//    int[] countArray = new int[128];
//
//    for (char c : charArray) {
//      countArray[c]++;
//    }
//
//    int oddCount = 0;
//    for (int count : countArray) {
//      if (!(count % 2 == 0)) {
//        oddCount++;
//      }
//    }
//
//    if (oddCount > 1)
//      return false;
//    else {
//      return true;
//    }
//
//  }
//
//  static String compressString(String word) {
//
//    String compressedWord = "";
//
//    int counter = 0;
//
//    for (String letter : word.split("")) {
//      if (compressedWord.contains(letter))
//        counter++;
//      else {
//        if (compressedWord.isEmpty())
//          compressedWord = compressedWord + letter;
//        else {
//          compressedWord = compressedWord + counter;
//          counter = 0;
//        }
//      }
//    }
//
//    return compressedWord;
//  }


//1.1
  
  static boolean isUnique(String word) {

    boolean[] bArray = new boolean[128];

    char[] cArray = word.toCharArray();

    for (int i = 0; i < cArray.length; i++) {
      if (!bArray[cArray[i]]) {
        bArray[cArray[i]] = true;
      } else {
        return false;
      }

    }

    return true;

  }

  



}
