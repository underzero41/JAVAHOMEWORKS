package Homework3.Task1;

public class Good {
    String name;
    Double price;
    String sort;
    Integer category;

    public Good(String name, Double price, String sort, Integer category) {
        this.name = name;
        this.price = price;
        this.sort = sort;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getSort() {
        return sort;
    }

    public Integer getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", sort='" + sort + '\'' +
                ", category=" + category +
                '}';
    }
}
