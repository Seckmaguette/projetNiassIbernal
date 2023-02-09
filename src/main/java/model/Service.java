package model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
//@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 50)
    private String libelle;

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", libelle='" + libelle +

                '}';
    }

    @OneToMany(mappedBy = "service")
    List<Medecin> medecins ;
    @OneToMany(mappedBy = "service")
    List<Specialite> specialites;

}
