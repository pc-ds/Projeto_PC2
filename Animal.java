public abstract class Animal {
    private String nome;
    private int idade;
    private Cliente dono;
    private int idAnimal;
    private float peso;

    public Animal(String nome, int idade, Cliente dono, int idAnimal, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.dono = dono;
        this.idAnimal = idAnimal;
        this.peso = peso;
    }

    public abstract double adicionarPrecoConsulta();

    public Cliente getDono() { return dono; }
    public int getIdade() { return idade; }
    public int getIdAnimal() { return idAnimal; }
    public String getNome() { return nome; }
    public float getPeso() { return peso; }
    public void setDono(Cliente dono) { this.dono = dono; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setIdAnimal(int idAnimal) { this.idAnimal = idAnimal; }
    public void setNome(String nome) { this.nome = nome; }
    public void setPeso(float peso) { this.peso = peso; }
}
