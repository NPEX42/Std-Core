package std.core.algorithms;

import java.util.*;

public class ArrayUtils {
	public static byte[] ToByteArray(List<Byte> list) {
		byte[] buffer = new byte[list.size()];
		for(int i=0; i<buffer.length; i++) {
			buffer[i] = list.get(i);
		}
		return buffer;
	}

	public static short[] ToShortArray(List<Short> list) {
		short[] buffer = new short[list.size()];
		for(int i=0; i<buffer.length; i++) {
			buffer[i] = list.get(i);
		}
		return buffer;
	}
	
	public static int[] ToIntArray(List<Integer> list) {
		int[] buffer = new int[list.size()];
		for(int i=0; i<buffer.length; i++) {
			buffer[i] = list.get(i);
		}
		return buffer;
	}
}
