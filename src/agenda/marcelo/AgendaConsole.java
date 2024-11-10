package agenda.marcelo;

import java.util.Scanner;


public class AgendaConsole {
 
    private Agenda agenda = new Agenda();
    private Scanner scanner = new Scanner(System.in);
    
    public void inicio() {
        while (true) {
            
            System.out.println("\n ========================");
            System.out.println("\n ======   AGENDA   ======");
            System.out.println("\n ========================");
            
            System.out.println("\n (1) Adicionar contato -");
            System.out.println("\n (2) Remover contato   -");
            System.out.println("\n (3) Atualizar contato -");
            System.out.println("\n (4) Buscar contato    -");
            System.out.println("\n (5) Listar contato    -");
            System.out.println("\n (0) Sair              -\n");
            
            int escolha = scanner.nextInt();
            scanner.nextLine();
            
            switch (escolha) {
                
                case 1 -> adicionarContato();
                case 2 -> removerContato();
                case 3 -> atualizarContato();
                case 4 -> buscarContato();
                case 5 -> listarContato();
                case 0 -> System.exit(0);
                
                default -> System.out.println("digite uma opcao valida...");
            }
        }
    }
    
    private void adicionarContato() {
        
        System.out.println("\n ========================");
        System.out.println("\n ======   AGENDA   ======");
        System.out.println("\n ========================");
        
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Telefone: ");
        String telefone = scanner.nextLine();
        
        System.out.println("email: ");
        String email = scanner.nextLine();
        
        agenda.adicionarContato(new Contato (nome, telefone, email));
        System.out.println("contato adicionado...");
    }
    
    private void removerContato() {
        
        System.out.println("\n ========================");
        System.out.println("\n ======   AGENDA   ======");
        System.out.println("\n ========================");
        
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        
        if (agenda.removerContato(nome)){
            System.out.println("contato removido...");
        }
        
        else {
            System.out.println("contato nao encontrado...");
        }
    }
    
    private void atualizarContato() {
        
        System.out.println("\n ========================");
        System.out.println("\n ======   AGENDA   ======");
        System.out.println("\n ========================");
        
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Novo telefone: ");
        String telefone = scanner.nextLine();
        
        System.out.println("Novo email: ");
        String email = scanner.nextLine();
        
        if (agenda.atualizarContato(nome, telefone, email)) {
            System.out.println("contato atualizado...");
        }
        
        else {
            System.out.println("contato nao encontrado...");
        }
    }
    
    private void buscarContato() {
        
        System.out.println("\n ========================");
        System.out.println("\n ======   AGENDA   ======");
        System.out.println("\n ========================");
        
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        
        Contato contato = agenda.buscarContato(nome);
        
        if (contato != null) {
            System.out.println(contato);
        }
        
        else {
            System.out.println("contato nao encontrado...");
        }   
    }
    
    private void listarContato() {
        
        System.out.println("\n ========================");
        System.out.println("\n ======   AGENDA   ======");
        System.out.println("\n ========================");
        
        System.out.println("Lista: ");
        
        for (Contato contato: agenda.listarContatos()) {
            System.out.println(contato);
        }
    }
    
}
