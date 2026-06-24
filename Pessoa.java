public abstract class Pessoa  {
    private String nome;
    private String CPF;

    public Pessoa(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public String getName() {
        return nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setName(String name) {
        this.nome = name;
    }
    
    
}