package lume.instruments;

enum Timbres {
    Teclado,
    Cordas,
    Sopro,
    Percursao
}

public class Instruments implements instrumento{
    Timbres timbre = Timbres.Teclado;

    @Override
    public void mensagem() {
        System.out.println("Esse botão server para Selecionar o Instrumento" + timbre);
    }

    @Override
    public void selectInst(int param) {
        switch (param){
            case 0:
                this.timbre = Timbres.Teclado;
                break;
            case 1:
                this.timbre = Timbres.Cordas;
                break;
            case 2:
                this.timbre = Timbres.Sopro;
                break;
            case 3:
                this.timbre = Timbres.Percursao;
                break;
        }
        System.out.println("O timbre mudou para: " + this.timbre);
    }

    public static void main(String[] args) {
        Instruments inst = new Instruments();
        System.out.println("O instrumento inicial é: " + inst.timbre);
        inst.selectInst(2);

    }
}   
