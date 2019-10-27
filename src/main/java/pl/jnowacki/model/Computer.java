package pl.jnowacki.model;

public class Computer {
    private Keyboard keyboard;
    private Screen screen;
    private Printer printer;

    public Computer(Keyboard keyboard, Screen screen, Printer printer) {
        this.keyboard = keyboard;
        this.screen = screen;
        this.printer = printer;
    }

    public void readValueFromKeyboardAndPrintToPrinterWithAllCaps(){
        String inputFromKeyboard = keyboard.readValue();
        printer.print(inputFromKeyboard.toUpperCase());
    }

    public void readValueFromKeyboardAndDisplayInputToBothPrinterAndScreen(){
        String inputFromKeyboard = keyboard.readValue();
        printer.print(inputFromKeyboard);
        screen.showMessage(inputFromKeyboard);
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
}
