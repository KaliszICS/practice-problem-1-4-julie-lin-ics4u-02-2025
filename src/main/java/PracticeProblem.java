import java.io.*;

public class PracticeProblem {

	public static void main(String args[]) {
		
	}
	public static String getName(int line, String file){
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(file));
			String currentLine = "";
			int lineNum = 0;
			while ((currentLine = bufferedReader.readLine()) != null) {
				lineNum++;
				if (lineNum == line) {
					String[] parts = currentLine.split(" ");
					return parts[0] + " " + parts[1]; //First and last name)
				}
				
			}
		}
		catch (IOException e){
			System.out.println("error"); 
		}
		finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			}
			catch (IOException e) {
			}
		}
		return "";
	}
	public static int getAge(int line, String file) {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(file));
			String currentLine = "";
			int lineNum = 0;
			while ((currentLine = bufferedReader.readLine()) != null) {
				lineNum++;
				if (lineNum == line) {
					String[] parts = currentLine.split(" ");
					return Integer.parseInt(parts[2]);
				}
				
			}
		}
		catch (IOException e){
		}
		finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			}
			catch (IOException e) {
			}
		}
		return -1;
	}
	public static int getNumber(int line, String file){
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(file));
			String currentLine = "";
			int lineNum = 0;
			while ((currentLine = bufferedReader.readLine()) != null) {
				lineNum++;
				if (lineNum == line) {
					String[] parts = currentLine.split(" ");
					return Integer.parseInt(parts[3]);
				}
				
			}
		}
		catch (IOException e){
		}
		finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			}
			catch (IOException e) {
			}
		}
		return -1;
	}
	public static void fileAppend(String output, String filename){
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(filename,true));
			bw.write(output);
		}
		catch (IOException e){
		}
		finally {
			try {
				if (bw != null) {
					bw.close();
				}
			}
			catch (IOException e){
			}
		}
	}
}
