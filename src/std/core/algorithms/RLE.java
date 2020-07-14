package std.core.algorithms;

import java.util.ArrayList;

/**
 * 
 * @author George Venn
 * <p> Format: {XX,VV}, Repeat Value VV,  XX Times.</p>
 */
@Deprecated
public class RLE {
	public static byte[] CompressBytes(byte... data) {
		ArrayList<Byte> output = new ArrayList<Byte>();
		byte last = 0x00, runLen = 0x00;
		
		for(byte curr : data) {
			if(curr != last) {//Start A New Run
				output.add(runLen);
				output.add(curr);
			} else {
			runLen++;
			}
			last = curr;
		}
		return ArrayUtils.ToByteArray(output);
	}
	
	public static short[] CompressShorts(short... data) {
		ArrayList<Short> output = new ArrayList<Short>();
		short last = 0x0000, runLen = 0x0000;
		
		for(short curr : data) {
			if(curr != last) {//Start A New Run
				output.add(runLen);
				output.add(curr);
			}
			runLen++;
			last = curr;
		}
		return ArrayUtils.ToShortArray(output);
	}
	
	public static int[] CompressInts(int... data) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		int last = 0x0000, runLen = 0x0000;
		
		for(int curr : data) {
			if(curr != last) {//Start A New Run
				output.add(runLen);
				output.add(curr);
			}
			runLen++;
			last = curr;
		}
		return ArrayUtils.ToIntArray(output);
	}
	
	
}
