package model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 50)
    private String nom;
    @Column(length = 50)
    private String prenom;
    @Column(length = 10)
    private String matricule;
    private String adresse;
    private int salaire;
    @Temporal(TemporalType.DATE)
    private Date datenaiss;
    @Temporal(TemporalType.DATE)
    private Date datedembauche;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;
    @JoinTable(name = "medecin_specialite",
            joinColumns =@JoinColumn(name = "medecin_id"),
            inverseJoinColumns = @JoinColumn(name = "specialite_id"))

    @ManyToMany(cascade ={CascadeType.PERSIST,CascadeType.MERGE})
    List<Specialite> specialites;




}
