package solveur;

/**
 *
 * Interface pour l'impl�mentation d'un solveur.
 *
 * @author DANON Kodzo Apélété
 * @author DEGUE Akouvi Mireille
 *
 */
public interface ISolveur {

    /**
     * Teste la validit� de la grille.
     *
     * @return true si la grille est valide, false sinon
     */
    boolean verifierGrille();

    /**
     * R�soud la grille pass�e en param�tre.
     *
     * @throws IllegalArgumentException si la grille � r�soudre n'est pas
     * valable ou si aucune solution n'a pu �tre calcul�e
     * @return true si une solution est disponible, false sinon
     */
    boolean resoudre();

    /**
     * Verifie si la grille est r�solue.
     *
     * @throws IllegalArgumentException si la grille non valide
     * @return true si la grille est resolue, false sinon
     */
    boolean resolu();

    /**
     * Affiche la solution trouv�e � la grille.
     */
    void afficherSolution();
}
