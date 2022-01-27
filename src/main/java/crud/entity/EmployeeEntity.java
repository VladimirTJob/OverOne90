package crud.entity;

public class EmployeeEntity {
    private int id;
    private PositionEntity position;
    private OficeEntity ofice;
    private String name;
    private String surname;
    private String dateOfB;

    public EmployeeEntity(int id, PositionEntity position, OficeEntity ofice, String name, String surname, String dateOfB) {
        this.id = id;
        this.position = position;
        this.ofice = ofice;
        this.name = name;
        this.surname = surname;
        this.dateOfB = dateOfB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PositionEntity getPosition() {
        return position;
    }

    public void setPosition(PositionEntity position) {
        this.position = position;
    }

    public OficeEntity getOfice() {
        return ofice;
    }

    public void setOfice(OficeEntity ofice) {
        this.ofice = ofice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfB() {
        return dateOfB;
    }

    public void setDateOfB(String dateOfB) {
        this.dateOfB = dateOfB;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", position=" + position +
                ", ofice=" + ofice +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfB='" + dateOfB + '\'' +
                '}';
    }
}
