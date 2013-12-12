package pl.maikeru.cgol.sample;

import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SampleGameShould {
    private SampleGame game;
    private CellFactory cf;
    
    
    @Test
    public void returnBooleanRepresentationOfCurrentState()
    {
        when(cf.createDead()).thenReturn(new Cell(false));
        game = new SampleGame(1, cf);
        Boolean[][] expectedRepresentation = {{false}};

        assertArrayEquals(expectedRepresentation, game.toArray());
    }


    @Test
    public void returnBooleanRepresentationOfCurrentState2()
    {
        when(cf.createDead())
                .thenReturn(new Cell(true)).thenReturn(new Cell(false))
                .thenReturn(new Cell(true)).thenReturn(new Cell(true));
        game = new SampleGame(2, cf);
        Boolean[][] expectedRepresentation = {
            {true, false},
            {true, true}
        };

        assertArrayEquals(expectedRepresentation, game.toArray());

    }

    @Before
    public void setUp()
    {
        cf = mock(CellFactory.class);
        
    }
}
