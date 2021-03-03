import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * This method was abstract in the Application class.  This
     * is where we define what we want the application to do when
     * it starts.
     *
     *In our case, we want our application to load the fxml file called
     * cardView.fxml
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("views/cardView.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Single Card View");
        stage.show();
    }
}
