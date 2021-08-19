import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TestVideo1 {

	/**
	 * @param args
	 * @throws InterruptedException
	 */

	public static void main(String[] args) throws InterruptedException {

//https://developers.google.com/youtube/flash_api_reference#Playback_controls

		Config c = new Config();
		WebDriver driver = c.openBrowser("firefox", "https://www.youtube.com/watch?v=4Ksf2Ke1sNo");

		((JavascriptExecutor) driver).executeScript("movie_player.playVideo()");
		System.out.println("1 video played...");
		Thread.sleep(10000);

		((JavascriptExecutor) driver).executeScript("movie_player.pauseVideo()");
		System.out.println("2 video paused.");
		Thread.sleep(10000);

		((JavascriptExecutor) driver).executeScript("movie_player.playVideo()");
		System.out.println("3 video played");
		Thread.sleep(20000);

		((JavascriptExecutor) driver).executeScript("movie_player.mute()");
		System.out.println("4 video muted");
		Thread.sleep(10000);

		((JavascriptExecutor) driver).executeScript("movie_player.unMute()");
		System.out.println("5 video unmuted");
		Thread.sleep(20000);

		((JavascriptExecutor) driver).executeScript("movie_player.nextVideo()");
		System.out.println("6 next video ");
		Thread.sleep(20000);

		/*  */
		driver.quit();

	}

}
