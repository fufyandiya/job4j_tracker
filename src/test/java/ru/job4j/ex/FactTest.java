package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNumberBelowZero() {
        new Fact().calc(-1);
    }

    @Test()
    public void whenNumberAboveZero() {
        int rsl = new Fact().calc(3);
        assertThat(rsl, is(6));
    }
}