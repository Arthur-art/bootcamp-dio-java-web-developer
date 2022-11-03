package springbootdatajpa.app.model;

import javax.persistence.*;

@Entity
@Table(name = "tab_cars")
public class Carros {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(length = 50, nullable = false)
    private String modelo;
    @Column(length = 20, nullable = false)
    private String placa;
    @Column(nullable = false)
    private double quilometros;


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getQuilometros() {
        return quilometros;
    }

    public void setQuilometros(double quilometros) {
        this.quilometros = quilometros;
    }

    @Override
    public String toString() {
        return "Carros{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", quilometros=" + quilometros +
                '}';
    }
}
