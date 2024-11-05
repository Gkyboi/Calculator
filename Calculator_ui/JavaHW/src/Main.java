import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        final calcFrame frame = new calcFrame();
        frame.setVisible(true);
        ImageIcon icon = new ImageIcon("calc.png");
        frame.setIconImage(icon.getImage());
        frame.setSize(1200,800);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}