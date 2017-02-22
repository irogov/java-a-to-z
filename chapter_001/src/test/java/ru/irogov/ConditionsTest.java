package ru.irogov;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConditionsTest {

    @Test
    public void whenMaxReturnMax
	{
	    assertThat(max(1,2), is(2));
	}

}
