public class Pokemon { //classe Pokemon
    String nom;        //attributs
    int pointDeVie;
    int niveau;
    boolean capture;

    Pokemon (String initNom, int initpointDeVie, int initNiveau, boolean initCapturer){     //methode constructeur
        nom = initNom;
        pointDeVie = initpointDeVie;
        niveau = initNiveau;
        capture = initCapturer;
    }

    Pokemon (String initNom) { //Surcharge, le nombre de paramètre diffère.
        nom = initNom;
    }

    Pokemon (int initPointDeVie) { //Surcharge, le type des paramètre diffère.
        pointDeVie = initPointDeVie;
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
