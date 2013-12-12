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
public class Cell {
    private final boolean isAlive;
    public Cell(boolean isAlive) {
        this.isAlive = isAlive;
    }

    boolean isAlive() {
        return isAlive;
    }
}
