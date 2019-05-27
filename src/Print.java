import java.util.InputMismatchException;
import java.util.Scanner;

public class Print {

    public void print(int height, int width, int patternNumber ){

        for (int x = 0; x < height ; x++){

            for (int y = 0; y < width; y++){

                if (patternNumber==1){

                    BaublePattern bauble = new BaublePattern();
                    bauble.printPattern();

                } else if (patternNumber==2){

                    BlockyBaublePattern blocky = new BlockyBaublePattern();
                    blocky.printPattern();

                } else if (patternNumber==3){

                    CrossStitchWigglePattern cross = new CrossStitchWigglePattern();
                    cross.printPattern();

                }else if (patternNumber==4){

                    ZigZagLinesPattern zigzag = new ZigZagLinesPattern();
                    zigzag.printPattern();

                } else {

                    throw new InputMismatchException ("Please enter a number from 1 to 4.");
                }



            }

            System.out.print("\n");

        }

    }

    public void printBlank(int x){

        for (int i=0; i<x; i++){

            System.out.println(" ");
        }
    }

    public void welcome(){

        System.out.println( "Welcome to the pattern printer!\n" +
                "Enter the number of the pattern you want to print.");
        System.out.println( "1) Bauble \n" +
                "2) BlockyBauble \n" +
                "3) CrossStitchWiggle \n" +
                "4) ZigzagLines \n");
    }

    public int selectPattern(){

        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    public int selectPrintWidth(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many blocks of the pattern you want to print in a row?");

        return scanner.nextInt();
    }


    public int selectPrintHeight(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rows you want to print?");

        return scanner.nextInt();
    }

}

