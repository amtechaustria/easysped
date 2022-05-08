package amtech.at.easysped.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String ladestelle;
    private String entladestelle;

    public Route(String ladestelle, String entladestelle) {
        this.ladestelle = ladestelle;
        this.entladestelle = entladestelle;
    }

    public Route() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLadestelle() {
        return ladestelle;
    }

    public void setLadestelle(String ladestelle) {
        this.ladestelle = ladestelle;
    }

    public String getEntladestelle() {
        return entladestelle;
    }

    public void setEntladestelle(String entladestelle) {
        this.entladestelle = entladestelle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Route route = (Route) o;

        return id != null ? id.equals(route.id) : route.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", ladestelle='" + ladestelle + '\'' +
                ", entladestelle='" + entladestelle + '\'' +
                '}';
    }
}
