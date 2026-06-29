import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Clinica clinica = new Clinica("Cesar Santos");
        Veterinario veterinario = new Veterinario("Pedro Cesar", "111.111.111-11", 1);
        Atendente atendente = new Atendente("Gustavo Vieira", "222.222.222-22", 2);

        int escolha = -1;
        while (escolha != 0) {
            System.out.println("\n----===MENU===----");
            System.out.println("[1] OPÇÕES ATENDENTE");
            System.out.println("[2] OPÇÕES VETERINÁRIO");
            System.out.println("[3] OPÇÕES CLÍNICA");
            System.out.println("[0] SAIR");
            escolha = sc.nextInt();
            sc.nextLine();

            int sub = -1;
            switch (escolha) {

                case 1:
                    while (sub != 0) {
                        System.out.println("\n----===ATENDENTE===----");
                        System.out.println("[1] CADASTRAR DONO");
                        System.out.println("[2] CADASTRAR ANIMAL");
                        System.out.println("[0] VOLTAR");
                        sub = sc.nextInt();
                        sc.nextLine();

                        switch (sub) {
                            case 1:
                                System.out.println("Nome: ");
                                String nome = sc.nextLine();
                                System.out.println("CPF: ");
                                String cpf = sc.nextLine();
                                System.out.println("Telefone: ");
                                String tel = sc.nextLine();
                                atendente.cadastrarDono(clinica, nome, cpf, tel);
                                System.out.println("Dono cadastrado com sucesso!");
                                break;

                            case 2:
                                System.out.println("O animal possui cartão de vacina? [sim/nao]");
                                String op = sc.nextLine();
                                System.out.println("Nome do animal: ");
                                String nomeAnimal = sc.nextLine();
                                System.out.println("Idade: ");
                                int idade = sc.nextInt(); sc.nextLine();
                                System.out.println("Peso: ");
                                float peso = sc.nextFloat(); sc.nextLine();
                                System.out.println("ID do animal: ");
                                int idAnimal = sc.nextInt(); sc.nextLine();
                                System.out.println("CPF do dono: ");
                                String cpfDono = sc.nextLine();

                                Cliente dono = null;
                                for (Cliente c : clinica.getDonos()) {
                                    if (c.getCPF().equals(cpfDono)) { dono = c; break; }
                                }
                                if (dono == null) {
                                    System.out.println("Dono não encontrado!");
                                    break;
                                }

                                if (op.equalsIgnoreCase("sim")) {
                                    System.out.println("Raça: ");
                                    String raca = sc.nextLine();
                                    System.out.println("Porte [PEQUENO/MEDIO/GRANDE]: ");
                                    String porteStr = sc.nextLine().toUpperCase();
                                    Porte porte;
                                    switch (porteStr) {
                                        case "GRANDE": porte = Porte.GRANDE; break;
                                        case "MEDIO":  porte = Porte.MEDIO;  break;
                                        default:       porte = Porte.PEQUENO; break;
                                    }
                                    AnimalVacina animal = atendente.cadastrarAnimalComVacina(nomeAnimal, idade, dono, idAnimal, peso, raca, porte);
                                    dono.getAnimais().add(animal);
                                    System.out.println("Animal cadastrado!");
                                } else {
                                    System.out.println("Espécie [COMUM/RARA/EPICA/LENDARIA]: ");
                                    String espStr = sc.nextLine();
                                    Passaro animal = atendente.cadastrarAnimalSemVacina(nomeAnimal, idade, dono, idAnimal, peso, espStr);
                                    dono.getAnimais().add(animal);
                                    System.out.println("Animal cadastrado!");
                                }
                                break;
                        }
                    }
                    sub = -1;
                    break;

                case 2:
                    while (sub != 0) {
                        System.out.println("\n----===VETERINÁRIO===----");
                        System.out.println("[1] INICIAR CONSULTA");
                        System.out.println("[2] FINALIZAR CONSULTA");
                        System.out.println("[3] ATUALIZAR CARTEIRINHA DE VACINA");
                        System.out.println("[4] INTERNAR ANIMAL");
                        System.out.println("[0] VOLTAR");
                        sub = sc.nextInt();
                        sc.nextLine();

                        switch (sub) {
                            case 1:
                                System.out.println("ID do animal: ");
                                int idA = sc.nextInt(); sc.nextLine();
                                System.out.println("Data da consulta (dd/MM/yyyy): ");
                                String dataC = sc.nextLine();
                                for (Consulta c : clinica.getConsultas()) {
                                    if (c.getAnimal().getIdAnimal() == idA && c.getData().equals(dataC)) {
                                        veterinario.iniciarConsulta(c);
                                        System.out.println("Consulta iniciada!");
                                    }
                                }
                                break;

                            case 2:
                                System.out.println("ID do animal: ");
                                int idF = sc.nextInt(); sc.nextLine();
                                System.out.println("Data da consulta (dd/MM/yyyy): ");
                                String dataF = sc.nextLine();
                                for (Consulta c : clinica.getConsultas()) {
                                    if (c.getAnimal().getIdAnimal() == idF && c.getData().equals(dataF)) {
                                        veterinario.finalizarConsulta(c);
                                        c.calcularConsulta();
                                        System.out.println("Consulta finalizada! Valor: R$" + c.getValorConsulta());
                                    }
                                }
                                break;

                            case 3:
                                System.out.println("ID do animal: ");
                                int idV = sc.nextInt(); sc.nextLine();
                                System.out.println("Data da consulta (dd/MM/yyyy): ");
                                String dataV = sc.nextLine();
                                for (Consulta c : clinica.getConsultas()) {
                                    if (c.getAnimal().getIdAnimal() == idV && c.getData().equals(dataV)) {
                                        if (c.getAnimal() instanceof AnimalVacina) {
                                            System.out.println("Nome da vacina: ");
                                            String nomeVac = sc.nextLine();
                                            System.out.println("Data da vacina: ");
                                            String dataVac = sc.nextLine();
                                            System.out.println("Dose: ");
                                            int dose = sc.nextInt(); sc.nextLine();
                                            veterinario.atualizaCarteirinha((AnimalVacina) c.getAnimal(), c, nomeVac, dataVac, dose);
                                            System.out.println("Carteirinha atualizada!");
                                        } else {
                                            System.out.println("Este animal não possui cartão de vacina.");
                                        }
                                    }
                                }
                                break;

                            case 4:
                                System.out.println("ID do animal: ");
                                int idI = sc.nextInt(); sc.nextLine();
                                System.out.println("Data da consulta (dd/MM/yyyy): ");
                                String dataI = sc.nextLine();
                                System.out.println("Dias de internação: ");
                                int dias = sc.nextInt(); sc.nextLine();
                                for (Consulta c : clinica.getConsultas()) {
                                    if (c.getAnimal().getIdAnimal() == idI && c.getData().equals(dataI)) {
                                        veterinario.internar(c, dias);
                                        System.out.println("Internação registrada.");
                                    }
                                }
                                break;
                        }
                    }
                    sub = -1;
                    break;

                case 3:
                    while (sub != 0) {
                        System.out.println("\n----===CLÍNICA===----");
                        System.out.println("[1] EXIBIR RELATÓRIO POR PERÍODO");
                        System.out.println("[2] TOTAL A RECEBER DE UM CLIENTE");
                        System.out.println("[0] VOLTAR");
                        sub = sc.nextInt();
                        sc.nextLine();

                        switch (sub) {
                            case 1:
                                System.out.println("Data inicial (dd/MM/yyyy): ");
                                String di = sc.nextLine();
                                System.out.println("Data final (dd/MM/yyyy): ");
                                String df = sc.nextLine();
                                clinica.exibirRelatorio(di, df);
                                break;

                            case 2:
                                System.out.println("CPF do cliente: ");
                                String cpfCli = sc.nextLine();
                                for (Cliente c : clinica.getDonos()) {
                                    if (c.getCPF().equals(cpfCli)) {
                                        System.out.println("Total a receber: R$" + clinica.calcularTotal(c));
                                    }
                                }
                                break;
                        }
                    }
                    sub = -1;
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}
