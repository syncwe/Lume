package lume.teclado;
import jm.music.data.Note;
import jm.util.Play;
import lume.instruments.Instrumentos;
import lume.tecla.Teclas;
import java.util.Scanner;

public class Teclado extends Teclas{
    public Instrumentos instrumentos =  new Instrumentos();

    public Note getNote(int index){
        return this.getTeclas().get(index);
    }


    public void tocar(String input){
        switch (input){

            // Case das teclas do teclado
            // Index == 0 => Do
            // Index == 11 => Si

            case "a":
                Play.midi(this.getNote(0));
                break;
            case "w":
                Play.midi(this.getNote(1));
                break;
            case "s":
                Play.midi(this.getNote(2));
                break;
            case "e":
                Play.midi(this.getNote(3));
                break;
            case "d":
                Play.midi(this.getNote(4));
                break;
            case "f":
                Play.midi(this.getNote(5));
                break;
            case "t":
                Play.midi(this.getNote(6));
                break;
            case "g":
                Play.midi(this.getNote(7));
                break;

            case "y":
                Play.midi(this.getNote(8));
                break;

            case "h":
                Play.midi(this.getNote(9));
                break;

            case "u":
                Play.midi(this.getNote(10));
                break;

            case "j":
                Play.midi(this.getNote(11));
                break;

            case "m":
                this.mudarOitava(1);
                break;

            case "n":
                this.mudarOitava(0);
                break;

            case "z":
                this.instrumentos.selectInst(0);
                break;
            case "x":
                this.instrumentos.selectInst(1);
                break;
            case "c":
                this.instrumentos.selectInst(2);
                break;
            case "v":
                this.instrumentos.selectInst(3);
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Teclado teclado = new Teclado();

        while (true){
            String input = scanner.next();
            teclado.tocar(input);
        }
    }
}
