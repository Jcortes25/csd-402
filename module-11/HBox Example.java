import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxExample extends Application {
    @Override
    public void start(Stage stage) {
        HBox hbox = new HBox(10);
        hbox.setPadding(new Insets(15));
        hbox.setAlignment(Pos.CENTER);

        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        hbox.getChildren().addAll(btn1, btn2, btn3);

        Scene scene = new Scene(hbox, 300, 100);
        stage.setTitle("HBox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
