package pl.maikeru.cgol.sample;

/**
 *
 * @author maikeru
 */
public class SampleGame {
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

    public Boolean[][] toArray() {
        return representation;
    }
}
