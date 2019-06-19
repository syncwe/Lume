package lume.teclado;
import jm.JMC;
import jm.music.data.Note;
import java.util.ArrayList; // import the ArrayList class


public class Nota implements JMC{
    public static void main(String[] args) {
        ArrayList<Note> arr = new ArrayList<Note>();
//        Note[] arr = new Note[];
        Note a = new Note(C1, QN);
        Note b = new Note(D1, QN);
        arr.add(a);
        arr.add(b);

//        arr[0] = a;
//        arr[1] = b;

        System.out.println("array1: " + arr);
        arr.get(0).setPitch(arr.get(0).getPitch() + 12);
        System.out.println("array1: " + arr);

    }
}
