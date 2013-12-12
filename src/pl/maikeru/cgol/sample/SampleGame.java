/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.maikeru.cgol.sample;

/**
 *
 * @author maikeru
 */
class SampleGame {
    private final Cell[][] cells;
    private final Boolean[][] representation;

    public SampleGame(int size, CellFactory cf) {
        cells = new Cell[size][size];
        representation = new Boolean[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = cf.createDead();
                representation[i][j] = cells[i][j].isAlive();
            }
        }
    }

    Boolean[][] asArray() {
        return representation;
    }
}
