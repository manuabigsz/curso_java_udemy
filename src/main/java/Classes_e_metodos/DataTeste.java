package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        Data d2 = new Data();

        d1.dia=10;
        d1.mes=1;
        d1.ano=2023;

        d2.dia=14;
        d2.mes=4;
        d2.ano=2023;

        System.out.println(d1.dia + "/" +d1.mes + "/" + d1.ano);
        System.out.println(d2.dia + "/"+ d2.mes + "/" + d2.ano);

        System.out.printf("%d/%d/%d", d2.dia,d2.mes,d2.ano);

        System.out.printf(d1.obterData());

    }
}
