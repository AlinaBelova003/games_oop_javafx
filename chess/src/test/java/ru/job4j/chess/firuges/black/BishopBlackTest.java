package ru.job4j.chess.firuges.black;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;

public class BishopBlackTest {


    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell cell = bishopBlack.position();
        bishopBlack.position();
        assertEquals(bishopBlack.position(), Cell.A1);
    }

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] cell = bishopBlack.way(Cell.G5);
    }

    @Test
    public void isDiagonal() {
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        assertEquals((bishopBlack.copy(Cell.B2)).position(), Cell.B2);
    }
}