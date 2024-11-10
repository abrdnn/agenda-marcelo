package agenda.marcelo;


public class Contato {
    
    private String email;
    private String telefone;
    private String nome;
    
    
    //construtor da classe
    public Contato (String email, String telefone, String nome) {
        this.email = email;
        this.telefone = telefone;
        this.nome = nome;
    }
    
    //get e set
    public String getEmail() {
        return email;
    }
    public void setEmail (String email) {
        this.email = email;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    //metodo toString
    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email;
    }
    
}
