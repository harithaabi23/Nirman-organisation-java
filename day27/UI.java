package day27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UI {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		String path = "C:\\Users\\selwy\\OneDrive\\Desktop\\Haritha\\datas.txt";
		Employee emp = new Employee("abi", 56587698l);
		al.add(emp);
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			oos.close();
			fos.close();
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<Employee> ali = (ArrayList<Employee>) ois.readObject();
			//System.out.println(ois.readObject());
			System.out.println(ali);
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
