package flashcards;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FlashcardApp extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello, Ashesi!");
        Button button = new Button("Click me");

        button.setOnAction(event -> label.setText("You clicked the button"));

        VBox root = new VBox(10, label, button);
        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Local Language Flashcard Trainer");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}