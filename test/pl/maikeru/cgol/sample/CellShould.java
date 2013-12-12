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
public class CellShould {

    @Test
    public void beAbleToBeCreatedAsDead() {
        Cell cell = new Cell(false);

        assertEquals(false, cell.isAlive());
    }

    @Test
    public void beAbleToBeCreatedAsAlive() {
        Cell cell = new Cell(true);

        assertEquals(true, cell.isAlive());
    }
}
