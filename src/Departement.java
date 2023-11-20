public class Departement
{
    int id ;
    int nbr;
    String nom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbr() {
        return nbr;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Departement(int id, int nbr, String nom) {
        this.id = id;
        this.nbr = nbr;
        this.nom = nom;
    }
    public Departement(){}
    public String toString()
    {
        return "Departement\n od :"+id+"\n nbr des employés:"+nbr+"\n nom departement:"+nom;
    }
    public boolean equals(Object o)
    {
        if(o instanceof Departement e)
        {
            return this.id==e.getId() &&this.nom.equals(e.getNom());
        }
        return false ;
    }
}
