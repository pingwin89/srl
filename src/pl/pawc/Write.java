package pl.pawc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Write{

	public static void main(String args[]){
		
		Model m1 = new Model(1, "raz");
		Model m2 = new Model(2, "dwa");
		Model m3 = new Model(3, "trzy");
		Model m4 = new Model(4, "cztery");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try{
			fos = new FileOutputStream(new File("dane"));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(m1);
			oos.flush();
			oos.writeObject(m2);
			oos.flush();
			oos.writeObject(m3);
			oos.flush();
			oos.writeObject(m4);
			oos.flush();
			System.out.println("done");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
}