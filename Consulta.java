public class Consulta {

    private double valorConsulta;
    private Motivo motivo;
    private String data;
    private int diasInternacao;
    private Veterinario veterinarioResp;
    private Animal animal;
    private boolean taPago;
    private Status situacao;

   

    public Consulta(String data, Veterinario veterinarioResp, Animal animal, Motivo motivo){
        this.motivo = motivo;
        this.data = data;
        this.animal = animal;
        this.veterinarioResp = veterinarioResp;
    }

    public double calcularConsulta() {
        double valor = 0.0;

        switch (motivo) {
            case EMERGENCIA: valor += 300; break;
            case CHECK_UP:   valor += 120; break;
            case RETORNO:    valor += 80;  break;
        }

        if (animal instanceof AdicionalPreco) {
            valor += ((AdicionalPreco) animal).adicionarConsulta();
        }

        this.valorConsulta = valor;
        return valor;
    }


    public Status getSituacao() {
        return situacao;
    }

    public void setSituacao(Status situacao) {
        this.situacao = situacao;
    }
    public double getValorConsulta() {
        return valorConsulta;
    }
    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
    public Motivo getMotivo() {
        return motivo;
    }
    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public int getDiasInternacao() {
        return diasInternacao;
    }
    public void setDiasInternacao(int diasInternacao) {
        this.diasInternacao = diasInternacao;
    }
    public Veterinario getVeterinarioResp() {
        return veterinarioResp;
    }
    public void setVeterinarioResp(Veterinario veterinarioResp) {
        this.veterinarioResp = veterinarioResp;
    }
    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public boolean getTaPago() {
        return taPago;
    }
    public void setTaPago(boolean taPago) {
        this.taPago = taPago;
    } 

}
