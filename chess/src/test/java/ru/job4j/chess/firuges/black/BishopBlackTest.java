package ru.job4j.chess.firuges.black;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;
import static sun.nio.cs.Surrogate.is;

public class BishopBlackTest {


    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell cell = bishopBlack.position();
        bishopBlack.position();
        assertArrayEquals(bishopBlack.position(), is(Cell.A1));
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
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        logic.add(new BishopBlack(Cell.A2));

    }
}