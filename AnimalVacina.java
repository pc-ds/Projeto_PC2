import java.util.ArrayList;

public class AnimalVacina extends Animal implements Internavel {
    private String raca;
    private ArrayList<Vacina> cartao;
    private Porte porte;

    public AnimalVacina(String nome, int idade, Cliente dono, int idAnimal, float peso, String raca, Porte porte) {
        super(nome, idade, dono, idAnimal, peso);
        this.raca = raca;
        this.porte = porte;
        this.cartao = new ArrayList<>();
    }

    @Override
    public double adicionarPrecoConsulta() {
        switch (porte) {
            case PEQUENO: return 50;
            case MEDIO:   return 75;
            case GRANDE:  return 100;
            default:      return 0;
        }
    }

    @Override
    public double adicionarPrecoInternacao(int dias) {
        return dias * 75.0;
    }

    public ArrayList<Vacina> getCartao() { return cartao; }
    public void setCartao(ArrayList<Vacina> cartao) { this.cartao = cartao; }
    public Porte getPorte() { return porte; }
    public void setPorte(Porte porte) { this.porte = porte; }
    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }
}
