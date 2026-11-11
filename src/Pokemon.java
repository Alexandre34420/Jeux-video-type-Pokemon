public class Pokemon { //classe Pokemon. Une classe est un modèle de donnée qui représente
    // une entité de notre programme (Pokemon, inventaire dans minecraft, arme dans Fortnite
    // on se sert d'une classe pour créer des objets : le langage alloue de la mémoire et
    // copie colle la classe, on la remplit (initialise les attributs avec la constructeur
    // donc ce qui nous créer un objet)
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

// un constructeur initialise les attributs de la classe, il peut y avoir plusieurs constructeurs
    // s'ils sont différents en nombre de paramètre ou en type des paramètres
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
