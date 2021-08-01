import java.util.Scanner;

/* This is a music player that is playing a song on repeat unless you change the song */
public class MusicPlayer {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to play next song, if so 'yes'");

            String userInput = input.nextLine();

            if (userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }

        System.out.println("Playing Next Song");
    }

}
