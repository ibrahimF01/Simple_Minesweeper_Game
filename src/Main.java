import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row,column;
        System.out.println("Welcome to Minesweeper Game !");
        System.out.println("Please enter the sizes you want to play !");
        System.out.print("Number of Rows: ");
        row=scan.nextInt();
        System.out.print("Number of Columns: ");
        column=scan.nextInt();

        Minesweeper mine=new Minesweeper(row,column);
        mine.run();
    }

}
