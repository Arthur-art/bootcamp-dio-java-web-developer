package springboot.springbootintroducao;

import org.springframework.stereotype.Component;

@Component
public class Calcular {

    public int sum(int num1, int num2){
        return num1 + num2;
    }
}
