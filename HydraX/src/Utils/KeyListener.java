import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListener implements KeyListener {
    private Menu menu;

    public KeyListener(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT_CONTROL) {
            menu.toggleMenu();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}
}
