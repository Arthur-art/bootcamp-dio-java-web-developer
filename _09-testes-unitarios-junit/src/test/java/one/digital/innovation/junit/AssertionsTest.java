package one.digital.innovation.junit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
    @Test
    void validarLancamento(){

        int[] primeiroLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {-1,5,2,6,7};
        int[] terceiroLancamento = {10,20,30,40,50};

        assertArrayEquals(primeiroLancamento, terceiroLancamento);
      //  assertNotEquals(primeiroLancamento, terceiroLancamento);
    }
}
