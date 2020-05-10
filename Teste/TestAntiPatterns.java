import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;


public class TestAntiPatterns {

    private static Viagem viagem;
    private static Marcacao marcacao;
    private static Cliente cliente;
    private static Agencia agencia;

    @BeforeAll
    static void initialize() {
    }


    @Test
    public void RegistoCliente() {
        cliente = new Cliente(1, "Luis", "968066043");
        Agencia.RegistarCliente(cliente);
    }


    @Test
    public void testViagem() {
        viagem.setId_viagem(3);
        assertEquals(3, viagem.getId_viagem());
    }


    @Test
    public void NomeCliente() {
        cliente = new Cliente(4, "Laura", "913344565");
        cliente.setNome("Laurita");
        assertEquals("Laurita", cliente.getNome());
    }


    @Test
    void VerificarvariavelAgencia() {
        Agencia privateObject = new Agencia("BoasViagens", "Viseu", "232456378");

        Field privateStringField = null;
        try {
            privateStringField = Agencia.class.getDeclaredField("Localizacao");
        } catch (NoSuchFieldException ex) {
            ex.printStackTrace();
        }
        privateStringField.setAccessible(true);
        String fieldValue = null;
        try {
            fieldValue = (String) privateStringField.get(privateObject);
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }

    }

    @Test
    public void VerificaViagem(){
        agencia = new Agencia("ViagensTradicionais","Lisboa", "243556765");
        viagem = new Viagem(20,30,"Portugal", "Franca", LocalDate.now());
        agencia.AdicionaViagem(viagem);
        assertEquals(20, viagem.getId_viagem());
    }


}
