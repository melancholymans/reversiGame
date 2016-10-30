package reversi;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ColorStorageTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGet()
	{
		ColorStorage cs = new ColorStorage();
		cs.set(Disc.BLACK,4);
		cs.set(Disc.WHITE,6);
		assertEquals(4,cs.get(Disc.BLACK));
		assertEquals(6,cs.get(Disc.WHITE));
	}
}
