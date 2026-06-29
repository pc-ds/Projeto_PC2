public class Atendente extends Funcionario {

    public Atendente(String nome, String CPF, int id) {
        super(nome, CPF, id);
    }

    public void cadastrarDono(Clinica clin, String nome, String CPF, String telefone) {
        Cliente c = new Cliente(nome, CPF, telefone);
        clin.addDonos(c);
    }

    public AnimalVacina cadastrarAnimalComVacina(String nome, int idade, Cliente dono, int idAnimal, float peso, String raca, Porte porte) {
        return new AnimalVacina(nome, idade, dono, idAnimal, peso, raca, porte);
    }

    public Passaro cadastrarAnimalSemVacina(String nome, int idade, Cliente dono, int idAnimal, float peso, String especieStr) {
        Especie especie;
        switch (especieStr.toUpperCase()) {
            case "RARA":     especie = Especie.RARA;     break;
            case "EPICA":    especie = Especie.EPICA;    break;
            case "LENDARIA": especie = Especie.LENDARIA; break;
            default:         especie = Especie.COMUM;    break;
        }
        return new Passaro(nome, idade, dono, idAnimal, peso, especie);
    }
}
