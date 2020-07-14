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
}
