package crud.entity;

public class OficeEntity {
    private int id;
    private String adres;

    public OficeEntity(int id, String adres) {
        this.id = id;
        this.adres = adres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "OficeEntity{" +
                "id=" + id +
                ", adres='" + adres + '\'' +
                '}';
    }
}
