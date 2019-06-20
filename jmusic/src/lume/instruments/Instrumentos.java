package lume.instruments;

enum Timbres {
    Teclado,
    Cordas,
    Sopro,
    Percursao
}

public class Instrumentos implements instrumento{
    Timbres timbre = Timbres.Teclado;

    @Override
    public void mensagem() {
        System.out.println("Esse botao server para selecionar o instrumento" + timbre);
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
                System.out.println("Selecione um argumento valido");
                break;
        }

    }

    // Para teste
    public static void teste(){
        Instrumentos inst = new Instrumentos();
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
