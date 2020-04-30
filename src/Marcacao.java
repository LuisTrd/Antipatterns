import java.time.LocalDate;
import java.time.LocalDateTime;

public class Marcacao {
    private Cliente Utilizador;
    private Viagem Viagem;
    private int Id_marcacao;
    private LocalDate Hora;

    public Marcacao(Cliente utilizador, Viagem viagem, int id_marcacao, LocalDate hora) {
        Utilizador = utilizador;
        Viagem = viagem;
        Id_marcacao = id_marcacao;
        Hora = hora;
    }

    public Cliente getUtilizador() {
        return Utilizador;
    }

    public void setUtilizador(Cliente utilizador) {
        Utilizador = utilizador;
    }

    public Viagem getViagem() {
        return Viagem;
    }

    public void setViagem(Viagem viagem) {
        Viagem = viagem;
    }

    public int getId_marcacao() {
        return Id_marcacao;
    }

    public void setId_marcacao(int id_marcacao) {
        Id_marcacao = id_marcacao;
    }

    public LocalDate getHora() {
        return Hora;
    }

    public void setHora(LocalDate hora) {
        Hora = hora;
    }
}
