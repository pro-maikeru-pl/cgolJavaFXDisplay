package pl.maikeru.cgol.sample;

/**
 *
 * @author maikeru
 */
public class SampleGame {
    private final Cell[][] cells;
    private final Boolean[][] representation;

    private final int size;
    private final CellFactory cf;

    public SampleGame(int size, CellFactory cf) {
        cells = new Cell[size][size];
        representation = new Boolean[size][size];
        this.size = size;
        this.cf = cf;
        resetGame();
    }


    public Boolean[][] toArray() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                representation[i][j] = cells[i][j].isAlive();
            }
        }
        return representation;
    }


    private void resetGame() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = cf.createDead();
                representation[i][j] = cells[i][j].isAlive();
            }
        }
    }

    void nextStage() {
        
    }

    void modifyCell(int x, int y, boolean isAlive) {
        cells[x][y] = (isAlive) ? cf.createAlive() : cf.createDead();
    }
}
