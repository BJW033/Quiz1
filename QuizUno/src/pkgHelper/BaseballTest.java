package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class BaseballTest {
	private Baseball Pl = new Baseball("Name",8399,2873,506,136,714,2174,2062);
	@Test
	public void BattingAverageTest() {
		assertEquals(0.342, Pl.battingAverage() ,0.005);
	}
	@Test
	public void OBPTest() {
		assertEquals(0.474,Pl.OBP(),0.005);
	}
	@Test
	public void SlugTest() {
		assertEquals(0.690,Pl.slug(),0.005);
	}
	@Test
	public void OnBasePlusSlugTest() {
		assertEquals(1.164,Pl.onBasePlusSlug(),0.005);
	}
	@Test
	public void TotalBasesTest() {
		assertEquals(5793,Pl.totalBases(),0);
	}

}
