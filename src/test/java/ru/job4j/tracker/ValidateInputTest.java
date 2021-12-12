package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"2"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Edit item:");
        assertThat(selected, is(2));
    }

    @Test
    public void whenManyValidInputs() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "test", "1", "5"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Add item:");
        assertThat(selected, is(0));
        selected = input.askInt("Show items:");
        assertThat(selected, is(1));
        selected = input.askInt("Enter name::");
        assertThat(selected, is(5));
    }

    @Test
    public void whenNegativeInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-2"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Wrong number:");
        assertThat(selected, is(-2));
    }
}