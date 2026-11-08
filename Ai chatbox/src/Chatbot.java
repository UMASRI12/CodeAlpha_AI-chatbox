import java.time.LocalDate;
import java.time.LocalTime;

public class Chatbot {
    public String getResponse(String input) {
        String message = input.toLowerCase().trim();
        if (message.isEmpty()) return "Please enter a message.";

        if (message.matches(".*\\b(hi|hello|hey)\\b.*")) {
            return "Hello! How can I help you?";
        }
        if (message.contains("your name")) return "I am JavaBot, your virtual assistant.";
        if (message.contains("how are you")) return "I am doing great! How can I help you?";
        if (message.contains("machine learning")) {
            return "Machine Learning enables computers to learn patterns from data.";
        }
        if (message.contains("java")) return "Java is an object-oriented programming language.";
        if (message.contains("python")) return "Python is widely used in automation, data science, AI and ML.";
        if (message.contains("date")) return "Today's date is " + LocalDate.now() + ".";
        if (message.contains("time")) return "Current time is " + LocalTime.now().withNano(0) + ".";
        if (message.contains("thank")) return "You're welcome!";
        if (message.matches(".*\\b(bye|goodbye)\\b.*")) return "Goodbye! Have a nice day.";
        return "Sorry, I don't understand that yet. Try asking about Java, Python or machine learning.";
    }
}
