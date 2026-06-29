import java.util.ArrayList;

public class Cachorro extends AnimalVacina {
    public Cachorro(String nome, int idade, Cliente dono, int idAnimal, float peso, String raca, Porte porte) {
        super(nome, idade, dono, idAnimal, peso, raca, porte);
    }

    @Override
    public double adicionarPrecoConsulta() {
        return super.adicionarPrecoConsulta();
    }

    @Override
    public double adicionarPrecoInternacao(int dias) {
        return super.adicionarPrecoInternacao(dias);
    }
}
