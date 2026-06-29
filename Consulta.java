public class Consulta {

    private double valorConsulta;
    private Motivo motivo;
    private String data;
    private int diasInternacao;
    private Veterinario veterinarioResp;
    private Animal animal;
    private boolean taPago;
    private boolean temVacina;
    private Status situacao;

    public Consulta(String data, Veterinario veterinarioResp, Animal animal, Motivo motivo) {
        this.data = data;
        this.veterinarioResp = veterinarioResp;
        this.animal = animal;
        this.motivo = motivo;
        this.temVacina = false;
        this.diasInternacao = 0;
    }

    public double calcularConsulta() {
        double valor = 0.0;

        switch (motivo) {
            case EMERGENCIA: valor += 300; break;
            case CHECK_UP:   valor += 120; break;
            case RETORNO:    valor += 80;  break;
        }

        valor += animal.adicionarPrecoConsulta();

        if (temVacina) valor += 50;

        if (diasInternacao > 0 && animal instanceof Internavel) {
            valor += ((Internavel) animal).adicionarPrecoInternacao(diasInternacao);
        }

        this.valorConsulta = valor;
        return valor;
    }

    // Pacote-privado: só Veterinario (mesmo pacote) pode setar
    void setTemVacina(boolean temVacina) { this.temVacina = temVacina; }
    void setDiasInternacao(int dias) { this.diasInternacao = dias; }

    public Status getSituacao() { return situacao; }
    public void setSituacao(Status situacao) { this.situacao = situacao; }
    public double getValorConsulta() { return valorConsulta; }
    public void setValorConsulta(double v) { this.valorConsulta = v; }
    public Motivo getMotivo() { return motivo; }
    public void setMotivo(Motivo motivo) { this.motivo = motivo; }
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
    public int getDiasInternacao() { return diasInternacao; }
    public Veterinario getVeterinarioResp() { return veterinarioResp; }
    public void setVeterinarioResp(Veterinario v) { this.veterinarioResp = v; }
    public Animal getAnimal() { return animal; }
    public void setAnimal(Animal animal) { this.animal = animal; }
    public boolean getTaPago() { return taPago; }
    public void setTaPago(boolean taPago) { this.taPago = taPago; }
    public boolean isTemVacina() { return temVacina; }
}
