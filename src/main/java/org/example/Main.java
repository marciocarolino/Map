package org.example;

public class Main {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Marcio", 123456);
        agendaContatos.adicionarContato("Marcio", 5665);
        agendaContatos.adicionarContato("Marcio DIO", 111111111);
        agendaContatos.adicionarContato("Marcio Carolino", 45689654);
        agendaContatos.adicionarContato("Maria Silva", 111111111);
        agendaContatos.adicionarContato("Marcio", 4444444);

        // agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContatos();

        System.out.println("O número é.: " + agendaContatos.pesquisarPorNome("Marcio DIO"));


    }
}