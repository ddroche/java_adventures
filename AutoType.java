import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.Thread;
import java.lang.Runtime;
import java.io.IOException;
import java.lang.InterruptedException;
import java.awt.AWTException;



class AutoType {



    public static void main(String[] arguments) throws InterruptedException, AWTException, IOException {

        // try{
        //     Runtime.getRuntime().exec("Notepad.exe");
        // }catch(IOException e){
        //     e.printStackTrace();
        // }

        Runtime.getRuntime().exec("Notepad.exe");

        Thread.sleep(1000);
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_I);
        Thread.sleep(100);
        r.keyPress(KeyEvent.VK_SPACE);
        Thread.sleep(100);
        r.keyPress(KeyEvent.VK_L);
        Thread.sleep(100);
        r.keyPress(KeyEvent.VK_O);
        Thread.sleep(100);
        r.keyPress(KeyEvent.VK_V);
        Thread.sleep(100);
        r.keyPress(KeyEvent.VK_E);
        Thread.sleep(100);
        r.keyPress(KeyEvent.VK_SPACE);
        Thread.sleep(100);
        r.keyPress(KeyEvent.VK_Y);
        Thread.sleep(100);
        r.keyPress(KeyEvent.VK_O);
        Thread.sleep(100);
        r.keyPress(KeyEvent.VK_U);
        Thread.sleep(100);
        r.keyPress(KeyEvent.VK_SPACE);
        Thread.sleep(100);
        r.keyPress(KeyEvent.VK_K);
        Thread.sleep(100);
        r.keyPress(KeyEvent.VK_A);
        Thread.sleep(100);
        r.keyPress(KeyEvent.VK_T);
        Thread.sleep(100);
        r.keyPress(KeyEvent.VK_I);
        Thread.sleep(100);
        r.keyPress(KeyEvent.VK_E);

        
    }
}