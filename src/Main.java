import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Persistencia persistencia = new Persistencia();
        CentralDeInformacoes central = persistencia.recuperarCentral();
        boolean continua = false;
        while (!continua){
            System.out.print("1-Novo Jogador" +
                    "\n2-Listar todos os Jogadores" +
                    "\n3-Exibir Informações de um Jogador Específico" +
                    "\nS-Sair"+
                    "\nOpção:");
            String op = input.nextLine();
            switch (op){
                case "1":
                    System.out.print("Insira o nome do Jogador: ");
                    String nome = input.nextLine();
                    System.out.println("Insira o sexo do Jogador (M/F):");
                    String sexo = input.nextLine();
                    Sexo sexoJogador;
                    if (sexo.equals("M")){
                        sexoJogador = Sexo.MASCULINO;
                    } else{
                        sexoJogador = Sexo.FEMININO;
                    }
                    System.out.print("Insira o CPF do Jogador: ");
                    String cpf =  input.nextLine();
                    System.out.print("Insira o Email do Jogador: ");
                    String email = input.nextLine();
                    Jogador novoJogador = new Jogador(nome, sexoJogador, cpf, email);
                    if (central.adicionarJogador(novoJogador)){
                        persistencia.salvarCentral(central);
                        System.out.println("Jogador adicionado com sucesso!");
                    } else {
                        System.out.println("Jogador com CPF repetido!");
                    }
                    break;
                case "2":
                    central = persistencia.recuperarCentral();
                    for (Jogador j : central.getTodosJogadores()){
                        System.out.println(j.toString());
                    }
                    break;
                case "3":
                    central = persistencia.recuperarCentral();
                    System.out.println("Insira o CPF do Jogador que você deseja procurar: ");
                    String cpfProcura =  input.nextLine();
                    boolean encontrado = false;
                    for (Jogador j : central.getTodosJogadores()){
                        if (cpfProcura.equals(j.getCPF())){
                            System.out.println("Nome: " + j.getNome());
                            System.out.println("Sexo: " +  j.getSexo());
                            System.out.println("CPF: " + j.getCPF());
                            System.out.println("Email: " + j.getEmail());
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado){
                        System.out.println("Jogador não encontrado!");
                    }
                    break;
                case "S":
                    System.out.println("Encerrando...");
                    continua = true;
            }
        }
    }
}