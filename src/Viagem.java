import java.time.LocalDate;

public class Viagem {
    private int Id_viagem, Preco;
    private String Origem, Destino;
    private LocalDate Data;

    public Viagem(int id_viagem, int preco, String origem, String destino, LocalDate data) {
        Id_viagem = id_viagem;
        Preco = preco;
        Origem = origem;
        Destino = destino;
        Data = data;
    }

    public int getId_viagem() {
        return Id_viagem;
    }

    public void setId_viagem(int id_viagem) {
        Id_viagem = id_viagem;
    }

    public int getPreco() {
        return Preco;
    }

    public void setPreco(int preco) {
        Preco = preco;
    }

    public String getOrigem() {
        return Origem;
    }

    public void setOrigem(String origem) {
        Origem = origem;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public LocalDate getData() {
        return Data;
    }

    public void setData(LocalDate data) {
        Data = data;
    }
}
