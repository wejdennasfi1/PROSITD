import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashset implements IDépartement<Departement>
{
    private HashSet<Departement> hashSet=new HashSet<>();
    public void ajouterDepartement(Departement t)
    {hashSet.add(t);}
    public void supprimerDepartement(Departement t)
    {
        hashSet.remove(t);
    }
    public void displayDepartement()
    {
        for (Departement dep : hashSet){
            System.out.println(dep);
        }
    }

    public boolean rechercherDepartement(String nom)
    {for (Departement dep : hashSet){
        if (dep.nom.equals(nom)){
            return true;
        }
    }
        return false;
    }
    public boolean rechercherDepartement(Departement t)
    {
        for (Departement dep : hashSet) {
            if (dep.equals(t)) {

                return true;
            }
        }
        return false;
    }
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sortedSet = new TreeSet<>(Comparator.comparing(Departement::getId));
        for (Departement dep : sortedSet) {
            System.out.println(dep);
        }
        return sortedSet;
    }
}
