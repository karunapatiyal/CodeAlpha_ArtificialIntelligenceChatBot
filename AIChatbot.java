import java.util.Scanner;

public class AIChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userInput;

        System.out.println("AI Chatbot: Hello! How can I help you today?");
        System.out.println("Type 'bye' to exit.");

        while(true) {

            System.out.print("You: ");
            userInput = sc.nextLine().toLowerCase();

            if(userInput.contains("hello") || userInput.contains("hi")) {
                System.out.println("Bot: Hello! Nice to meet you.");
            }

            else if(userInput.contains("how are you")) {
                System.out.println("Bot: I am just a program, but I am doing great!");
            }

            else if(userInput.contains("your name")) {
                System.out.println("Bot: I am a Java AI Chatbot.");
            }

            else if(userInput.contains("java")) {
                System.out.println("Bot: Java is a powerful programming language used for building applications.");
            }

            else if(userInput.contains("help")) {
                System.out.println("Bot: I can answer questions about programming and general greetings.");
            }

            else if(userInput.contains("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day.");
                break;
            }

            else {
                System.out.println("Bot: Sorry, I don't understand that yet.");
            }
        }

        sc.close();
    }
}