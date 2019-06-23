package lume.tecla;

import jm.JMC;
import jm.music.data.Note;
import lume.oitava.Oitava;

import java.util.ArrayList;

public class Teclas extends Oitava implements JMC{
    public Teclas(){
        this.ImplementaTeclado();
    }

    // Conjunto do objeto de nota
    private static ArrayList<Note> teclas = new ArrayList<Note>();

    public void mudarOitava(int decision){
        if(decision == 1){
            this.setTeclas(this.AumentarOitava(this.getTeclas()));
            System.out.println("Aumentou uma oitava");
        }else if(decision == 0){
            this.setTeclas(this.DiminuirOitava(this.getTeclas()));
            System.out.println("Diminui uma oitava");
        }
    }

    public ArrayList<Note> getTeclas() {
        return teclas;
    }

    public void setTeclas(ArrayList<Note> teclas) {
        this.teclas = teclas;
    }

    public void ImplementaTeclado() {
        ArrayList<Note> implementa = new ArrayList<Note>();

        // Setando as notas default do teclado
        // Notas maiores
        Note c3 = new Note(C3, QN);
        Note d3 = new Note(D3, QN);
        Note e3 = new Note(E3, QN);
        Note f3 = new Note(F3, QN);
        Note g3 = new Note(G3, QN);
        Note a3 = new Note(A3, QN);
        Note b3 = new Note(B3, QN);

        // Notas sustenidas
        Note cs = new Note(CS3, QN);
        Note ds = new Note(DS3, QN);
        Note fs = new Note(FS3, QN);
        Note gs = new Note(GS3, QN);
        Note as = new Note(AS3, QN);
        Note bs = new Note(BS3, QN);

        implementa.add(c3);
        implementa.add(cs);
        implementa.add(d3);
        implementa.add(ds);
        implementa.add(e3);
        implementa.add(f3);
        implementa.add(fs);
        implementa.add(g3);
        implementa.add(gs);
        implementa.add(a3);
        implementa.add(as);
        implementa.add(b3);
        implementa.add(bs);

        this.setTeclas(implementa);
    }

    public static void teste(){
        Teclas teclado = new Teclas();
        teclado.ImplementaTeclado();
        System.out.println(teclado.getTeclas());
    }

    public static void main(String[] args) {
        // Para teste
        teste();

    }
}