import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ChatbotGUI app = new ChatbotGUI();
            app.setVisible(true);
        });
    }
}
