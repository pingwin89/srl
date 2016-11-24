package pl.pawc;

import java.io.Serializable;
import java.util.Date;

public class Model implements Serializable{

	private int number;
	private String text;
	//private Date time;
	
	public Model(int number, String text){
		this.number = number;
		this.text = text;
		//time = new Date();
	}
	
	public String toString(){
		return number+": "+text;
	}
	
}