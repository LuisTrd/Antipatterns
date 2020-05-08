import java.time.LocalDate;
import java.util.ArrayList;

public class Agencia {
    private static volatile Agencia instance;
    private ArrayList<Cliente> Lista_clientes = new ArrayList<>();
    private ArrayList<Viagem> Lista_viagens = new ArrayList<>();
    private ArrayList<Marcacao> Lista_marcacoes = new ArrayList<>();
    private String Nome;
    private String Localizacao;
    private String Telemovel;

    public Agencia(String nome, String localizacao, String telemovel) {
        this.Nome = nome;
        this.Localizacao = localizacao;
        this.Telemovel = telemovel;

        for( int i=0; i<15; i++) {
            Cliente cliente = new Cliente(i, "Luis Trindade Lopes", "963423768");
        }
    }

    public void AdicionaViagem(Viagem Viagem){
        Lista_viagens.add(Viagem);
    }

    public void RemoverViagem(Viagem Viagem){
        Lista_viagens.remove(Viagem);
    }

    public static Agencia getInstance(){
        if (instance == null) {
            synchronized (Agencia.class){
                if (instance == null) {
                    instance = new Agencia( " BotaFogo", "Viseu", "232456312");
                }
            }
        }
        return instance;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getLocalizacao() {
        return Localizacao;
    }

    public void setLocalizacao(String localizacao) {
        Localizacao = localizacao;
    }

    public String getTelemovel() {
        return Telemovel;
    }

    public void setTelemovel(String telemovel) {
        Telemovel = telemovel;
    }
    public synchronized void RegistarCliente (Cliente Cliente) {
        if (Lista_clientes.contains(Cliente)) {
            System.out.println("Utilizador com registo");
        } else {
            Lista_clientes.add(Cliente);
        }
    }
    public synchronized Marcacao MarcarViagem (Viagem Viagem, Cliente Cliente,  LocalDate Hora) {
        if (Lista_viagens.contains(Viagem)){
            System.out.println("Não existe Viagem");
        }

        else if (Lista_clientes.contains(Cliente)){
            System.out.println("Não existe registo do Utilizador");
        }
        else{
            Marcacao Marca_Viagem = new Marcacao(Cliente, Viagem, LocalDate.now());
            Lista_marcacoes.add(Marca_Viagem);
            return Marca_Viagem;
        }
        return null;
    }

}


