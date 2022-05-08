package amtech.at.easysped.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Truck {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String kennzeichen;
    private String fahrer;

    public Truck(String kennzeichen, String fahrer) {
        this.kennzeichen = kennzeichen;
        this.fahrer = fahrer;
    }

    public Truck() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getFahrer() {
        return fahrer;
    }

    public void setFahrer(String fahrer) {
        this.fahrer = fahrer;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Truck truck = (Truck) o;

        return id != null ? id.equals(truck.id) : truck.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", kennzeichen='" + kennzeichen + '\'' +
                ", fahrer='" + fahrer + '\'' +
                '}';
    }
}
