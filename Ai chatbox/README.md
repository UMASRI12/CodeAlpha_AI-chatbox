# JavaBot - Rule-Based Chatbot

A simple Java Swing chatbot that answers using keyword matching. It does not train a machine-learning model or call any generative AI service.

## Features
- Chat window with message history and a Send button (Enter also sends)
- Responds to greetings, name, "how are you", Java, Python, machine learning, current date, current time, thanks and goodbye
- Friendly fallback reply for unrecognised input

## Tech Stack
- Java 17+
- Swing / AWT (GUI)
- `java.time` for date and time replies

## Project Structure
```
AIChatbot/
└── src/
    ├── Main.java        # Entry point (launches the GUI)
    ├── ChatbotGUI.java  # Swing chat window
    └── Chatbot.java     # Rule-based response logic
```

## Requirements
- JDK 17 or later

## How to Run
From the `AIChatbot` folder:
```bash
javac -d out src/*.java
java -cp out Main
```

## Example Questions
- `hello`
- `what is your name`
- `tell me about java`
- `what is machine learning`
- `what is the date` / `what is the time`

## Notes
- Matching is by keyword, so replies are limited to the built-in rules.
- Possible extensions: more rules, regex intents, a knowledge file, or a real NLP/LLM API.
