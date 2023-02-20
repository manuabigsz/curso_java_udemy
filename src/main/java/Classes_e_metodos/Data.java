package classe;

public class Data {
    Integer dia;
    Integer mes;
    Integer ano;

    Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
        //this(1,1,1970);
    }

    Data(int dia, Integer mes, Integer ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    String obterData() {
    String formato = "\n%d/%d/%d";
        return String.format(formato, dia, mes, ano);
    }

    void imprimeData() {

        System.out.printf(obterData());
    }

    static void teste() {
        //em metodo estatico não é possivel usar
        //o this, pq o metodo estatico existe associado
        // a classe e o this é uma das instâncias da classe

    }
}
