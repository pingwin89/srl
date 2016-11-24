package pl.pawc;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Read {

	public static void main(String args[]){
		
		try {
			FileInputStream fis = new FileInputStream(new File("dane"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<Model> list = new ArrayList<Model>();
			while(true){
				try{
					Model m = (Model) ois.readObject();
					list.add(m);
				}
				catch(EOFException e){
					break;
				}
			}
			for(Model m : list){
				System.out.println(m.toString());
			}
		} catch (IOException | ClassNotFoundException e){
			e.printStackTrace();
		}
		
		
	}
	
}
