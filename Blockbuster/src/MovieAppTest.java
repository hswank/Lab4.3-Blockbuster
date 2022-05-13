import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MovieAppTest {

	@Test
	void testDVD() {
		DVD dvd = new DVD("Moon of the Gorillas", 123);
		String expected = "Moon of the Gorillas";
		String actual = dvd.getTitle();
		assertEquals(expected, actual);
	}
	
	@Test
	void testDVD2() {
		DVD dvd = new DVD("Moon of the Gorillas", 123);
		int expected = 123;
		int actual = dvd.getRunTime();
		assertEquals(expected, actual);
	}
	
	@Test
	void testVHS() {
		VHS vhs = new VHS("Moon of the Gorillas", 123);
		String expected = "Moon of the Gorillas";
		String actual = vhs.getTitle();
		assertEquals(expected, actual);
	}
	
	@Test
	void testVHS2() {
		VHS vhs = new VHS("Moon of the Gorillas", 123);
		int expected = 123;
		int actual = vhs.getRunTime();
		assertEquals(expected, actual);
	}
	
	@Test
	void testVHS3() {
		VHS vhs = new VHS("Moon of the Gorillas", 123);
		int expected = 0;
		int actual = vhs.getCurrentTime();
		assertEquals(expected, actual);
	}
	
	@Test
	void testVHS4() {
		VHS vhs = new VHS("Moon of the Gorillas", 123);
		ArrayList<String> scene = new ArrayList<>();
		scene.add("Monkeys get smart");
		scene.add("Monkeys don't like humans anymore");
		scene.add("Monkeys kill humans");
		scene.add("Monkeys take over Moon");
		vhs.setScenes(scene);
		vhs.play();
		int expected = 1;
		int actual = vhs.getCurrentTime();
		assertEquals(expected, actual);
	}
	
	@Test
	void testVHS5() {
		VHS vhs = new VHS("Moon of the Gorillas", 123);
		ArrayList<String> scene = new ArrayList<>();
		scene.add("Monkeys get smart");
		scene.add("Monkeys don't like humans anymore");
		scene.add("Monkeys kill humans");
		scene.add("Monkeys take over Moon");
		vhs.setScenes(scene);
		vhs.play();
		vhs.play();
		vhs.rewind();
		int expected = 0;
		int actual = vhs.getCurrentTime();
		assertEquals(expected, actual);
	}

}
