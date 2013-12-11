package pl.maikeru.cgol.sample;

/**
 *
 * @author maikeru
 */
public class WrongGame {
    public final int size = 50;
    Boolean[][] state = new Boolean[size][size];

    public WrongGame() {
        resetState();
    }
    
    
    
    
    public Boolean[][] toArray() {
        return state;
    }

    
    public void nextState() {
        for (int i = 0; i < 10; i++) {
            state[getRandomPosition()][getRandomPosition()] = getRandomBoolean();
        }
    }
    
    
    public void resetState()
    {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                state[i][j] = getRandomBoolean();
            }
        }
    }
    
    private boolean getRandomBoolean()
    {
        return Math.random() < 0.5;
    }
    
    private int getRandomPosition()
    {
        return (int) (Math.random() * size);
    }
}
