//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CPU cpu = new CPU();
        CPU.Processor processor = new CPU.Processor();
        CPU.RAM ram = new CPU.RAM();

        processor.process();
        ram.process();

        MotherBoard motherBoard = new MotherBoard();
        MotherBoard.USB usb = new MotherBoard.USB();

        usb.open();


    }
}
