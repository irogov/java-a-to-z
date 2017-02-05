package Calculator;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalculatorTest
{
    @Test
    public void whenSumReturnSum()
    {
         final Calculator calc = new Calculator();
         calc.sum(1,1);
         final double result = calc.getResult();
         assertThat(result, is(2d));
    }
}


