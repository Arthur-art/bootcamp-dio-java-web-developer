package one.digital.innovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class AssumptionsTeste {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "Arthur")
    void validarSomenteSeOUserForArthur(){
        Assertions.assertEquals(10, 5+3);
    }
}
