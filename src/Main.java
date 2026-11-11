public class Main {

    public void main(String[] args) {
        Pokemon pikachu = new Pokemon("pikachu", 45, 4, false);    //objet (instance classe pikachu)
        Pokemon salameche = new Pokemon( "salameche");
        Pokemon bulbizarre = new Pokemon (50);
        Pokemon carapuce = new Pokemon ("carapuce", 43);


        pikachu.pointDeVie = 50;// à l'adresse mémoire ou est stocké le pointDeVie de pikachu,
        // cette ligne remplace le pointDeVie par 50 dans la mémoire
        carapuce.niveau = 7; // à l'adresse mémoire ou est stocké le niveau de carapuce,
        // cette ligne remplace le niveau par 7 dans la mémoire

        pikachu.pointDeVie -= 70;
        System.out.println(pikachu.pointDeVie);

        System.out.println(pikachu.capture);
        pikachu.Capturer();
        System.out.println(pikachu.capture);




        System.out.println(pikachu.pointDeVie);
        pikachu.infligerDegat(30);
        System.out.println(pikachu.pointDeVie);

        System.out.println(pikachu.nom);
        System.out.println(pikachu.niveau);
        System.out.println(pikachu.capture);

        System.out.println(salameche.nom);
        System.out.println(bulbizarre.pointDeVie);

        System.out.println(carapuce.nom);
        System.out.println(carapuce.pointDeVie);

    }
}
