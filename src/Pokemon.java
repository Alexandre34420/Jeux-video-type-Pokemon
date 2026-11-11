public class Pokemon { //classe Pokemon
    String nom;        //attributs
    int pointDeVie;
    int niveau;
    boolean capture;

    Pokemon (String nom, int pointDeVie, int niveau, boolean capture){     //methode constructeur
        this.nom = nom;   //this fait référence à l'objet actuel,
        // il nous permet d'accéder à l'attribut de l'objet,
        // il nous permet d'accéder à l'attribut nom
        this.pointDeVie = pointDeVie;
        this.niveau = niveau;
        this.capture = capture;
    }


    Pokemon (String nom)
    { //Surcharge, le nombre de paramètre diffère.
        this.nom = nom;
    }

    Pokemon (int pointDeVie)
    { //Surcharge, le type des paramètre diffère.
        this.pointDeVie = pointDeVie;
    }

    Pokemon (String nom, int pointDeVie)
    {
        this.nom = nom;
        this.pointDeVie = pointDeVie;
    }
    public void Capturer() { //methode capturer
        capture = true;
        System.out.println("le pokemon " + nom + " a été capturé");
    }

    public void infligerDegat (int degats){ //methode infligerDegat
        pointDeVie -= degats;

        System.out.println ("Le pokemon " + nom + " a subi " + degats + " degats");
    }
}
