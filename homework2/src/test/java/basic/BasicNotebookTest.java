package basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicNotebookTest {
    private BasicNotebook notebook;
    private BasicCdRom cdRom;
    private BasicKeyboard keyboard;
    private BasicWifiModule wifiModule;
    @BeforeEach
    void setUp(){
        cdRom = new BasicCdRom();
        keyboard = new BasicKeyboard();
        wifiModule = new BasicWifiModule();
        notebook = new BasicNotebook("V1", "LG", cdRom, keyboard, wifiModule);
    }

    @Test
    void workingTest(){
        assertFalse(notebook.isWorking());
        notebook.turnOff();
        notebook.turnOn();
        notebook.disconnectFromNetwork();
        notebook.connectToNetwork("Wifi");
        notebook.disconnectFromNetwork();
        notebook.connectToNetwork("Wifi");
        notebook.connectToNetwork("Wifi");
        notebook.insertDisk("Movie", "DVD");
        notebook.insertDisk("Movie", "BlueRay");
        notebook.insertDisk("Movie", "CD");
        notebook.writeData("Unsupported");
        System.out.println(notebook.readData(10));
        System.out.println(notebook.readData(10));
        System.out.println(notebook.readData(8000));
        System.out.println(notebook.readData(3000));
        notebook.ejectDisk();
        notebook.readData(10);

        notebook.clickKeyboard();
    }
}