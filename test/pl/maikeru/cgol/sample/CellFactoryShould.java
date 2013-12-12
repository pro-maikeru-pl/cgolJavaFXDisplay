/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.maikeru.cgol.sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maikeru
 */
public class CellFactoryShould {
    
    @Test
    public void returnNewDeadCell() {
        CellFactory cf = new CellFactory();

        Cell c = cf.createDead();

        assertEquals(false, c.isAlive());
    }

}
