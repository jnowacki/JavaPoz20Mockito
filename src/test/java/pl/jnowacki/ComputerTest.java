package pl.jnowacki;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import pl.jnowacki.model.Computer;
import pl.jnowacki.model.Keyboard;
import pl.jnowacki.model.Printer;
import pl.jnowacki.model.Screen;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ComputerTest {

    @Mock
    private Printer printer;

    @Mock
    private Screen screen;

    @Mock
    private Keyboard keyboard;

    @InjectMocks
    private Computer computer;

    @Test
    public void testReadAndPrint() {
//        given
        String valueFromKeyboard = "asd";
        String expectedPrintedValue = "ASD";

        when(keyboard.readValue()).thenReturn(valueFromKeyboard);

//        when
        computer.readValueFromKeyboardAndPrintToPrinterWithAllCaps();

//        then
        Mockito.verify(printer, times(1)).print(expectedPrintedValue);
    }
}
