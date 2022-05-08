package amtech.at.easysped.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trailer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String kennzeichen;
    private String aufbau;

    public Trailer(String kennzeichen, String aufbau) {
        this.kennzeichen = kennzeichen;
        this.aufbau = aufbau;
    }

    public Trailer() {
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

    public String getAufbau() {
        return aufbau;
    }

    public void setAufbau(String aufbau) {
        this.aufbau = aufbau;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trailer trailer = (Trailer) o;

        return id != null ? id.equals(trailer.id) : trailer.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Trailer{" +
                "id=" + id +
                ", kennzeichen='" + kennzeichen + '\'' +
                ", aufbau='" + aufbau + '\'' +
                '}';
    }
}
