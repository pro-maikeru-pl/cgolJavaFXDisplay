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
    private final int size;
    public SampleGame(int size) {
        this.size = size;
    }

    Boolean[][] asArray() {
        Boolean[][] result = new Boolean[size][size];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = false;
            }
        }
        return result;
    }
}
