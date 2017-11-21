import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.spy;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

    private MathApplication mathApplication;
    private CalculatorService calcService;

    @Before
    public void setUp(){
        mathApplication = new MathApplication();
        Calculator calculator = new Calculator();
        calcService = spy(calculator);
        mathApplication.setCalculatorService(calcService);
    }

    @Test
    public void testAdd(){

        //perform operation on real object
        //test the add functionality
        Assert.assertEquals(mathApplication.add(20.0, 10.0),30.0,0);
    }
    @Test
    public void testSubtract(){

        //perform operation on real object
        //test the add functionality
        Assert.assertEquals(mathApplication.subtract(20.0, 10.0),30.0,0);
    }
    @Test
    public void testDivide(){

        //perform operation on real object
        //test the add functionality
        Assert.assertEquals(mathApplication.divide(20.0, 10.0),30.0,0);
    }
    @Test
    public void testMultiply(){

        //perform operation on real object
        //test the add functionality
        Assert.assertEquals(mathApplication.multiply(20.0, 10.0),30.0,0);
    }

    class Calculator implements CalculatorService {
        @Override
        public double add(double input1, double input2) {
            return input1 + input2;
        }

        @Override
        public double subtract(double input1, double input2) {
            return input1 - input2;
        }

        @Override
        public double multiply(double input1, double input2) {
            return input1 * input2;
        }

        @Override
        public double divide(double input1, double input2) {
            return input1 / input2;
        }
    }
}