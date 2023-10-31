import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Song {

    public void printSong(PrintStream output) throws FileNotFoundException {
        for (int day = 1; day <= 12; day++) {
            output.print("On the ");
            output.print(day);

            switch (day) {
                case 1 ->  output.print("st");
                case 2 ->  output.print("nd");
                case 3 ->  output.print("rd");
                default -> output.print("th");
            }

            output.println(" day of Christmas my true love gave to me");

            switch (day) {
                case 12: output.println("Twelve drummers drumming,");
                case 11: output.println("Eleven pipers piping,");
                case 10: output.println("Ten lords a leaping,");
                case 9:  output.println("Nine ladies dancing,");
                case 8:  output.println("Eight maids a milking,");
                case 7:  output.println("Seven swans a swimming,");
                case 6:  output.println("Six geese a laying,");
                case 5:  output.println("Five golden rings,");
                case 4:  output.println("Four calling birds,");
                case 3:  output.println("Three French hens,");
                case 2:  output.println("Two turtle doves, and");
                default: output.println("A partridge in a pear tree.");
            }

            output.println();
        }
    }


    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Sang start");
        Song song = new Song();
        PrintStream output = new PrintStream(new File("sangtekst.txt"));
        song.printSong(output);
        System.out.println("Sang slut");
    }
}
