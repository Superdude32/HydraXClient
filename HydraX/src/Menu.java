public class Menu {
    private boolean open = false;

    public void toggleMenu() {
        open = !open;
        if (open) {
            displayMenu();
        }
    }

    private void displayMenu() {
        // Display hack categories and options
    }
}
