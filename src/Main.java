public class Main {
    public static void main(String[] args) {
        Persistencia persistencia = new Persistencia();
        CentralDeInformacoes centralRec = persistencia.recuperarCentral();
        for(Jogador j : centralRec.getTodosJogadores()){
            System.out.println(j.toString());
        }
    }
}