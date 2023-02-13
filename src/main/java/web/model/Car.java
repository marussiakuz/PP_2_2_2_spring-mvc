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

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }
}
