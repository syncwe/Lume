package lume.oitava;

import jm.JMC;
import jm.music.data.Note;
import jm.util.Play;
import java.util.ArrayList;

public class Oitava implements JMC {
	
	@SuppressWarnings("rawtypes")
	public static ArrayList AumentarOitava(ArrayList<Note> array) {
		
		
		for(int i = 0; i < array.size(); i++) {
			array.get(i).setPitch(array.get(i).getPitch() + 12);
		}
		return array;
	}
	
	@SuppressWarnings("rawtypes")
	public static ArrayList DiminuirOitava(ArrayList<Note> array) {
		for(int k = 0; k < array.size(); k++) {
			array.get(k).setPitch(array.get(k).getPitch() - 12);
		}
		return array;
	}
	
	public static void teste() {
		
		ArrayList<Note> arr = new ArrayList<Note>(); 
		Note c1 = new Note(C1, QN);
		Note d1 = new Note(D1, QN);
		Note e1 = new Note(D2, QN);
	
		arr.add(c1);
		arr.add(d1);
		arr.add(e1);
		System.out.println(AumentarOitava(arr));

	}
	
	public static void main(String[] args) {
	
		teste();
	}
}
