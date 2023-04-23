package Homework3.Task2;

public class Good2 {
    String name;
    String country;
    Double weight;
    Integer price;
    Integer sort;

    public Good2(String name, String country, Double weight, Integer price, Integer sort) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.price = price;
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Double getWeight() {
        return weight;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Good2{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", sort=" + sort +
                '}';
    }
}
