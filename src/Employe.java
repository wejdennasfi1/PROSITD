public class Employe
{
    int id;
    String nom;
    String prenom;
    String nomD;
    int grade ;
    public Employe(){}

    public Employe(int id, String nom, String prenom, String nomD, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomD = nomD;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomD() {
        return nomD;
    }

    public int getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNomD(String nomD) {
        this.nomD = nomD;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public String toString()
    {
        return "Employé\n id:"+id+"\nnom:"+nom+"\nprenom:"+prenom+"\nnom departement :"+nomD+"\ngrade:"+grade;
    }
    public boolean equals(Object o)
    {
        if(o instanceof Employe e)
        {
            return this.id==e.getId() &&this.nom.equals(e.getNom());
        }
        return false ;
    }
}
