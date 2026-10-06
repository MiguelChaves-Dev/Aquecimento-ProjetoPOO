import java.util.ArrayList;
public class CentralDeInformacoes {
    ArrayList<Jogador> jogadores = new ArrayList<Jogador> ();

    public boolean adicionarJogador(Jogador j) {
        for(int i = 0; i < jogadores.size();i++) {
            if (jogadores.get(i).equals(j.getCPF()) || jogadores.get(i).equals(j.getEmail())) {
                return false;
            }
        }
        jogadores.add(j);
        return true;
    }
    public ArrayList<Jogador> getTodosJogadores() {
        return jogadores;
    }

    public void setTodosOsJogadores(ArrayList<Jogador> j) {
        jogadores = j;
    }

    public Jogador recuperarJogadorPorCPF(String cpf) {
        for (int i = 0; i< jogadores.size(); i++){
            if (jogadores.get(i).equals(cpf)) {
                return jogadores.get(i);
            }
        }
        return null;
    }
    public Jogador recuperarJogadorPorEmail(String email) {
        for (int i = 0; i< jogadores.size(); i++){
            if (jogadores.get(i).equals(email)) {
                return jogadores.get(i);
            }
        }
        return null;
    }
}
