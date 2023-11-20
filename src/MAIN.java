public class MAIN
{
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        // Add employees
        Employe e = new Employe(1, "wejden", "nasfi", "z", 12);
        Employe em = new Employe(2, "emna","chelly", "a", 14);
        Employe emp = new Employe(3, "selim","ghazouani", "B", 7);
        Employe eml = new Employe(4, "abc","saif", "Legend", 11);

        societe.ajouterEmploye(e);
        societe.ajouterEmploye(em);
        societe.ajouterEmploye(emp);

        // Display employees
        System.out.println("List of employees: ");
        societe.displayEmploye();

        //delete employee
        System.out.println("Employees before deleting: ");
        societe.displayEmploye();
        societe.supprimerEmploye(emp);
        System.out.println("Employees after deleting: ");
        societe.displayEmploye();


        // Sort employees by id
        societe.trierEmployeParId();
        System.out.println("\nEmployees sorted by id:");
        societe.displayEmploye();

        // Sort employees by department and grade
        societe.trierEmployeParNomDépartementEtGrade();
        System.out.println("\nEmployees sorted by department:");
        societe.displayEmploye();

        //search employee using name
        boolean BobExist = societe.rechercherEmploye("Bob");
        System.out.println(BobExist);

        //search employee given in parameter
        boolean employe = societe.rechercherEmploye(em);
        System.out.println(employe);

        System.out.println("\n**********************************PROSIT10*********************************\n");
        DepartementHashset D = new DepartementHashset();
        Departement d =new Departement(1,15,"test");
        Departement d1 =new Departement(2,15,"test2");
        Departement d2 =new Departement(3,15,"test3");

        D.ajouterDepartement(d);
        D.ajouterDepartement(d1);
        D.ajouterDepartement(d2);

        //display
        D.displayDepartement();
        //delete
        D.supprimerDepartement(d2);
        D.displayDepartement();
        //search using name
         System.out.println(D.rechercherDepartement("test"));
        System.out.println(D.rechercherDepartement("test3"));
        //search by object
        System.out.println(D.rechercherDepartement(d));

    }
}
