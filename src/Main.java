public class Main {

    public static void main( String Args []){

        Print print = new Print();

        print.welcome();

        //Set the first pattern.
        System.out.println("Select the 1st pattern.");
        int patternNumber = print.selectPattern();
        int width = print.selectPrintWidth();
        int height = print.selectPrintHeight();

        //Set the second pattern
        System.out.println("Select the 2nd pattern.");
        int patternNumber2 = print.selectPattern();
        int width2 = print.selectPrintWidth();
        int height2 = print.selectPrintHeight();

        print.print(height,width, patternNumber);
        print.printBlank(2);
        print.print(height2,width2, patternNumber2);

    }

}
