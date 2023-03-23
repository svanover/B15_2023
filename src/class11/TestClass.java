package class11;

public class TestClass {

  void evenNumbers(int[] values) {
    for (int v = 0; v < values.length; v++) {
      if (values[v] % 2 == 0) {
        System.out.println(values[v]);
      }
    }
  }

  void greaterThan3(double[] number) {
    for (int n = 3; n < number.length; n++) {
      System.out.println(number[n]);
    }
  }

  void oddNumbers(int[] count) {
    for (int c = 0; c < count.length; c++) {
      if (count[c] % 2 == 1) {
        System.out.println(count[c]);
      }
    }
  }

  void greaterThan25(int[] list){
    for (int n = 7; n >= 0; n--) {
      if (list[n] <= 25) {
        System.out.println(list[n]);
      }
  }
}

  void firstFive(int [] digits ){
    for (int i = 0; i < digits.length; i++) {
      if(digits[i] == 5){
        System.out.println(digits[i]);
        break;
      }
  }
}

    public static void main (String[]args){

      int[] values = {0, 1, 5, 7, 9};
      TestClass objEven = new TestClass();
      objEven.evenNumbers(values);

      double[] number = {0.58, 1.47, 2.56, 4.56, 5.39};
      TestClass objGreater = new TestClass();
      objGreater.greaterThan3(number);

      int[] count = {3, 4, 5, 3, 7, 8, 10};
      TestClass objOdd = new TestClass();
      objOdd.oddNumbers(count);

      int[] list = {4, 7, 10, 20, 23, 35, 48, 50};
      TestClass objTwentyFive = new TestClass();
      objTwentyFive.greaterThan25(list);

      int [] digits = { 1,2,3,4,5,6,7,8,};
      TestClass  objFive= new TestClass();
      objFive.firstFive(digits);


    }
  }

