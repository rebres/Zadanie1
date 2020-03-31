import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String DNA = scan.nextLine();
        String slowo = Transkrypcja(DNA);
        System.out.print(slowo);
    }

    public static String Transkrypcja(String slowo2){
        slowo2 = slowo2.replace("T", "U");
        return slowo2;
        }
    }


