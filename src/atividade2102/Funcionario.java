
package atividade2102;

public class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    
    public void cadastro(String name, int idade, String cargo){
        this.setCargo(cargo);
        this.setIdade(idade);
        this.setNome(name);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    

    
    
    
}
