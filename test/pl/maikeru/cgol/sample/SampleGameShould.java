package pl.maikeru.cgol.sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SampleGameShould {
    private SampleGame game;
    @Test
    public void hasSquareSizeSetInConstructor()
    {
        SampleGame game = new SampleGame(2);
        Object[][] gameArray = game.asArray();
        assertEquals(2, gameArray.length);
        assertEquals(2, gameArray[0].length);
        assertEquals(2, gameArray[1].length);
    }

    @Test
    public void hasSquareSizeSetInConstructor2()
    {
        SampleGame game = new SampleGame(1);
        Object[][] gameArray = game.asArray();
        assertEquals(1, gameArray.length);
        assertEquals(1, gameArray[0].length);
    }

    @Test
    public void returnArrayWithBooleanValuesRepresentingCells()
    {
        Boolean[][] gameArray = game.asArray();
    }

    @Test
    public void haveFieldsSetToFalseByDefault()
    {
        assertEquals(false, game.asArray()[0][0]);
    }

    @Before
    public void setUp()
    {
        game = new SampleGame(1);
    }

}
