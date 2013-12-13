package pl.maikeru.cgol.sample;

import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SampleGameWithOneCellShould {
    private SampleGame game;
    private CellFactory cf;
    private Cell deadCell;
    private Cell aliveCell;
    
    
    @Test
    public void haveDeadCellAtNextStage()
    {
        game = new SampleGame(1, cf);

        game.nextStage();

        Boolean[][] expectedRepresentation = {{false}};
        assertArrayEquals(expectedRepresentation, game.toArray());
    }


    @Before
    public void setUp()
    {
        deadCell = mock(Cell.class);
        when(deadCell.isAlive()).thenReturn(false);

        aliveCell = mock(Cell.class);
        when(aliveCell.isAlive()).thenReturn(true);

        cf = mock(CellFactory.class);
        when(cf.createDead()).thenReturn(deadCell);
        
    }
}
