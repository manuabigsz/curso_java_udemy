package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("arroz",13.6);
        //p1.nome = "arroz";
        //p1.desconto = 0.10;
        //p1.preco = 13.5;

        var p2 = new Produto();
        p2.nome = "feijao";
        p2.preco = 10.20;

        System.out.println(p1.nome);
        //System.out.println("Valor com desconto: " + p1.preco * (1-p1.desconto));
        System.out.println("Valor com desconto: " + p1.precoComDesconto(0));

        System.out.println(p2.nome);
        System.out.println("Valor com desconto: " + p2.preco * (1 - p2.desconto));
    }
}
