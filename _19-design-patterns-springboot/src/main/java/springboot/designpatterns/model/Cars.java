package springboot.designpatterns.model;

import javax.persistence.*;

@Entity
@Table(name = "tab_cars")
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(length = 200,nullable = false)
    private String modelo;
    @Column(length = 200,nullable = false)
    private String quilometragem;
    @Column(length = 200,nullable = false)
    private int ano;
    @Column(length = 200,nullable = false)
    private String placa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(String quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", quilometragem='" + quilometragem + '\'' +
                ", ano=" + ano +
                ", placa='" + placa + '\'' +
                '}';
    }
}
