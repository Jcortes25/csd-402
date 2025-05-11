import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample extends Application {
    @Override
    public void start(Stage stage) {
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(15));
        vbox.setAlignment(Pos.CENTER);

        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        vbox.getChildren().addAll(btn1, btn2, btn3);

        Scene scene = new Scene(vbox, 200, 150);
        stage.setTitle("VBox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
