package web.model;

public class Car {
    private Integer id;
    private String model;
    private String color;
    private Integer series;

    public Car() {
    }

    public Car(String model, String color, Integer series) {
        this.model = model;
        this.color = color;
        this.series = series;
    }

    public Integer getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Integer getSeries() {
        return series;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
