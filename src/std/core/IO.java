package std.core;
import java.io.*;
public class IO {
	public static String LoadString(File file) {
		try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
			StringBuffer buffer = new StringBuffer();
			String line = "";
			while((line = reader.readLine()) != null) {
				buffer.append(line+"\n");
			}
			return buffer.toString();
		} catch (IOException e) {
			return null;
		}
	}
	
	public static String[] LoadStrings(File file) {
		String tmp = LoadString(file);
		if(tmp == null) return null;
		return tmp.split("\n");
	}
	
	public static boolean SaveString(File file, String source) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
			writer.write(source);
			writer.flush();
			return true;
		} catch (IOException e) {
			return false;
		}
	}
	
	public static boolean SaveStrings(File file, String[] source) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
			for(String line : source) writer.write(line+"\n");
			writer.flush();
			return true;
		} catch (IOException e) {
			return false;
		}
	}
	
	public static byte[] LoadSignedBytes(File file) {
		try(DataInputStream stream = new DataInputStream(new FileInputStream(file))) {
			byte[] buffer = new byte[(int)file.length()];
			for(int index = 0; index < buffer.length; index++) {
				buffer[index] = stream.readByte();
			}
			return buffer;
		} catch (IOException e) {
			return null;
		}
	}
	
	public static int[] LoadUnsignedBytes(File file) {
		try(DataInputStream stream = new DataInputStream(new FileInputStream(file))) {
			int[] buffer = new int[(int)file.length()];
			for(int index = 0; index < buffer.length; index++) {
				buffer[index] = stream.readUnsignedByte();
			}
			return buffer;
		} catch (IOException e) {
			return null;
		}
	}
	
	public static short[] LoadSignedShorts(File file) {
		try(DataInputStream stream = new DataInputStream(new FileInputStream(file))) {
			short[] buffer = new short[(int)file.length()];
			for(int index = 0; index < buffer.length; index++) {
				buffer[index] = stream.readShort();
			}
			return buffer;
		} catch (IOException e) {
			return null;
		}
	}
	
	public static int[] LoadUnsignedShorts(File file) {
		try(DataInputStream stream = new DataInputStream(new FileInputStream(file))) {
			int[] buffer = new int[(int)file.length()];
			for(int index = 0; index < buffer.length; index++) {
				buffer[index] = stream.readUnsignedShort();
			}
			return buffer;
		} catch (IOException e) {
			return null;
		}
	}
	
	 
	
	public static int[] LoadSignedInts(File file) {
		try(DataInputStream stream = new DataInputStream(new FileInputStream(file))) {
			int[] buffer = new int[(int)file.length()];
			for(int index = 0; index < buffer.length; index++) {
				buffer[index] = stream.readInt();
			}
			return buffer;
		} catch (IOException e) {
			return null;
		}
	}
	
	public static boolean SaveBytes(File file, byte[] data) {
		try {file.createNewFile();} catch(IOException ioex) {return false;}
		try(DataOutputStream stream = new DataOutputStream(new FileOutputStream(file))) {
			for(byte i : data) {
				stream.write(i);
			}
			return true;
		} catch (IOException e) {
			return false;
		}
	}
	
	public static boolean SaveShorts(File file, short[] data) {
		try {file.createNewFile();} catch(IOException ioex) {return false;}
		try(DataOutputStream stream = new DataOutputStream(new FileOutputStream(file))) {
			for(short i : data) {
				stream.write(i);
			}
			return true;
		} catch (IOException e) {
			return false;
		}
	}
	
	public static boolean SaveInts(File file, int[] data) {
		try {file.createNewFile();} catch(IOException ioex) {return false;}
		try(DataOutputStream stream = new DataOutputStream(new FileOutputStream(file))) {
			for(int i : data) {
				stream.write(i);
			}
			return true;
		} catch (IOException e) {
			return false;
		}
	}
	
	public static boolean SaveLongs(File file, long[] data) {
		try {file.createNewFile();} catch(IOException ioex) {return false;}
		try(DataOutputStream stream = new DataOutputStream(new FileOutputStream(file))) {
			for(long i : data) {
				stream.writeLong(i);
			}
			return true;
		} catch (IOException e) {
			return false;
		}
	}
	
	

}
