package poo.arthur.introducao;

public enum ColorEnum {
    BLACK("black","preto"),WHITE("white","branco");

    public String color;
    public String cor;
  private ColorEnum(String color, String cor){

            this.color = color;
            this.cor = cor;
    }

    public String getColor(){
      return this.color;
    }

    public String getCor(){
      return this.cor;
    }
}
