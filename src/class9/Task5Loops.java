package class9;
  //5) 3 6 9 12 15

public class Task5Loops {
    public static void main(String[] args) {

        int team = 3;

        while (team <= 15) {
            if (team % 3 == 0) {
                System.out.println(team);
                team++;

            }
            System.out.println(/***************/);

            for (int num = 3; num <= 15; num++) {
                if (num % 3 == 0) {
                    System.out.println(num);
                }

            }
        }
    }
}