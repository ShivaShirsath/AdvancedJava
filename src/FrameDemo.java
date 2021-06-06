package src;

import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class FrameDemo extends Frame {
    FrameDemo(String name){
        setSize(200, 100);
        addWindowListener(new WindowListener() {
            @Override public void windowOpened(WindowEvent windowEvent) {
                System.out.println(name + " Opened.");
            }
            @Override public void windowClosing(WindowEvent windowEvent) {
                System.out.println(name + " Closing...");
                dispose();
            }
            @Override public void windowClosed(WindowEvent windowEvent) {
                System.out.println(name + " Closed.");
            }
            @Override public void windowIconified(WindowEvent windowEvent) {
                System.out.println(name + " Iconified.");
            }
            @Override public void windowDeiconified(WindowEvent windowEvent) {
                System.out.println(name + " Deiconified.");
            }
            @Override public void windowActivated(WindowEvent windowEvent) {
                System.out.println(name + " Activated.");
            }
            @Override public void windowDeactivated(WindowEvent windowEvent) {
                System.out.println(name + " Deactivated.");
            }
        });
        setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x - getSize().width / 2, GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y - getSize().height / 2);
    }
}