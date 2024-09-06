import java.util.Scanner;

class Welcome {
    public static void main(String[] args) { ;
    System.out.println("Welcome to CS 211: Object-oriented Programming!");
    Scanner userName = new Scanner(System.in);
    System.out.println("Enter your name: ");

    String name = userName.nextLine();
    System.out.println("This course will be fun, " + name);

    }
}