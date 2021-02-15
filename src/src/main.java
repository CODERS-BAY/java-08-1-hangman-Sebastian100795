import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String gesuchtesWort = scanner.next();
        String sternchen = new String(new char[gesuchtesWort.length()]).replace("\0", "*");
        int versuche = 0;

        while (versuche < 7 && sternchen.contains("*")) {
            System.out.println("Versuche einen Buchstaben zu erraten!");
            System.out.println(sternchen);
            String buchstabe = scanner.next();


            String neueSternchen = "";
            for (int i = 0; i < gesuchtesWort.length(); i++) {
                if (gesuchtesWort.charAt(i) == buchstabe.charAt(0)) {
                    neueSternchen += buchstabe.charAt(0);
                } else if (sternchen.charAt(i) != '*') {
                    neueSternchen += gesuchtesWort.charAt(i);
                } else {
                    neueSternchen += "*";
                }
            }

            if (sternchen.equals(neueSternchen)) {
                versuche++;

            } else {
                sternchen = neueSternchen;
            }
            if (sternchen.equals(gesuchtesWort)) {
                System.out.println("Richtig, du hast gewonnen " + gesuchtesWort);
            }

            if (versuche == 1) {
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("__|__");
            }
            if (versuche == 2) {
                System.out.println();
                System.out.println("  |/  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("__|__");
            }
            if (versuche == 3) {
                System.out.println("  ____________  ");
                System.out.println("  |/  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("__|__");
            }
            if (versuche == 3) {
                System.out.println("  ____________  ");
                System.out.println("  |/           |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("__|__");
            }
            if (versuche == 4) {
                System.out.println("  ____________  ");
                System.out.println("  |/           |  ");
                System.out.println("  |           (_)   ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("__|__");
            }
            if (versuche == 5) {
                System.out.println("  ____________ ");
                System.out.println("  |/           |");
                System.out.println("  |           (_)");
                System.out.println("  |           \\|/");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("__|__");
            }
            if (versuche == 6) {
                System.out.println("  ____________ ");
                System.out.println("  |/           |");
                System.out.println("  |           (_)");
                System.out.println("  |           \\|/");
                System.out.println("  |            |");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("__|__");
            }
            if (versuche == 7) {
                System.out.println("Game Over");
                System.out.println("  ____________ ");
                System.out.println("  |/           |");
                System.out.println("  |           (_)");
                System.out.println("  |           \\|/");
                System.out.println("  |            |");
                System.out.println("  |           / \\");
                System.out.println("  |  ");
                System.out.println("__|__");
            }
        }
    }
}
