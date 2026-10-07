import java.util.ArrayList;
public class CentralDeInformacoes {
    ArrayList<Jogador> jogadores = new ArrayList<Jogador> ();
    ArrayList<Palavra> palavras = new ArrayList<Palavra>();

    public ArrayList<Jogador> getTodosJogadores() {
        return jogadores;
    }

    public void setTodosJogadores(ArrayList<Jogador> j) {
        jogadores = j;
    }

    public boolean adicionarJogador(Jogador j) {
        for(int i = 0; i < jogadores.size();i++) {
            if (jogadores.get(i).getCPF().equals(j.getCPF()) || jogadores.get(i).getEmail().equals(j.getEmail())) {
                return false;
            }
        }
        jogadores.add(j);
        return true;
    }

    public Jogador recuperarJogadorPorCPF(String cpf) {
        for (int i = 0; i< jogadores.size(); i++){
            if (jogadores.get(i).getCPF().equals(cpf)) {
                return jogadores.get(i);
            }
        }
        return null;
    }
    public Jogador recuperarJogadorPorEmail(String email) {
        for (int i = 0; i< jogadores.size(); i++){
            if (jogadores.get(i).getEmail().equals(email)) {
                return jogadores.get(i);
            }
        }
        return null;
    }

    public ArrayList<Palavra> getPalavras() {
        return palavras;
    }

    public boolean adicionarPalavra(Palavra p){
        for(int i = 0; i < palavras.size();i++){
            if(palavras.get(i).getPalavra().equals(p.getPalavra())){
                return false;
            }
        }
        palavras.add(p);
        return true;
    }

    public Palavra recuperarPalavra(String palavra){
        for (int i = 0;  i< palavras.size(); i++){
            if (palavras.get(i).getPalavra().equals(palavra)){
                return palavras.get(i);
            }
        }
        return null;
    }

}
