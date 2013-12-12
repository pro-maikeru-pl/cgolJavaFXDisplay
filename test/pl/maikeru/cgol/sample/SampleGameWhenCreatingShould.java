package pl.maikeru.cgol.sample;

import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SampleGameWhenCreatingShould {
    private SampleGame game;
    private CellFactory cf = mock(CellFactory.class);

    @Test
    public void createOnePlaceWhenOnePlaceInstructionPassedInConstructor()
    {
        game = new SampleGame(1, cf);
        Object[][] gameArray = game.toArray();

        assertEquals(1, gameArray.length);
        assertEquals(1, gameArray[0].length);
    }

    @Test
    public void createSquaredNumberOfPlacesPassedInConstructor() {
        game = new SampleGame(2, cf);
        Object[][] gameArray = game.toArray();

        assertEquals(2, gameArray.length);
        assertEquals(2, gameArray[0].length);
        assertEquals(2, gameArray[1].length);
    }

    @Test
    public void haveFieldsSetToFalseByDefault() {
        game = new SampleGame(1, cf);

        assertEquals(false, game.toArray()[0][0]);
    }

    @Test
    public void createOneDeadCellUsingCellFactoryIfOneGameWithPlace() {
        game = new SampleGame(1, cf);

        verify(cf).createDead();
    }

    @Test
    public void createSquaredNumberOfDeadCellsUsingCellFactoryWhenGameWithManyPlaces() {
        game = new SampleGame(3, cf);

        verify(cf, times(9)).createDead();
    }

    @Before
    public void setUp()
    {
        when(cf.createDead()).thenReturn(new Cell(false));
    }
}
