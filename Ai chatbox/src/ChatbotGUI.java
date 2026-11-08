import javax.swing.*;
import java.awt.*;

public class ChatbotGUI extends JFrame {
    private final Chatbot chatbot = new Chatbot();
    private final JTextArea chatArea = new JTextArea();
    private final JTextField inputField = new JTextField();

    public ChatbotGUI() {
        setTitle("JavaBot - Rule-Based Chatbot");
        setSize(620, 520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(8, 8));

        chatArea.setEditable(false);
        chatArea.setLineWrap(true);
        chatArea.setWrapStyleWord(true);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 15));
        chatArea.setText("JavaBot: Hello! Welcome to JavaBot. Ask me about Java, Python or machine learning.\n\n");

        JButton sendButton = new JButton("Send");
        JPanel bottom = new JPanel(new BorderLayout(6, 6));
        bottom.setBorder(BorderFactory.createEmptyBorder(6, 8, 8, 8));
        bottom.add(inputField, BorderLayout.CENTER);
        bottom.add(sendButton, BorderLayout.EAST);

        add(new JScrollPane(chatArea), BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);
        sendButton.addActionListener(e -> sendMessage());
        inputField.addActionListener(e -> sendMessage());
        setLocationRelativeTo(null);
    }

    private void sendMessage() {
        String message = inputField.getText().trim();
        if (message.isEmpty()) return;
        chatArea.append("You: " + message + "\n");
        chatArea.append("JavaBot: " + chatbot.getResponse(message) + "\n\n");
        inputField.setText("");
    }
}
