import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Clinica clinica = new Clinica("Cesar Santos");
        Veterinario veterinario = new Veterinario("Pedro Cesar", "111.111.111-11", 1);
        Atendente atendente = new Atendente ("Gustavo Vieira", "222.222.222-22", 2);
        int escolha = -1;
        while (escolha != 0) {
        System.out.println("----===MENU===----");
        System.out.println("[1] OPÇÕES ATENDENTE");
        System.out.println("[2] OPÇÕES VETERINÁRIO");
        System.out.println("[3] OPÇÕES CLINICA");
        System.out.println("[0] SAIR");
        escolha = sc.nextInt();
        int escolha1 = -1;
        int escolha2;
        switch (escolha) {
            case 1:
                while (escolha1 != 0) {
                System.out.println("----===ATENDENTE===----");
                System.out.println("[1] CADASTRAR DONO");
                System.out.println("[2] CADASTRAR ANIMAL");
                System.out.println("[0] SAIR");
                escolha2 = sc.nextInt();
                switch (escolha2) {
                  case 1:
                        System.out.println("----===CADASTRO DONO===---- ");
                        sc.nextLine(); // limpa o buffer
                        System.out.println("Nome: ");
                        String nome = sc.nextLine();
                        System.out.println("CPF: ");
                        String CPF = sc.nextLine();
                        System.out.println("Telefone: ");
                        String telefone = sc.nextLine(); 
                        atendente.cadastrarDono(clinica, nome, CPF, telefone); // salva o retorno
                        System.out.println("Dono cadastrado com sucesso!");
                        break;
                   case 2:
                        System.out.println("----===CADASTRO ANIMAL===----");
                        sc.nextLine(); 

                        System.out.println("O animal possui cartão de vacina? [sim/nao]");
                        String op = sc.nextLine();

                        System.out.println("Nome do animal: ");
                        String nomeAnimal = sc.nextLine();

                        System.out.println("Idade: ");
                        int idade = sc.nextInt();
                        sc.nextLine(); 

                        System.out.println("Peso: ");
                        float peso = sc.nextFloat();
                        sc.nextLine(); // limpa buffer após nextFloat

                        System.out.println("ID do Animal: ");
                        int idAnimal = sc.nextInt();
                        sc.nextLine(); // limpa buffer

                        // Buscar dono pelo CPF
                        System.out.println("CPF do dono: ");
                        String cpfDono = sc.nextLine();
                        Cliente dono = null;
                        for (Cliente c : clinica.getDonos()) {
                            if (c.getCPF().equals(cpfDono)) {
                                dono = c;
                                break;
                            }
                        }
                        if (dono == null) {
                            System.out.println("Dono não encontrado! Cadastre o dono primeiro.");
                            break;
                        }

                        if (op.equalsIgnoreCase("sim")) {
                            System.out.println("Raça: ");
                            String raca = sc.nextLine();

                            System.out.println("Porte: [GRANDE / MEDIO / PEQUENO]");
                            String porteStr = sc.nextLine();
                            Porte porte;
                            if (porteStr.equalsIgnoreCase("GRANDE")) porte = Porte.GRANDE;
                            else if (porteStr.equalsIgnoreCase("MEDIO")) porte = Porte.MEDIO;
                            else porte = Porte.PEQUENO;

                            AnimalVacina animal = atendente.cadastrarAnimalComVacina(nomeAnimal, idade, dono, idAnimal, peso, raca, porte);
                            dono.getAnimais().add(animal);
                            System.out.println("Animal cadastrado com sucesso!");

                        } else if (op.equalsIgnoreCase("nao")) {
                            System.out.println("Espécie: ");
                            String especie = sc.nextLine();

                            Passaro animal = atendente.cadastrarAnimalSemVacina(nomeAnimal, idade, dono, idAnimal, peso, especie);
                            dono.getAnimais().add(animal);
                            System.out.println("Animal cadastrado com sucesso!");
                        } else {
                            System.out.println("Opção inválida!");
                        }
                        break;
                        
                    default:
                       System.out.println("OPÇÃO INCORRETA! DIGITE UMA DAS OPÇÕES ACIMA");
                }
                }
                break;
            case 2:
                 while (escolha1 != 0) {
                System.out.println("----===VETERINARIO===----");
                System.out.println("[1] REGISTRAR CONSULTA");
                System.out.println("[2] ATUALIZAR CARTEIRA DE VACINA");
                System.out.println("[0] SAIR");
                escolha2 = sc.nextInt();
                    switch (escolha2) {
                        case 1:
                            System.out.println("ID do Animal:");
                            int idAnimal = sc.nextInt();
                            System.out.println("Data da consulta:");
                            String data = sc.nextLine();

                            for (Consulta c : clinica.getConsultas()) {
                            if (c.getAnimal().getIdAnimal() == idAnimal && c.getData().equalsIgnoreCase(data)) {
                                veterinario.iniciarConsulta(c);
                                System.out.println("Consulta Iniciada");
                                }
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
                break;

            case 3:
                while(escolha1 != 0) {
                System.out.println("----===CLINICA===----");
                System.out.println("[1] TOTAL ARRECADO");
                System.out.println("[2] CONSULTAS FEITAS");
                System.out.println("[2] ANIMAIS ATENDIDOS");
                System.out.println("[0] SAIR");
                }
                break;
            default:
                System.out.println("OPÇÃO INCORRETA! DIGITE UMA DAS OPÇÕES ACIMA");
        }
               
        
    }
}
}