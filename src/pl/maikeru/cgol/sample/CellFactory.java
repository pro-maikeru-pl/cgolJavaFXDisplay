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
public class CellFactory {

    Cell createDead() {
        return new Cell(false);
    }

    Cell createAlive() {
        return new Cell(true);
    }

}
