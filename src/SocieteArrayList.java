import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe> {

    List<Employe> list = new ArrayList<>();


    @Override
    public void ajouterEmploye(Employe employe) {
        list.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : list) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return list.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        list.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe employe : list) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId() {
        Comparator<Employe> employeComparator = Comparator.comparingInt(Employe::getId);
        list.sort(employeComparator);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        list.sort(Comparator.comparing(Employe::getNomD));
        for (Employe employe : list){
            System.out.println(employe);
        }
    }
}