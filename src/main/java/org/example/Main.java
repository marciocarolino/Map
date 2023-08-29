package org.example;

public class Main {
    public static void main(String[] args) {

//        AgendaContatos agendaContatos = new AgendaContatos();
//
//        agendaContatos.adicionarContato("Marcio", 123456);
//        agendaContatos.adicionarContato("Marcio", 5665);
//        agendaContatos.adicionarContato("Marcio DIO", 111111111);
//        agendaContatos.adicionarContato("Marcio Carolino", 45689654);
//        agendaContatos.adicionarContato("Maria Silva", 111111111);
//        agendaContatos.adicionarContato("Marcio", 4444444);
//
//        // agendaContatos.exibirContatos();
//
//        agendaContatos.removerContato("Maria Silva");
//        agendaContatos.exibirContatos();
//
//        System.out.println("O número é.: " + agendaContatos.pesquisarPorNome("Marcio DIO"));


        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
//        estoqueProdutos.exibirProduto();

        estoqueProdutos.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoqueProdutos.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoqueProdutos.adicionarProduto(3L, "Produto C", 2, 15.0);

        estoqueProdutos.exibirProduto();

        System.out.println("Valor total do estoque: R$ " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());

    }
}