import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorTest {

    @Test
    public void bereken_normaal(){

        int resultaat = Calculator.bereken(4,5);

        assertThat(resultaat,is(9));
    }

    @Test
    public void bereken_met_1negatief_getal(){

        int resultaat = Calculator.bereken(-4,5);

        assertThat(resultaat,is(1));
    }

    @Test
    public void bereken_met_2negatieve_getallen(){

        int resultaat = Calculator.bereken(-4,-5);

        assertThat(resultaat,is(-9));
    }

}
