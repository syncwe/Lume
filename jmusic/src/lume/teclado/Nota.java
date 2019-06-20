package lume.teclado;
import jm.JMC;
import jm.music.data.Note;
import jm.util.Play;

public class Nota implements JMC{
    public static void main(String[] args) throws InterruptedException {
        Note a = new Note(D3, M);
        Note b = new Note(C3, M);

        Play.midi(a);

        Thread.sleep(1000);
        Play.midi(b);

    }
}
