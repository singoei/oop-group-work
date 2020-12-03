import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Genres extends Application {
    
    @Override
    public void start(Stage stage) {

        //step 1: create label Name
        Text text1 = new Text("Name:");

        //step 2: create label registered
        Text text2 = new Text("Registered:");

        //step 3: create text filed for name
        TextField textField1 = new TextField();

        //step 4: create combo box for registered
        ComboBox comboBox = new ComboBox();
         //Populate combobox options
        comboBox.getItems().addAll(
            "Registered 1",
            "Registered 2",
            "Registered 3"  
        );
       

        //step 5: create buttons
        Button button1 = new Button("Save");
        Button button2 = new Button("Remove");
        

        //step 6: creating a grid pane and import relevant classes
        GridPane gridPane = new GridPane();

        //step 7: set up size for the pane
        gridPane.setMinSize(600, 400);

        //step 8: Set padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //step 9: Set the vertical and horizontal gaps between the columns
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        //step 10: Set Grid alignment
        gridPane.setAlignment(Pos.CENTER);

        //step 11: Arrange all the nodes in the grid
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(button1, 1, 1);

        gridPane.add(text2, 0, 2);
        gridPane.add(comboBox, 1, 2);

        gridPane.add(button2, 1, 3);
        
        //step 12: style nodes
        //button1.setStyle("-fx-background-color; skyblue; -fx-text-fill: white; -fx-font: normal bold 15px;");
        //button2.setStyle("-fx-background-color; skyblue; -fx-text-fill: white; -fx-font: normal bold 15px;");


        text1.setStyle("-fx-font: normal bold 20px 'serif' ");
        text2.setStyle("-fx-font: normal bold 20px 'serif' ");
        gridPane.setStyle("-fx-background-color: Beige;");
        
         //setting the dimensions of the comboBox
        comboBox.setMinSize(150,20);
        button1.setMinSize(150,20);
        button2.setMinSize(150,20);
        
        //creating a scene object
        Scene scene = new Scene(gridPane);
        
        //setting title for the stage
        stage.setTitle("Genres");
        
        //adding scene to the stage
        stage.setScene(scene);
       
        //displaying he contents of the stage
        stage.show();
        
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}

    

