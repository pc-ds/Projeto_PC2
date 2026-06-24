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

    @Override
    public void setCPF(String CPF) {
        super.setCPF(CPF);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(oame);
    }

    @Override
    public String getCPF() {
        return super.getCPF();
    }

    @Override
    public String getName() {
        return super.getName();
    }
    
    
}