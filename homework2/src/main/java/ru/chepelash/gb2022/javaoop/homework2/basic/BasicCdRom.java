package ru.chepelash.gb2022.javaoop.homework2.basic;

import ru.chepelash.gb2022.javaoop.homework2.abstractClasses.AbstractCdRom;

import java.util.NoSuchElementException;

public class BasicCdRom extends AbstractCdRom {
    private final String TEST_DATA = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Sodales ut etiam sit amet nisl purus in. Nibh cras pulvinar mattis nunc sed. Pretium quam vulputate dignissim suspendisse in est. Augue neque gravida in fermentum et sollicitudin ac orci phasellus. Eget dolor morbi non arcu risus quis varius quam quisque. Donec ultrices tincidunt arcu non sodales neque sodales ut etiam. Cras sed felis eget velit aliquet sagittis id. Porttitor rhoncus dolor purus non. Adipiscing elit pellentesque habitant morbi tristique senectus et.\n" +
            "\n" +
            "Quam lacus suspendisse faucibus interdum. Quisque egestas diam in arcu cursus euismod quis viverra. Ac felis donec et odio pellentesque diam volutpat commodo sed. Enim tortor at auctor urna nunc id. Luctus accumsan tortor posuere ac ut consequat. Nunc sed augue lacus viverra vitae congue. Nulla at volutpat diam ut venenatis. Nisi quis eleifend quam adipiscing vitae. Fermentum et sollicitudin ac orci phasellus. Eu tincidunt tortor aliquam nulla facilisi cras fermentum odio. Pulvinar elementum integer enim neque volutpat.\n" +
            "\n" +
            "Nisl vel pretium lectus quam id leo. Et netus et malesuada fames. Ultrices sagittis orci a scelerisque purus semper eget duis. Eget sit amet tellus cras adipiscing enim eu turpis. Quis eleifend quam adipiscing vitae proin sagittis nisl. Dictum at tempor commodo ullamcorper a lacus vestibulum. Urna cursus eget nunc scelerisque viverra mauris in aliquam. Aliquam eleifend mi in nulla posuere sollicitudin aliquam. Non sodales neque sodales ut etiam sit amet nisl purus. Nibh ipsum consequat nisl vel pretium lectus quam id. Nunc id cursus metus aliquam eleifend mi in nulla. Mauris sit amet massa vitae tortor condimentum lacinia quis vel. Pulvinar mattis nunc sed blandit libero. Adipiscing enim eu turpis egestas pretium aenean pharetra. Congue eu consequat ac felis donec et odio. In hendrerit gravida rutrum quisque non. Mauris vitae ultricies leo integer.\n" +
            "\n" +
            "Sem viverra aliquet eget sit amet tellus cras. Tristique nulla aliquet enim tortor at auctor urna nunc. Suspendisse in est ante in nibh mauris cursus. In aliquam sem fringilla ut. Bibendum enim facilisis gravida neque convallis. Aliquam ut porttitor leo a diam sollicitudin. Magna ac placerat vestibulum lectus mauris ultrices eros in cursus. Id venenatis a condimentum vitae sapien. Ultrices sagittis orci a scelerisque purus semper eget. Eu turpis egestas pretium aenean pharetra magna ac placerat. Viverra tellus in hac habitasse. Fames ac turpis egestas maecenas. Proin sagittis nisl rhoncus mattis rhoncus.\n" +
            "\n" +
            "Quam quisque id diam vel quam elementum pulvinar. Vitae elementum curabitur vitae nunc sed velit. Elit duis tristique sollicitudin nibh. Ultricies lacus sed turpis tincidunt id aliquet risus. Sit amet aliquam id diam maecenas ultricies. Nulla facilisi morbi tempus iaculis urna id volutpat lacus laoreet. Rhoncus mattis rhoncus urna neque viverra justo nec ultrices dui. Sed ullamcorper morbi tincidunt ornare massa eget egestas purus viverra. Mauris a diam maecenas sed. Tellus in metus vulputate eu. Nulla malesuada pellentesque elit eget gravida cum. Ac turpis egestas maecenas pharetra convallis posuere. Et netus et malesuada fames. Faucibus purus in massa tempor nec feugiat nisl pretium. Gravida arcu ac tortor dignissim convallis aenean et tortor. Sagittis nisl rhoncus mattis rhoncus urna. Habitasse platea dictumst vestibulum rhoncus est pellentesque elit. Sed risus pretium quam vulputate. Commodo ullamcorper a lacus vestibulum sed arcu non odio euismod.\n" +
            "\n" +
            "Aliquet nibh praesent tristique magna sit. Semper feugiat nibh sed pulvinar proin gravida hendrerit. Libero volutpat sed cras ornare. Nec ultrices dui sapien eget. Egestas purus viverra accumsan in nisl nisi scelerisque eu ultrices. Ultrices sagittis orci a scelerisque purus semper eget duis at. Pellentesque habitant morbi tristique senectus. Tempor nec feugiat nisl pretium fusce. Pretium viverra suspendisse potenti nullam. Viverra tellus in hac habitasse platea dictumst. Et malesuada fames ac turpis egestas maecenas pharetra convallis posuere. Diam quam nulla porttitor massa id neque. Interdum velit laoreet id donec ultrices tincidunt arcu non sodales. Sit amet dictum sit amet justo donec enim diam. Facilisis leo vel fringilla est. Eu scelerisque felis imperdiet proin fermentum leo vel orci porta. Tellus pellentesque eu tincidunt tortor aliquam. Nunc non blandit massa enim nec dui nunc mattis enim. Risus at ultrices mi tempus imperdiet nulla malesuada. Velit scelerisque in dictum non consectetur.\n" +
            "\n" +
            "Nunc mattis enim ut tellus elementum. Amet consectetur adipiscing elit pellentesque. In est ante in nibh mauris cursus mattis. Sit amet purus gravida quis blandit turpis cursus in. Vitae turpis massa sed elementum tempus egestas. Quam pellentesque nec nam aliquam sem et. Massa tincidunt dui ut ornare lectus sit amet est. Auctor augue mauris augue neque. Aliquam ut porttitor leo a diam sollicitudin tempor id. Enim tortor at auctor urna. Et odio pellentesque diam volutpat commodo.\n" +
            "\n" +
            "Nullam vehicula ipsum a arcu cursus vitae congue mauris. Blandit cursus risus at ultrices mi tempus imperdiet nulla. Eu facilisis sed odio morbi. Leo vel orci porta non. Porttitor rhoncus dolor purus non enim. Molestie nunc non blandit massa enim. Iaculis nunc sed augue lacus viverra vitae. Aliquam malesuada bibendum arcu vitae elementum. Id semper risus in hendrerit gravida. Purus gravida quis blandit turpis cursus in hac habitasse platea. Amet facilisis magna etiam tempor orci eu. Ut lectus arcu bibendum at. Integer vitae justo eget magna fermentum iaculis. Feugiat vivamus at augue eget arcu dictum varius duis.\n" +
            "\n" +
            "Tincidunt eget nullam non nisi. Duis ultricies lacus sed turpis tincidunt. Luctus venenatis lectus magna fringilla urna. At risus viverra adipiscing at in tellus integer feugiat. Viverra nibh cras pulvinar mattis. Adipiscing elit pellentesque habitant morbi tristique senectus et netus et. Tristique senectus et netus et malesuada fames ac turpis egestas. Cursus in hac habitasse platea. At tellus at urna condimentum. Eget nulla facilisi etiam dignissim diam. Proin libero nunc consequat interdum varius. Lacus sed viverra tellus in hac habitasse platea. Egestas sed sed risus pretium quam vulputate. At quis risus sed vulputate odio ut enim blandit volutpat. Urna nec tincidunt praesent semper feugiat. Enim sit amet venenatis urna cursus eget nunc scelerisque.\n" +
            "\n" +
            "Elementum pulvinar etiam non quam. In ante metus dictum at tempor. Sapien nec sagittis aliquam malesuada bibendum arcu vitae. In pellentesque massa placerat duis ultricies lacus sed. Urna et pharetra pharetra massa massa ultricies mi. Augue interdum velit euismod in. Ut porttitor leo a diam sollicitudin tempor id. Libero justo laoreet sit amet cursus sit amet dictum sit. Adipiscing diam donec adipiscing tristique risus nec feugiat. Mattis pellentesque id nibh tortor id. Neque vitae tempus quam pellentesque nec. Et malesuada fames ac turpis egestas maecenas pharetra.";
    private int readPointer;
    public BasicCdRom(boolean isCanWrite, boolean isWorkingWithDvd, boolean isWorkingWithBlueray) {
        super(isCanWrite, isWorkingWithDvd, isWorkingWithBlueray);
        readPointer = 0;
    }
    public BasicCdRom(){
        this(false, false, false);
    }

