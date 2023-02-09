package main;

import model.Medecin;
import model.Service;
import model.Specialite;
import service.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        try {
            IService iService = new ServiceService();
            ISpecialite iSpecialite = new SpecialiteService();
            Service s = new Service();
            s.setLibelle("TOTO");
            iService.add(s);
            iService.findAll().forEach(System.out::println);



        }catch (Exception e){

        }

    }
}
