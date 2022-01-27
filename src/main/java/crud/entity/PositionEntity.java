package crud.entity;

public class PositionEntity {
    private int id;
    private String name;

    public PositionEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PositionEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
