public class Passaro extends Animal {
    private Especie especie;

    public Passaro(String nome, int idade, Cliente dono, int idAnimal, float peso, Especie especie) {
        super(nome, idade, dono, idAnimal, peso);
        this.especie = especie;
    }

    @Override
    public double adicionarPrecoConsulta() {
        switch (especie) {
            case COMUM:    return 20;
            case RARA:     return 45;
            case EPICA:    return 70;
            case LENDARIA: return 100;
            default:       return 0;
        }
    }

    public Especie getEspecie() { return especie; }
    public void setEspecie(Especie especie) { this.especie = especie; }
}
