import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class AudioFileInput{
	
	public static void main(String[] args) throws UnsupportedAudioFileException,IOException,LineUnavailableException{
		Scanner scanner = new Scanner(System.in);
		
		File file = new File("interstellar.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		clip.start();
		
		String response = scanner.next();
		
	}
	
}