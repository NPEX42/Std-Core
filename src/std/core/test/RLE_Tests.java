package std.core.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import std.core.algorithms.RLE;

class RLE_Tests {

	@Test
	void testCompressBytes() {
		byte[] test = {(byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2};
		assertEquals(new byte[] {(byte) 3, (byte) 1}, RLE.CompressBytes(test));
	}

	@Test
	void testCompressShorts() {
		fail("Not yet implemented");
	}

	@Test
	void testCompressInts() {
		fail("Not yet implemented");
	}
	

}
