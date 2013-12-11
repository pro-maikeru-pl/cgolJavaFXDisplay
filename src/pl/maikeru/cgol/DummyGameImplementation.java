package pl.maikeru.cgol;
/**
 *
 * @author maikeru
 */
public class DummyGameImplementation implements Playable{
    private final int size = 50;
    Boolean[][] state = new Boolean[size][size];

    public DummyGameImplementation() {
        resetState();
    }
    
    
    
    @Override
    public Boolean[][] toArray() {
        return state;
    }

    @Override
    public void nextState() {
        for (int i = 0; i < 10; i++) {
            state[getRandomPosition()][getRandomPosition()] = getRandomBoolean();
        }
    }
    
    @Override
    public void resetState()
    {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                state[i][j] = false;
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
