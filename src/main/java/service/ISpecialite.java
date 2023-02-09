package service;

import model.Service;
import model.Specialite;

import java.util.List;

public interface ISpecialite {
    public void save(Specialite specialite);
    public List<Specialite> findAll();
    public Specialite findById(long id);

}
