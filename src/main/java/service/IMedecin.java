package service;

import model.Medecin;

import java.util.List;

public interface IMedecin {
    public void save(Medecin medecin);
    public List<Medecin> findAll();

}
