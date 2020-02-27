package me.study.legoblocks;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LegoBlocksTest {

    private int inputRow;

    private int inputColumn;

    private int expected;

    @Before
    public void setUp() {
        inputRow = 4;
        inputColumn = 4;
        expected = 3375;
    }

    @Test
    public void legoBlocks() {
        int actual = LegoBlocks.legoBlocks(4, 4);
        Assertions.assertThat(actual).isEqualTo(3375);
    }
}