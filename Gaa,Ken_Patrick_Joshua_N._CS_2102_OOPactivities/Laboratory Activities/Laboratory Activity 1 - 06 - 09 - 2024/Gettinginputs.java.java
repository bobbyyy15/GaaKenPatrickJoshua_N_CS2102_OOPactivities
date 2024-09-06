import java.util.Scanner;

// input for (SONG DETAILS) 
public class Gettinginputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int Year; 
        
        String genre, album, title, artist;

        System.out.print("Enter the year: ");
        int year = input.nextInt();
        input.nextLine();  
        
        System.out.print("Enter the genre: ");
        genre = input.nextLine();
        
        System.out.print("Enter the album: ");
        album = input.nextLine();
        
        System.out.print("Enter the song title: ");
        title = input.nextLine();
        
        System.out.print("Enter the artist: ");
        artist = input.nextLine();

        input.close();  // close cause its required

        System.out.println("-------------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("-------------------------------");
        System.out.println("Year Released: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Title: \"" + title + "\"");
        System.out.println("Artist: " + artist);
    }
}