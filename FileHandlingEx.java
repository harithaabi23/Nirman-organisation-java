package FileHandling;
import java.io.*;

public class FileHandlingEx {
	public static void main(String[] args) {
		String path = "C:\\Users\\selwy\\OneDrive\\Desktop\\newfolder\\abi\\anan\\result.txt";
		File fw = new File(path); 
		
//		//fw.mkdirs();
//		try {
//			fw.createNewFile();
//			System.out.println("file created");
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try {
			FileWriter fw1 = new FileWriter(fw,true);
			BufferedWriter bw = new BufferedWriter(fw1);
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			
//			fw1.write("abi");
//			bw.newLine();
//			bw.write("anan");
//			bw.close();
//			fw1.close();
//			
			//System.out.println((char)fr.read());
			
//			System.out.println(br.readLine());
//			String line = br.readLine();
//			while(line!=null) {
//				System.out.println(line);
//				line = br.readLine();
//			}
//			
			System.out.println(br.read()); 
			int i=br.read();			
			while(i!=-1) {
				System.out.println(i);
				i = br.read();	
				}
			
			br.close();
			fr.close();
			System.out.println("done");
			
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}
