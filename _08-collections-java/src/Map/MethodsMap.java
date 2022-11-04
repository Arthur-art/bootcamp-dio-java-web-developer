package Map;

import java.util.*;

public class MethodsMap {

    /*
        modelo = gol - consumo = 14,4
        modelo = uno - consumo = 15,4
        modelo = mob - consumo = 16,4
        modelo = hb20 - consumo = 14,5
        modelo = kwid - consumo = 15,6
     */

    public static void main(String[] args) {
            Car car1 = new Car("gol",14.4);
            Car car2 = new Car("uno",15.4);
            Car car3 = new Car("mob",16.4);
            Car car4 = new Car("hb20",14.5);
            Car car5 = new Car("kwid",15.6);

        List<Car> cars = new ArrayList<>(){{
           add(car1);
           add(car2);
           add(car3);
           add(car4);
           add(car5);
        }};

        Map<String, Double> carrosMap = new HashMap<>(){{
            put("gol",14.4);
            put("uno",15.4);
            put("mob",16.4);
            put("hb20",14.5);
            put("kwid",15.6);
        }};

        System.out.println("Substituindo o consumo do gol por 15.17");
        carrosMap.put("gol",15.7);

        System.out.println("Confira se o modelo tukson esta no array: "+ carrosMap.containsKey("tucson"));

        System.out.println("Exiba os modelos");
        Set<String> modelos = carrosMap.keySet();
        System.out.println(modelos);

        Collection<Double> consumo = carrosMap.values();
        System.out.println(consumo);

        System.out.println("Exiba o modelo mais economico");
        Double min = Collections.min(carrosMap.values());
        Double max = Collections.max(carrosMap.values());

        Set<Map.Entry<String, Double>> entries = carrosMap.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries
             ) {
            if(entry.getValue().equals(min)){
                modeloMaisEficiente = entry.getKey();
            }
        }
        System.out.println(modeloMaisEficiente);

        System.out.println("Exiba a soma dos consumos");
        Double consumoSum = 0.0;
        Iterator<Double> iterator = carrosMap.values().iterator();
        while (iterator.hasNext()){
            Double next = iterator.next();
            consumoSum += next;
        }
        System.out.println(consumoSum);

        System.out.println("Remova elementos com consumo igual a 15.7");
        Iterator<Double> iterator1 = carrosMap.values().iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next == 15.7){
                iterator1.remove();
            }
        }
        System.out.println(carrosMap);

        System.out.println("Organize carros em ordem alfabetica");
        Map<String,Double> carrosMap2 = new TreeMap<>(carrosMap);
        System.out.println(carrosMap2);
    }

}

class Car{
    private String modelo;
    private Double consumo;

    public Car(String modelo, Double consumo) {
        this.modelo = modelo;
        this.consumo = consumo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelo='" + modelo + '\'' +
                ", consumo='" + consumo + '\'' +
                '}';
    }
}
