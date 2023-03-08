package class9;
 //7) 5 10 20 25
public class Task7Loops {
  public static void main(String[] args) {

   int multi = 5;

   while (multi <= 25) {
    if (multi % 5 == 0) {
     System.out.println(multi);

     multi++;
    }
    System.out.println(/***************/);

    for (int input = 5; input <= 25; input++) {
     if (input % 5 == 0) {
      System.out.println(input);
     }
    }
   }
  }
 }