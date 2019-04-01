package song2;

import java.util.Scanner;

public class duckSong {

    public static void main(String[] args) {
        duckSong mysong = new duckSong();
        mysong.sing();
    }

    private void sing() {
        Scanner myscanner = new Scanner(System.in);
        System.out.println(" enter the number of ducks");
        int numberofducks = myscanner.nextInt();

        System.out.println("how many ducks are there?");
        System.out.println(numberofducks + "went swimming one day over the hills and far away");

        for (int i = numberofducks; i > 0; i--) {
            int countdown = i - 1;

            System.out.println("mother duck said quack quack quack quack and only" + countdown + "duck came back");


            if (numberofducks == 0) {
                System.out.println(" there are no ducks left");
                System.out.println();
            }

        }
    }

}






