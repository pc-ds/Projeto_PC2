public class Passaro extends Animal {
    private Especie especie;
    
    public Passaro (String nome, int idade, Cliente dono, int idAnimal, float peso, Especie especie ) {
        super(nome, idade, dono, idAnimal, peso);
        this.especie = especie;
    }

    public double adicionarConsulta(){
        switch(especie){
            case COMUM: return 50;
            case RARA: return 75;
            case EPICA: return 100;
            case LENDARIA: return 150;
            default: return 0;
        }
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    @Override
    public void setDono(Cliente dono) {
        super.setDono(dono);
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    @Override
    public void setIdAnimal(int idAnimal) {
        super.setIdAnimal(idAnimal);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setPeso(float peso) {
        super.setPeso(peso);
    }

    @Override
    public Cliente getDono() {
        return super.getDono();
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public int getIdAnimal() {
        return super.getIdAnimal();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public float getPeso() {
        return super.getPeso();
    }

    
    
}