import java.util.ArrayList;

public class Gato extends AnimalVacina {
    public Gato(String nome, int idade, Cliente dono, int idAnimal, float peso, String raca, Porte porte) {
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
