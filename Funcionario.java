public  class  Funcionario extends Pessoa {
    private int id;

    public Funcionario(String nome, String CPF, int id) {
        super(nome, CPF);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}