/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zeushias.sudokudevoir3;

/**
 * Interface d'une grille de sudoku.
 *
 * @author zeushias
 */
public interface Grille {

//    /**
//     * Caractere de case vide.
//     */
//    char EMPTY = '@';
//
//    /**
//     * Caractere possible a mettre dans la grille. pour une grille 9x9 : 1..9
//     * pour une grille 16x16: 0..9-a..f
//     */
//    char[] POSSIBLE = new char[]{'1', '2', '3', '4', '5', '6',
//        '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f'};
//
//    /**
//     * @return largeur/hauteur de la grille.
//     */
//    public int getDimension();
//
//    /**
//     * Affecte une valeur dans la grille.
//     *
//     * @param x position x dans la grille
//     * @param y position y dans la grille
//     * @param value valeur a mettre dans la case
//     * @throw IllegalArgumentException si x ou y sont hors bornes (0-8)
//     * @throw IllegalArgumentException si la valeur est interdite aux vues des
//     * autres valeurs de la grille
//     * @throw IllegalArgumentException si value n'est pas un caractere autorise
//     * ('1',...,'9')
//     */
//    public void setValue(final int x, final int y, final char value);
//
//    /**
//     * Recupere une valeur de la grille.
//     *
//     * @param x position x dans la grille
//     * @param y position y dans la grille
//     * @return valeur dans la case x,y
//     * @throw IllegalArgumentException si x ou y sont hors bornes (0-8)
//     */
//    public char getValue(final int x, final int y);
//
//    /**
//     * Test si une grille est terminee.
//     *
//     * @return true si la grille est complete
//     */
//    public boolean complete();
//
//    /**
//     * Test si une valeur est possible dans la grille par rapport a ce qu'elle
//     * contient deja.
//     *
//     * @param x position x dans la grille
//     * @param y position y dans la grille
//     * @param value valeur a mettre dans la case
//     * @return vrai/faux
//     * @throw IllegalArgumentException si x ou y sont hors bornes (0-8)
//     * @throw IllegalArgumentException si value n'est pas un caractere autorise
//     * ('1',...,'9',..)
//     */
//    public boolean possible(final int x, final int y, final char value);
    
    
    /**
     * Caractere de case vide.
     */
    char EMPTY = '@';

    /**
     * Caracteres possibles a mettre dans la grille.
     * pour une grille 9x9 : 1..9
     */
    char[] POSSIBLE = new char[]{
        '1', '2', '3', '4', '5', '6', '7', '8', '9'
    };

    /**
     * Caracteres possibles a mettre dans la grille.
     * pour une grille 16x16 : 0..9-a..f
     */
    char[] POSSIBLE_16 = new char[]{
        '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
        'a', 'b', 'c', 'd', 'e', 'f'
    };

    /**
     * Pour definir la grille sous forme de tableau a 2 dimensions.
     *
     * @param grilleTab char[9][9] contenant les valeurs
     *
     */
    void setGrille(char[][] grilleTab);

    /**
     * Permet d'avoir la dimension d'une grille Sudoku.
     *
     * @return Dimension de la grille.
     */
    int getDimension();

    /**
     * Affecte une valeur dans la grille.
     *
     * @param x position x dans la grille
     * @param y position y dans la grille
     * @param value valeur a mettre dans la grille
     * @throws IllegalArgumentException si x ou y sont hors bornes (0-8)
     * @throws IllegalArgumentException si la valeur est interdite aux vues des
     * autres valeurs de la grille.
     * @throws IllegalArgumentException si value n'est pas un caractere autorise
     * (''1', ...,'9')
     *
     */
    void setValue(int x, int y, char value) throws IllegalArgumentException;

    /**
     * Recupere une valeur de la grille.
     *
     * @param x position x dans la grille
     * @param y position y dans la grille
     * @return valeur dans la case x,y
     * @throws IllegalArgumentException si x ou y sont hors bornes (0-8)
     *
     */
    char getValue(int x, int y) throws IllegalArgumentException;

    /**
     * Teste si une grille est terminee.
     *
     * @return true si la grille est complete
     *
     */
    boolean complete();

    /**
     * Teste si une valeur est possible dans la grille par rapport a ce qu'elle
     * contient deja.
     *
     * @param x position x dans la grille
     * @param y position y dans la grille
     * @param value valeur a mettre dans la case
     * @return true si oui, false sinon
     * @throws IllegalArgumentException si la vavaleur est
     * interdite aux vues des autres valeurs de la grille
     * @throws IllegalArgumentException si value n'est pas un caractere autorise
     * (''1', ...,'9')
     *
     */
    boolean possible(int x, int y, char value) throws IllegalArgumentException;
    
}