    @Override
    public String readData(int dataLength) throws NoSuchElementException {
        if(!super.isDiskInserted()){
            throw new NoSuchElementException("No disk inserted");
        }
        StringBuilder result = new StringBuilder();
        int endPointer = readPointer + dataLength;
        if(endPointer > TEST_DATA.length()){
            result.append(TEST_DATA.substring(readPointer));
            result.append(TEST_DATA, 0, endPointer - TEST_DATA.length());
            readPointer = endPointer - TEST_DATA.length();
        } else {
            result.append(TEST_DATA, readPointer, endPointer);
            readPointer = endPointer;
        }
        return result.toString();
    }

    @Override
    public void writeData(String data) throws IllegalCallerException, UnsupportedOperationException{
        if(!isDiskInserted()){
            throw new IllegalCallerException("Disk is not inserted");
        } else if (!isCanWrite()) {
            throw new UnsupportedOperationException("CdRom cannot write");
        }
        System.out.println("Data wrote success");
    }

    @Override
    public void insertDisk(String diskName, String diskType) throws UnsupportedOperationException, IllegalArgumentException{
        switch (diskType){
            case "BlueRay":
                if(!isWorkingWithBlueray()){
                    throw new UnsupportedOperationException("CdRom Cannot work with BlueRay");
                }
            case "DVD":
                if(!isWorkingWithDvd()){
                    throw new UnsupportedOperationException("CdRom Cannot work with DVD");
                }
            case "CD":
                break;
            default:
                throw new IllegalArgumentException("Unsupported disk Type");
        }
        setDiskName(diskName);
        setDiskInserted(true);
        System.out.println("Disk inserted");
    }

    @Override
    public void ejectDisk() {
        if(!isDiskInserted()){
            System.out.println("No disk in CdRom");
            return;
        }
        setDiskName("");
        setDiskInserted(false);
        System.out.println("Disk ejected");
    }

    @Override
    public boolean isCanWrite() {
        return super.isCanWrite();
    }

    @Override
    public boolean isWorkingWithDvd() {
        return super.isWorkingWithDvd();
    }

    @Override
    public boolean isWorkingWithBlueray() {
        return super.isWorkingWithBlueray();
    }
}
