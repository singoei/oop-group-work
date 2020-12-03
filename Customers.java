import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Customers extends Application{
     @Override
    public void start(Stage stage) {
     
        //step 1: create label Genre
        Text text1 = new Text("Name:");
       
        //step 2: create label Phone
        Text text2 = new Text("Phone:");
        
        //step 3: create label Registered
        Text text3 = new Text("Email:");
        
        //step 4: create label Registered
        Text text4 = new Text("Registered:");
        
        //step 5: create text field for name
        TextField textField1 = new TextField();
        
        //step 6 create text field for registered
        TextField textField2 = new TextField();
        
        //step 7 create text field for registered
        TextField textField3 = new TextField();
        

        //step 8: create combo box for registered
        ComboBox comboBox = new ComboBox();
        
        //Populate combobox options
        comboBox.getItems().addAll(
            "Registered 1",
            "Registered 2",
            "Registered 3"  
        );

        //step 9: create buttons
        Button button1 = new Button("Save Customer");
        Button button2 = new Button("Remove Customer");

        //step 10: creating a grid pane and import relevant classes
        GridPane gridPane = new GridPane();

        //step 11: set up size for the pane
        gridPane.setMinSize(600, 400);

        //step 12: Set padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //step 13: Set the vertical and horizontal gaps between the columns
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        //step 14: Set Grid alignment
        gridPane.setAlignment(Pos.CENTER);

        //step 15: Arrange all the nodes in the grid
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);

        gridPane.add(text2, 0, 1);
        gridPane.add(textField2, 1, 1);
        
         gridPane.add(text3, 0, 2);
        gridPane.add(textField3, 1, 2);

        gridPane.add(button1, 1, 3);
     
        gridPane.add(text4, 0, 4);
        gridPane.add(comboBox, 1, 4);
        
        gridPane.add(button2, 1, 5);

        text1.setStyle("-fx-font: normal bold 20px 'serif' ");
        text2.setStyle("-fx-font: normal bold 20px 'serif' ");
        text3.setStyle("-fx-font: normal bold 20px 'serif' ");
        text4.setStyle("-fx-font: normal bold 20px 'serif' ");
        gridPane.setStyle("-fx-background-color: Beige;");
        
        //setting the dimensions of the comboBox
        comboBox.setMinSize(150,20);
        button1.setMinSize(150,20);
        button2.setMinSize(150,20);
        
        //creating a scene object
        Scene scene = new Scene(gridPane);
        
        //setting title for the stage
        stage.setTitle("CUSTOMERS");
        
        //adding scene to the stage
        stage.setScene(scene);
       
        //displaying he contents of the stage
        stage.show();
        
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}





