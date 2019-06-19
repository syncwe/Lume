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
    public void selectInst(int param){
        switch (param){
            case 0:
                this.timbre = Timbres.Teclado;
                System.out.println("O timbre mudou para: " + this.timbre);
                break;
            case 1:
                this.timbre = Timbres.Cordas;
                System.out.println("O timbre mudou para: " + this.timbre);
                break;
            case 2:
                this.timbre = Timbres.Sopro;
                System.out.println("O timbre mudou para: " + this.timbre);
                break;
            case 3:
                this.timbre = Timbres.Percursao;
                System.out.println("O timbre mudou para: " + this.timbre);
                break;
            default:
                System.out.println("Selecione um argumento válido");
                break;
        }

    }

    // Para teste
    public static void teste(){
        Instruments inst = new Instruments();
        System.out.println("O instrumento inicial é: " + inst.timbre);
        inst.selectInst(1);
        inst.selectInst(2);
        inst.selectInst(3);
        inst.selectInst(4);
    }

    public static void main(String[] args) {
        teste();
    }


}