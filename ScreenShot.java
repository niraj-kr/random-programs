import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ScreenShot {
	static {
		System.setProperty("java.awt.headless","false");
	}

	public static void main(String[] args) {
		try {
			Thread.sleep(120);
			Robot r = new Robot();
			
			//It saves screenshot to the desired path
			String path = "E://Shot.jpg";
			
			//Used to get Screen Size and capture image
			Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			
			BufferedImage image = r.createScreenCapture(capture);
			
			ImageIO.write(image, "jpg", new File(path));
			
			System.out.println("ScreenShot saved");
			
		}catch(AWTException | IOException | InterruptedException ex) {
			System.out.println(ex);
		}

	}

}